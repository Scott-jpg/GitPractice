import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("This is the main file"); //this is a comment
        String userInp = takeInput("Please enter your name: ");
        System.out.println(userInp);
    }

    public static String takeInput(String Message)
    {
        Scanner mScanner = new Scanner(System.in);
        System.out.print(Message);
        String input = mScanner.next();
        mScanner.close();
        return input;
    }
}
