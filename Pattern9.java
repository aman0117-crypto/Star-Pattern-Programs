package Programming;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            for(int l=6;l>=i;l--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
