import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EX1
        System.out.println("Input the first number:");
        int num1= sc.nextInt();
        System.out.println("Input the first number:");
        int num2= sc.nextInt();
        System.out.println("Input the first number:");
        int num3= sc.nextInt();
        System.out.println("The smallest number is:"+findSmallest(num1,num2,num3));

        //EX2
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(checkSign(num));

        //EX3
        System.out.println("Enter a password.");
        String password = sc.nextLine();
        System.out.println(passwordCheck(password));
    }


    //EX1
    public static int findSmallest(int num1,int num2, int num3){
        if (num1<num2&&num1<num3){
            return num1;
        } else if (num2<num3) {
            return num2;
        }else return num3;
    }
    //EX2
    public static String checkSign (int num){
        if (num>0) {
            return "The number "+num+" is: "+"Positive";
        } if (num<0){
            return "The number "+num+" is: "+"Negative";
        } else return "The number "+num+" is: "+" Zero";
    }
    //EX3
    public static String passwordCheck(String password) {
        char[] passChars = password.toCharArray();
        int digitCount = 0;
        boolean hasSChars = false;
        for (char c : passChars) { //turn the password to an array of chars to check the validation of each.
            if (!Character.isLetterOrDigit(c)) {
                hasSChars = true;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (password.length() < 8) {
            return "Password is too short.";
        } else if (hasSChars){
            return "Password must include only letters and numbers.";
        }else if (digitCount<2) {
            return "Password must include at least two digits.";
        }else return "Password is valid: " +password;
    }

}