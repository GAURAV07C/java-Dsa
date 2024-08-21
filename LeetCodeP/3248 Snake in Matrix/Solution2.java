import java.util.*;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
       int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i * n + j;
            }
        }
        int[] position = new int[] {0, 0};

        for (String command : commands) {
            if (command.equals("UP") && position[0] > 0) {
                position[0]--;
            } else if (command.equals("DOWN") && position[0] < n-1) {
                position[0]++;
            } else if (command.equals("LEFT") && position[1] > 0) {
                position[1]--;
            } else if (command.equals("RIGHT") && position[1] < n-1) {
                position[1]++;
            }
        }

        return matrix[position[0]][position[1]];
    }

    //  this test we add for testing  

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int n = 2;
        List<String> commands = Arrays.asList("RIGHT", "DOWN");
        System.out.println("Example 1: " + solution.finalPositionOfSnake(n, commands)); // Output: 3

        // Example 2
        n = 3;
        commands = Arrays.asList("DOWN", "RIGHT", "UP");
        System.out.println("Example 2: " + solution.finalPositionOfSnake(n, commands)); // Output: 1

        // Manual tests added
        // These tests have been added manually to verify the correctness of the solution
    }
}
