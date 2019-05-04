public class NumberPattern {
    public void numberGenerator(int n){
        for (int i = 1; i <=n ; i++) {
            if (i>=10){
                System.out.print("    "+i );
            }else
            System.out.print("     "+i );
        }
        System.out.println();
        for (int i = 1; i <=n ; i++) {
            System.out.print("------");
        }
        System.out.println();
        for (int j = 1; j <=n; j++) {
            if (j>=10){
                System.out.print(j + "|  ");
            }else
            System.out.print(j + " |  ");
            for (int i = 1; i <= n ; i++) {

                if (j*i>=100){
                    System.out.print(j*i + "   ");
                }
                else if(j*i>=10){
                    System.out.print(j*i + "    ");
                }else
                System.out.print(j*i + "     ");
            }
            System.out.println();
        }
    }
}
