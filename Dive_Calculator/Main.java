import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    Integer a;
    Integer b;

    protected static int inputInt(String b) {
        int a=-1;
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            flag = true;
            try {
                System.out.println(b);
                a = Integer.parseInt(sc.nextLine( ));

            } catch (Exception e) {
                System.out.println("Input error occurred. Try again!");
                flag = false;
            }
        } while (flag == false);

        return a;
    }

    public static void main(String[] args) {

        start.welcome();
        start.displaymenu( );
        Scanner sc = new Scanner(System.in);
        int input1;
        input1 = Integer.parseInt(sc.nextLine( ));
        switch (input1) {
            case 1:
                start.check2ndplanning( );
                break;
            case 2:
                break;
            case 3:
                start.origobject();
                break;
            default:

        }





        // this is to original program sequence
        //       start.original();
        //      start.original2();

    }
}


