import java.util.ArrayList;


public class SolutionMatrixPrint {
    public static void printEdge(ArrayList list,int[][] m, int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                list.add(m[tR][i]);
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                list.add(m[i][tC]);
            }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {
                list.add(m[tR][curC++]);
            }
            while (curR != dR) {
                list.add(m[curR++][dC]);
            }
            while (curC != tC) {
                list.add(m[dR][curC--]);
            }
            while (curR != tR) {
                list.add(m[curR--][tC]);
            }
        }
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int lr = 0;
        int lc = 0;
        int rr = matrix.length-1;
        int rc = matrix[0].length-1;
        while (lr<=rr&&lc<=rc) {
            printEdge(list, matrix, lr++, lc++, rr--, rc--);
        }
        return list;
    }

}