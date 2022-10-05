import java.util.*;

public class spiralmatix {
    public static void printspiralmatrix(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;
        while (startcol <= endcol && startrow <= endrow) {// inseted of < we use <= cause in oddnumber of rows and
                                                          // coulom the middle one wont get printed thats why '=' is
                                                          // used.

            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ,");

            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ,");

            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) { // this condition is written for the case when one element is left inside the
                                          // spiral it will will already printed in the top so we don't want it to get
                                          // printed in the bottom so that's why.
                    break;
                }
                System.out.print(matrix[endrow][j] + " ,");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ,");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };

        printspiralmatrix(matrix);
    }
}
