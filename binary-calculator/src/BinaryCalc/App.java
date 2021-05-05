package BinaryCalc;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String binNum = "0";
        boolean flag = true;

        System.out.println("Input binary number");

        while (flag) {
        
            
            
                    binNum = scan.nextLine();
                    if (binNum.equals("69")) {
                        System.exit(0);
                    }

                    for (int i = 0; i < binNum.length(); i++) {

                        if (!(binNum.substring(i, i + 1).equals("0") || binNum.substring(i, i + 1).equals("1"))) {

                            System.out.println();
                            System.out.println("Please input only a binary number");
                            

                            flag = true;
                            break;
                        }
                        else
                        flag = false;

                    }
        }

        BinCalc bin = new BinCalc();
        int num = bin.binCalc(binNum);
            System.out.println("Hello");
            
        System.out.println();
        System.out.println(num);

        scan.close();
    }
}



