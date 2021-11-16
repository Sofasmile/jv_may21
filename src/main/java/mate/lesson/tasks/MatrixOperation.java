package mate.lesson.tasks;

public class MatrixOperation {
    /**
     * The input is a square matrix with numbers.
     * You need to find the sum of the digits of all the numbers on the main diagonal of the matrix.
     * @param matrix - input matrix
     * @return the sum of all digits of all numbers on the main diagonal
     */
    public static int getSumOfDiagonalElements(int[][] matrix) {
        int result = 0;
        if(matrix == null) {
            return result;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int element = matrix[i][i];
            while (element > 0) {
                result += element % 10;
                element /= 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        test(getSumOfDiagonalElements(
                new int[][]{{102, 261, 34}, {92132, 2, 321}, {19, 29, 918276}}),
                38, "simpleMatrix");
        test(getSumOfDiagonalElements(
                new int[][]{{9752}}),
                23, "singleMatrix");
        test(getSumOfDiagonalElements(
                new int[][]{{}}),
                0, "emptyMatrix");
        test(getSumOfDiagonalElements(
                new int[][]{{0, 123, 726}, {281, 0, 319}, {421, 111, 0}}),
                0, "zeroDiagonalMatrix");
        test(getSumOfDiagonalElements(null), 0, "nullMatrix");
    }

    private static void test(int actual, int expected, String testName) {
        if (actual != expected) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    actual,
                    expected);
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
