package Programming;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=7;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<=7;k++){
            for(int m=1;m<=k;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
