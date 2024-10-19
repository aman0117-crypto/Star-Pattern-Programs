package Programming;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=7;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int l=1;l<=7;l++){
            for(int m=6;m>=l;m--){
                System.out.print(" ");
            }
            for(int n=1;n<=l;n++){
                System.out.print("*");
            }
            System.out.println();
        

        }
        
        
    }
    
}
