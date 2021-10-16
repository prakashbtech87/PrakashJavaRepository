package com.prakash.misc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieRating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            HashMap<String, List<Integer>> movieRatingMap = new HashMap<>();
            do {
                System.out.println("Enter Movie and Rating");

                String movieName = sc.next();
                Integer rating = Integer.parseInt(sc.next());
                List<Integer> ratingList = new ArrayList<>();
                if (movieRatingMap.get(movieName) != null) {
                    List<Integer> existingList = movieRatingMap.get(movieName);
                    existingList.add(rating);
                    movieRatingMap.put(movieName, existingList);
                } else {
                    ratingList.add(rating);
                    movieRatingMap.put(movieName, ratingList);
                }
                System.out.println("Do you want to continue ? Y/N");
            } while (!sc.next().equalsIgnoreCase("N") && sc.hasNextLine());

            HashMap<String, Double> movieAndAverage = new HashMap<>();

            for (Map.Entry<String, List<Integer>> entry : movieRatingMap.entrySet()) {

                String key = entry.getKey();
                List<Integer> values = entry.getValue();
                Double sum = 0.0;
                for (Integer i : values) {
                    sum += i;
                }
                movieAndAverage.put(key, sum / values.size());
            }

            for (Map.Entry<String, Double> entry : movieAndAverage.entrySet()) {
                System.out.println("Avg rating of " + entry.getKey() + "= " + entry.getValue());
            }

        } finally {
            sc.close();
        }
    }

}