package Programming;

public class Pattern14 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=1;j++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
        }
    }
    
}
