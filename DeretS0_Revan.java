public class DeretS0_Revan {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) {
            
            for (int j = 1; j <= 6; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print("S ");
                } else {
                    System.out.print("0 ");
                }
            }
            
            System.out.println();
        }
    }
}
