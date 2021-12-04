import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        String b = "Yuriy";
        String c = "bubochka";

        System.out.println("Enter your name:");
        String name = i.nextLine();

        if (!name.equals(b)){
            System.out.println("Error!");
        }else{
            System.out.println("Enter your password:");
        String pass = i.nextLine();

        var x = (pass.equals(c)) ? "You logged in succesfully!" : "Error!";
        System.out.println(x);
    }
    }
}
