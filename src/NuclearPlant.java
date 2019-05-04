public class NuclearPlant {
    public void reactor(int p){

        for (int i = 0; i <p; i++) {

            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }

            System.out.println(" ");
            for (int j = p; j >i-1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=Math.pow(2,i-1); j++) {
                if (p!=0){
                    System.out.print(" p ");
                }
                p=p-1;
            }


            System.out.println();
            for (int j = p; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=Math.pow(2,i) ; j++) {
                System.out.print(" n ");
            }


        }
        for (int i = 0; i <Math.pow(2,p*0) ; i++) {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(" ");
            for (int j = 1; j <=p; j++) {

                    System.out.print(" p ");


            }
            System.out.println();
            for (int j = 1; j <=p*2 ; j++) {
                System.out.print(" n ");
            }
        }
     //  System.out.println(p);
        System.out.println();
    }
}
