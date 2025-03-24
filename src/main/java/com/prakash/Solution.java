package com.prakash;
import java.util.*;

/*
You are working on an accounting program for an event's ticketing system.

At the end of the day, all the payments received from the payment gateway have to be matched with the users who bought the tickets. There is always a 1-to-1 match between the users and the payments.

Write a function that, given the payment, pricing, and user data, returns a data structure that links the names of the users to their payment IDs, based on the rules described below.

First, orders can be match by the users' emails. If the emails don't match, use the payment amounts. For each payment amount, there will be at most one payment that cannot be matched via the email.

For this problem, we can assume the names are unique.

Users:
---------------------------------------------------------
| Name        | Email            | Purchase  | Quantity |
---------------------------------------------------------
| John A.     |  john.a@mail.com | Top       |        3 |
| James S.    |     j.s@mail.com | Economy   |        2 |
| Stacy C.    | stacy.c@test.com | Economy   |        2 |
| Bobby B.    |     bob@mail.com | Medium    |       10 |
| Michelle X. |     mix@test.com | Medium    |       10 |
| Linda F.    |     l.f@mail.com | Top       |       10 |
| Betty T.    |     b.t@mail.com | ThreeEco  |        1 |
| Nancy L.    |     n.l@test.com | TwoEco    |        1 |
| Daniel O.   |     d.o@mail.com | OneEco    |        1 |
| Mike E.     |     m.e@mail.com | FourEco   |        1 |
| Matthew R.  |      mr@test.com | OneEco    |        5 |
| Albert K.   |  albert@test.com | OneEco    |        5 |
---------------------------------------------------------

Payment Gateway:
-----------------------------------
| ID | Email             | Amount |
-----------------------------------
|  1 |    john2@mail.com |     33 |
|  2 | michelle@mail.com |     60 |
|  4 |    james@mail.com |      8 |
|  3 |  stacy.c@test.com |      8 |
|  5 |      bob@mail.com |     60 |
|  6 |   email not found |    110 |
|  7 |   email not found |      1 |
|  8 |   email not found |      2 |
|  9 |   email not found |      3 |
| 99 |   email not found |      4 |
| 10 |       mr@test.com |      5 |
| 11 |        a@mail.com |      5 |
-----------------------------------

Ticket Prices:
--------------------
| Ticket   | Price |
--------------------
| Economy  |     4 |
| Top      |    11 |
| Medium   |     6 |
| OneEco   |     1 |
| TwoEco   |     2 |
| ThreeEco |     3 |
| FourEco  |     4 |
--------------------
*/

public class Solution {
    public static Map<Integer, String> matchPayments(String[][] users, String[][] payments, String[][] prices) {
        // Map to store ticket prices
        Map<String, Integer> priceMap = new HashMap<>();
        for (String[] price : prices) {
            priceMap.put(price[0], Integer.parseInt(price[1]));
        }

        // Map to link emails to user names
        Map<String, String> emailToName = new HashMap<>();
        // Final result mapping payment ID to user name
        Map<Integer, String> paymentIdToName = new HashMap<>();
        // Maps payment amounts to payment IDs
        Map<Integer, Integer> amountToPaymentId = new HashMap<>();
        // Stores unmatched payments
        Map<Integer, String> unmatchedPayments = new HashMap<>();
        // Maps purchase amounts to users
        Map<Integer, String> amountToUser = new HashMap<>();

        // Populate user information
        for (String[] user : users) {
            String name = user[0];
            String email = user[1];
            String ticketType = user[2];
            int quantity = Integer.parseInt(user[3]);
            int totalCost = priceMap.get(ticketType) * quantity;
            emailToName.put(email, name);
            amountToUser.put(totalCost, name);
        }

        // Process payments
        for (String[] payment : payments) {
            int id = Integer.parseInt(payment[0]);
            String email = payment[1];
            int amount = Integer.parseInt(payment[2]);

            // Match by email first
            if (emailToName.containsKey(email)) {
                paymentIdToName.put(id, emailToName.get(email));
            } else {
                unmatchedPayments.put(amount, email);
                amountToPaymentId.put(amount, id);
            }
        }

        // Match remaining payments by amount
        for (Map.Entry<Integer, String> entry : unmatchedPayments.entrySet()) {
            int amount = entry.getKey();
            if (amountToUser.containsKey(amount) && amountToPaymentId.containsKey(amount)) {
                paymentIdToName.put(amountToPaymentId.get(amount), amountToUser.get(amount));
            }
        }

        return paymentIdToName;
    }

    public static void main(String[] args) {
        String[][] users = {
                {"John A.", "john.a@mail.com", "Top", "3"},
                {"James S.", "j.s@mail.com", "Economy", "2"},
                {"Stacy C.", "stacy.c@test.com", "Economy", "2"},
                {"Bobby B.", "bob@mail.com", "Medium", "10"},
                {"Michelle X.", "mix@test.com", "Medium", "10"},
                {"Linda F.", "l.f@mail.com", "Top", "10"},
                {"Betty T.", "b.t@mail.com", "ThreeEco", "1"},
                {"Nancy L.", "n.l@test.com", "TwoEco", "1"},
                {"Daniel O.", "d.o@mail.com", "OneEco", "1"},
                {"Mike E.", "m.e@mail.com", "FourEco", "1"},
                {"Matthew R.", "mr@test.com", "OneEco", "5"},
                {"Albert K.", "albert@test.com", "OneEco", "5"}
        };

        String[][] payments = {
                {"1", "john2@mail.com", "33"},
                {"2", "michelle@mail.com", "60"},
                {"4", "james@mail.com", "8"},
                {"3", "stacy.c@test.com", "8"},
                {"5", "bob@mail.com", "60"},
                {"6", "email not found", "110"},
                {"7", "email not found", "1"},
                {"8", "email not found", "2"},
                {"9", "email not found", "3"},
                {"99", "email not found", "4"},
                {"10", "mr@test.com", "5"},
                {"11", "a@mail.com", "5"}
        };

        String[][] prices = {
                {"Economy", "4"},
                {"Top", "11"},
                {"Medium", "6"},
                {"OneEco", "1"},
                {"TwoEco", "2"},
                {"ThreeEco", "3"},
                {"FourEco", "4"}
        };

        Map<Integer, String> result = matchPayments(users, payments, prices);
        result.forEach((id, name) -> System.out.println(id + " -> " + name));
    }
}
