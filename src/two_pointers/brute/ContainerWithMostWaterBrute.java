package two_pointers.brute;

/*
Problem: Container With Most Water

Brute Force Approach:
Check every possible pair of lines
and calculate the area.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class ContainerWithMostWaterBrute {

    public static int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}