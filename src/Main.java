public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {2, 5, 6},
                {7, 9, 8}
        };

        for (int col = 0; col < array[0].length; col++){
            int colSum = 0;
            for (int row = 0; row < array.length; row++){
                colSum += array[row][col];
            }
            System.out.println("Sum of column " + (col + 1) + ": " + colSum);
        }

        for (int row = 0; row < array[0].length; row++) {
            int rowSum = 0;
            for (int col = 0; col < array.length; col++) {
                rowSum += array[row][col];
            }
            System.out.println("Sum of row " + (row + 1) + ": " + rowSum);
        }
    }
}
