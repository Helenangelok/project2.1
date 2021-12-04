import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
//        int i = 10;
//
//        if (i < 18) {
//            System.out.println("Goog day!");
//        } else {
//            System.out.println("Goog evening!");
//        }
//    }
//}

        Scanner x = new Scanner(System.in);

        System.out.println("Enter the time:");
        int time = x.nextInt();

        if (time > 24 || time < 0) {
            System.out.println("Enter the time less then 24:");
            time = x.nextInt();
        }
        ;
        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.print("Good evening!");
        }
    }
}

//        var a = (time < 18) ? "Good day!" : "Good evening!";
//        System.out.println(a);
//    }
//}