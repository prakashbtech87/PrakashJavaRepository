import java.util.*;

public class CompetitiveGaming {

    /**
     * This method calculates how many players can level up based on scores and cutoff rank k.
     *
     * @param k      Cutoff rank – only players with rank ≤ k level up.
     * @param scores List of scores for each player.
     * @return Number of players who level up.
     */
    public static int numPlayers(int k, List<Integer> scores) {
        // Step 1: Sort scores in descending order
        Collections.sort(scores, Collections.reverseOrder());

        int rank = 1;           // Start with rank 1
        int levelUpCount = 0;   // Counter for players who qualify
        int prevScore = -1;     // Track previous score to assign ranks

        // Step 2: Traverse the scores
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);

            // Step 3: Stop if score is 0 (0-score players never qualify)
            if (score == 0) break;

            // Step 4: Assign rank based on score comparison
            if (score != prevScore) {
                rank = i + 1; // Only update rank when score changes
            }

            // Step 5: Count player if their rank is ≤ cutoff
            if (rank <= k) {
                levelUpCount++;
            } else {
                break; // No need to continue – rank exceeded k
            }

            prevScore = score; // Update for next loop iteration
        }

        return levelUpCount;
    }

    public static void main(String[] args) {
        // 🔸 Test Case 1: Example from prompt
        System.out.println("Test 1: " + numPlayers(3, Arrays.asList(100, 50, 50, 25)));
        // Ranks: 1, 2, 2, 4 → Players with rank 1,2,2 qualify → ✅ Output: 3

        // 🔸 Test Case 2: All players have same score
        System.out.println("Test 2: " + numPlayers(2, Arrays.asList(80, 80, 80, 80)));
        // All rank 1 → All qualify → ✅ Output: 4

        // 🔸 Test Case 3: All players have 0 score
        System.out.println("Test 3: " + numPlayers(3, Arrays.asList(0, 0, 0, 0)));
        // No player qualifies (score = 0) → ❌ Output: 0

        // 🔸 Test Case 4: Cutoff rank (k) is higher than total players
        System.out.println("Test 4: " + numPlayers(10, Arrays.asList(60, 50, 40, 30)));
        // Ranks: 1,2,3,4 → All ranks ≤ 10 → ✅ Output: 4

        // 🔸 Test Case 5: Some players score 0
        System.out.println("Test 5: " + numPlayers(3, Arrays.asList(90, 80, 80, 0, 0)));
        // Ranks: 1, 2, 2 → only 3 valid scores, all rank ≤ 3 → ✅ Output: 3

        // 🔸 Test Case 6: Only one player with a valid score
        System.out.println("Test 6: " + numPlayers(1, Arrays.asList(100, 0, 0, 0)));
        // Only 1 player with non-zero score → rank 1 ≤ k → ✅ Output: 1
    }
}