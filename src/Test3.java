import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter the password:");
        String pass = i.nextLine();
        int x = pass.length();

        if (x<10 || x>15){
            System.out.println("Error!");
        }
    }
}
