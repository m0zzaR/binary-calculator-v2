package BinaryCalc;
public class BinCalc {


    public int binCalc(String numHolder) {

        int c = 1;
        int total = 0;
         
         
            for (int i = numHolder.length(); i > 0; i--) {
                int numB = Integer.parseInt(numHolder.substring(i-1, i));

                numB *= c;
                c *= 2;

                total += numB; 
            }

            return total;

    }


    public void wholeCalc(int whoNum) {
        

        while (whoNum > 0) {

            wholeCalc((int) whoNum / 2);
            System.out.print(whoNum % 2);
            return;

        }
        

        
    }

    
}
