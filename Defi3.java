////////////////////
//
// V2 
// Le 26 Mars 2021
// Defi Etoile 3
//
/////////////////////
public class Defi3 {
    public static void main(String args[]) {
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++) {
                System.out.print("*");
                
            }for(int v=5; v>i; v--) {
                System.out.print("w");
            }
            System.out.println();
            
        }
        System.out.println("");
    }
}