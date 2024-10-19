package Programming;

public class Pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i;j--){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }

        }    
        /*for(int l=1;l<=7;l++){
            for(int m=1;m<=l;m++){
                System.out.print(" ");
            }
            for(int n=1;n<=l;n++){
                System.out.print("*");
                System.out.print(" ");
            }
            for(int o=6;o>=l;o--){
                System.out.print(" ");
            }
            System.out.println();

        }*/
    }
    
}
