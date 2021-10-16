package problems;

public class MatrixExample1 {

    private static int[][] image = new int[][]{{1, 0, 0, 0, 0, 0}, {0, 1, 0, 1, 1, 1}, {0, 0, 1, 0, 1, 0}, {1, 1, 0, 0, 1, 0}, {1, 0, 1, 0, 0, 0}, {1, 0, 0, 0, 0, 1}};
    private static int rowSize = image.length;
    private static int colSize = image[0].length;

    private static void convertImage() {

        for (int row = 1; row < rowSize; row++) {
            for (int col = 1; col < colSize; col++)
                if (image[row][col] == 1) {
                    //check left
                    if (getMyValue(row, col - 1) == 0) {
                        //check right
                        if (getMyValue(row, col + 1) == 0) {
                            //check down
                            if (getMyValue(row - 1, col) == 0) {
                                //check up
                                if (getMyValue(row + 1, col) == 0) {
                                    image[row][col] = 0;
                                }
                            }
                        }
                    }
                }
        }
        System.out.println("I am here! ");

    }

    private static int getMyValue(int row, int col) {
        if (row >= rowSize || col >= colSize) {
            return -1;
        }
        return image[row][col];
    }

    public static void main(String[] args) {
        convertImage();
    }
}
