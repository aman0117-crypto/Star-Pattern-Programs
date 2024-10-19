package Programming;

public class Pattern6 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i+1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int l=1;l<=6;l++){
            for(int m=1;m<l+1;m++){
                System.out.print(" ");
            }
            for(int n=6;n>=l;n--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
