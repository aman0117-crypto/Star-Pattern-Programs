package Programming;

public class Pattern12 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
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
        for(int m=1;m<=6;m++){
            for(int n=6;n>=m;n--){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            for(int o=1;o<=m;o++){
                System.out.print(" ");
            }
            
        }
    
    }
    
}
