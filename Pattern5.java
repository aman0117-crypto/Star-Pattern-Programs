package Programming;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<=6;k++){
            for(int m=6;m>=k;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
