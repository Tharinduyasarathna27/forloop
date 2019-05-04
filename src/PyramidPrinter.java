public class PyramidPrinter {
    public void pyramidGenerator(int p){
        for (int i = 0; i <=p ; i++) {
            System.out.print(" ");
            for (int j = p; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
        for (int i = 0; i <p+1 ; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = p; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
