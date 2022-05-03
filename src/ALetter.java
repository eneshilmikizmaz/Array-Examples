public class ALetter {
    public void write(String[][] letter) {
        System.out.println("===================================");
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || j == 0) {
                    letter[i][j] = " * ";
                } else if (j == letter[i].length-1) {
                    letter[i][j] = " * ";
                }else if(i==letter.length/2){
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
