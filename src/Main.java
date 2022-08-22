import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a string (Type 'q' to exit): ");
            String str = scanner.nextLine();
            if(str.equals("q")){
                break;          //break out of the loop/stop the program
            }
            System.out.println(checkLetters(str));
        }


    }
    //traverse the string letter by letter and compare each with the other
        public static boolean checkLetters(String str){
            for(int i = 0; i < str.length()-1; i++){
                for(int j = i+1; j < str.length(); j++){
                    if (str.charAt(i) == str.charAt(j)) {   // if any two letters are the same return true
                        return true;
                    }
                }
            }
            return false;
        }


}

