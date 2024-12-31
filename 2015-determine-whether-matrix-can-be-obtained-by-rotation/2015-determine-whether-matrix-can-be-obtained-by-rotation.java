class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean matrixAreEqual = false;
       for(int i = 0; i < 4; i++){
            if(equalMatrix(mat, target)){
                return true;
            }

            mat = rotateMatrix(mat);
        }

        return false;
    }

    static int[][] rotateMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }

     static boolean equalMatrix(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j] != matrix2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}