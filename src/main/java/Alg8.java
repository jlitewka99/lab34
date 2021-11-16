import java.util.ArrayList;
import java.util.List;

public class Alg8 {
    /*
    Problem 65
This problem was asked by Amazon.

Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

For example, given the following matrix:

[[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
You should print out the following:

1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12
     */

    public static void displayX(int[][] array, int column, int x1, int x2, List<Integer> lista) {
        for (int i = x1; i <= x2; i++) {
            lista.add(array[column][i]);
        }
    }

    public static void displayXReverse(int[][] array, int column, int x1, int x2, List<Integer> lista) {
        for (int i = x2; i >= x1; i--) {
            lista.add(array[column][i]);
        }
    }

    public static void displayY(int[][] array, int row, int y1, int y2, List<Integer> lista) {
        for (int i = y1; i <= y2; i++) {
            lista.add(array[i][row]);
        }
    }

    public static void displayYReverse(int[][] array, int row, int y1, int y2, List<Integer> lista) {
        for (int i = y2; i >= y1; i--) {
            lista.add(array[i][row]);
        }
    }

    public static List<Integer> clockWise(int[][] array) {

        List<Integer> result = new ArrayList<Integer>();

        int yLen = array.length;
        int xLen = array[0].length;

        int y1 = 0;
        int y2 = yLen - 1;

        int x1 = 0;
        int x2 = xLen - 1;

        while (true) {
            if (y1 <= y2) {
                displayX(array, y1, x1, x2, result);
                y1++;
            }else
                return result;
            if (x1 <= x2) {
                displayY(array, x2, y1, y2, result);
                x2--;
            }else
                return result;
            if (y1 <= y2) {
                displayXReverse(array, y2, x1, x2, result);
                y2--;
            }else
                return result;
            if (x1 <= x2) {
                displayYReverse(array, x1, y1, y2, result);
                x1++;
            }else
                return result;


        }

    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        int[][] array2 = new int[][]{
                {1, 2},
                {6, 7}};
        List<Integer> lisa = clockWise(array);
        System.out.println(lisa);


    }
}
