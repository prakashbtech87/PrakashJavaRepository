package com.prakash.ai;

/**
 * @author prakashkaruppusamy
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class OllamaChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ask something (or type 'exit' to quit): ");
            String question = scanner.nextLine();

            if (question.equalsIgnoreCase("exit") || question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye! 👋");
                break;
            }

            try {
                // Prepare request to Ollama local server
                URL url = new URL("http://localhost:11434/api/generate");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                // Request JSON payload
                String jsonInput = String.format(
                        "{\"model\": \"mistral\", \"prompt\": \"%s\"}", question.replace("\"", "\\\"")
                );

                // Send request
                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInput.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                // Read response
                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), "utf-8"))) {

                    StringBuilder responseBuilder = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        // Ollama streams multiple JSON lines
                        if (line.contains("\"response\"")) {
                            int start = line.indexOf("\"response\":\"") + 12;
                            int end = line.indexOf("\"", start);
                            String answer = line.substring(start, end);
                            System.out.print(answer);
                        }
                    }

                    System.out.println(); // line break after full answer
                }

                conn.disconnect();

            } catch (Exception e) {
                System.out.println("Error while connecting to Ollama: " + e.getMessage());
            }
        }

        scanner.close();
    }
}