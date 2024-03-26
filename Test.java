import java.awt.Color;

public class Test {

    public static final int YELLOW = new Color(250, 201, 20).getRGB();
    public static final int BLUE = new Color(17, 13, 99).getRGB();
    public static final int RED = new Color(196, 0, 15).getRGB();
    public static final int BLACK = new Color(5, 5, 5).getRGB();
    public static final int WHITE = new Color(255, 255, 255).getRGB();
    public static final int GREEN = new Color(35, 138, 51).getRGB();

    public static void main(String[] args) {
       // Colombia
        int[][] flagMatrix = {};
        for (int h = 1; h <= 2; h += 1)
        for (int w = 1; w <= 2; w += 1) {
        flagMatrix = createCOLFlag(h * 12, w + 24);
        JOptionPaneArrays.showColorArray2D(null, flagMatrix);

        }
        // Venezuela
        int[][] flagMatrix1 = {};
        for (int h = 1; h <= 2; h += 1)
        for (int w = 1; w <= 2; w += 1) {
        flagMatrix1 = createVENFlag(h * 12, w + 24);
        JOptionPaneArrays.showColorArray2D(null, flagMatrix1);

        }
        //Polonia
        int[][] flagMatrix2 = {};
        for (int h = 1; h <= 2; h += 1)
        for (int w = 1; w <= 2; w += 1) {
        flagMatrix2 = createPOLFlag(h * 12, w + 24);
        JOptionPaneArrays.showColorArray2D(null, flagMatrix2);

        }
        //Republica checa
        int[][] flagMatrix3 = {};
        for (int h = 1; h <= 2; h += 1)
        for (int w = 1; w <= 2; w += 1) {
        flagMatrix3 = createRCFlag(h * 12, w + 24);
        JOptionPaneArrays.showColorArray2D(null, flagMatrix3);

        }
      // ZAF
        int[][] flagMatrix4 = {};
        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix4 = createZAFFlag(h * 12, w * 24);
                JOptionPaneArrays.showColorArray2D(null, flagMatrix4);

            }
        //Bandera de Panama
        int[][] flagMatrix5 = {};
        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix5 = createPANFlag(h * 12, w * 24);
                JOptionPaneArrays.showColorArray2D(null, flagMatrix5);
            }

        //Bandera de Chile
        int[][] flagMatrix6 = {};
        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix6 = createCHLFlag(h * 12, w * 24);
                JOptionPaneArrays.showColorArray2D(null, flagMatrix6);
            }
        

            


    }

    // Bandera de colombia
    public static int[][] createCOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;
        // Amarillo
        rowIni = (height * 0) / 4;
        rowEnd = (height * 2) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;
        // Azul
        rowIni = (height * 2) / 4;
        rowEnd = (height * 3) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        // Rojo
        rowIni = (height * 3) / 4;
        rowEnd = (height * 4) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;

    }

    // Bandera de Venezuela
    public static int[][] createVENFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;
        // Amarillo
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;
        // Azul
        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        // Rojo
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    // bandera de Polonia
    public static int[][] createPOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;
        // BLANCO
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        // ROJO
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    // republica checa
    public static int[][] createRCFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;
        // // AZUL
        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int c = colIni; c < colEnd; c += 1)
            for (int r = rowIni; r < rowEnd - (c * 2); r += 1)

                flag[r + c][c] = BLUE;
        // BLACO
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni + r + 1; c < colEnd; c += 1) {

                flag[r][c] = WHITE;
                flag[height - 1 - r][c] = RED;
            }

        return flag;

    }

    // Bandera de ZAF
    public static int[][] createZAFFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;

        // // // WHITE
        // rowIni = (height * 0) / 2;
        // rowEnd = (height * 2) / 2;
        // colIni = (width * 0) / 2;
        // colEnd = (width * 2) / 2;

        // for (int c = colIni; c < colEnd; c += 1)
        // for (int r = rowIni; r < rowEnd - (c * 2); r +=1)

        // flag[ r + c ][c] = WHITE;

        // VERDE y ROJO
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 3;
        colEnd = (width * 3) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni + r + 1; c < colEnd; c += 1) {

                flag[r][c] = GREEN;
                flag[height - 1 - r][c] = RED;

            }

        // blanco
        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (height * 1) / 3;
        colEnd = (width * 8) / 8;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni +1 ; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;

    }

     // Bandera de Panama
     public static int[][] createPANFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;

        // blanco superior izquierda
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

         // blanco inferior derecha
         rowIni = (height * 1) / 2;
         rowEnd = (height * 2) / 2;
         colIni = (width * 1) / 2;
         colEnd = (width * 2) / 2;
 
         for (int r = rowIni; r < rowEnd; r += 1)
             for (int c = colIni; c < colEnd; c += 1)
                 flag[r][c] = WHITE;
        // Rojo
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        // Azul
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        return flag;

    }

     // Bandera de Chile
     public static int[][] createCHLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd;
        // Azul
        rowIni = (height * 0) / 1;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 4;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;
        // Blanco
        rowIni = (height * 0) / 1;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 4;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        // Rojo
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    

}
