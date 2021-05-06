package BinaryCalc;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String binNum = "0";
        boolean flag = true;
        boolean calcFlag = true;

        


        while (calcFlag) {

            System.out.println("Would you like to calculate binary to whole, or whole to binary?");
            System.out.println("Print B for binary calc and W for whole number calc");
            String ans = scan.nextLine();
            ans = ans.toLowerCase();

        if (ans.equals("w")) {
        
            System.out.println();
            System.out.println("Input whole number");
            System.out.println();
            int whoNum = scan.nextInt();

                BinCalc who = new BinCalc();
                who.wholeCalc(whoNum);

            calcFlag = false;

                }
                else if (ans.equals("b")) {
                


                System.out.println();
                System.out.println("Input binary number");
                System.out.println();
                


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
                    
                    
                System.out.println();
                System.out.println(num);
                System.out.println();
                calcFlag = false;

        }
        else {
        System.out.println("That is not B or W");
        System.out.println();
        }
    }
        scan.close();
    }
}



