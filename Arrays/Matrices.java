public class Matrices {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //scitanie matric
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[4][5];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    //odcitanie matric
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[4][5];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }

    //transpozicia matric
    public static int[][] transpose(int[][] matrixA) {
        int[][] matrixC = new int[5][4];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[j][i] = matrixA[i][j];
            }
        }
        return matrixC;
    }

    //sucin matric
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[4][5];

        for (int k = 0; k < matrixC.length; k++) {
            for (int j = 0; j < matrixC[k].length; j++) {
                int a = 0;
                for (int i = 0; i < matrixA[k].length; i++) {
                    for (int h = 0; h < matrixB[j].length; h++) {
                        int midResult = matrixA[k][i] * matrixB[h][j];
                        a = +midResult;
                    }
                }
                matrixC[k][j] = a;
            }
        }
        return matrixC;
    }

    public static void main(String[] args) {
        int[][] aMatrix = new int[4][5];
        int[][] bMatrix = new int[4][5]; //vytvorim si 2 matice 4x5

        //naplnim hodnotami obe polia a v matrici b zacnem od 1
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                aMatrix[i][j] = i + j;
            }
        }
        for (int i = 0; i < bMatrix.length; i++) {
            for (int j = 0; j < bMatrix[i].length; j++) {
                bMatrix[i][j] = i + j + 1;
            }
        }
        printMatrix(aMatrix);
        printMatrix(bMatrix);

        int[][] addition = addMatrices(aMatrix, bMatrix);  //vytvorenie suctu
        printMatrix(addition);  //vypisanie suctu
        int[][] subtraction = subtractMatrices(aMatrix, bMatrix);  //vytvorenie odciatania
        printMatrix(subtraction);  //vypisanie odcitania
        int[][] transposeA = transpose(aMatrix);  //transpozicia
        int[][] transposeB = transpose(aMatrix);
        printMatrix(transposeA);
        printMatrix(transposeB);
        int[][] multiplication = multiply(aMatrix, bMatrix);
        printMatrix(multiplication);
    }
}
