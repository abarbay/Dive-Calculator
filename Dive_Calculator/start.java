import java.util.Scanner;


@SuppressWarnings("deprecation")
public class start {

    int depth35 = 35;
    int depth40 = 40;
    int depth50 = 50;
    int depth60 = 60;
    int depth70 = 70;
    int depth80 = 80;
    int depth90 = 90;
    int depth100 = 100;
    int depth110 = 110;
    int depth120 = 120;
    int depth130 = 130;
    int depth140 = 140;
    char aftersurfacepgz;

    // int[] deptharray = {35, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140}; //12 items in the array

    private int userdivedepth;
    private int userbottomtime;
    private int depthrange;
    int diverbottomtime;

    @SuppressWarnings("deprecation")

    static void welcome() {
        System.out.println("");
        System.out.println("                    Welcome to Recreational Dive Planner!");
        System.out.println("");
        System.out.println("                    This app to be used by certified divers only or under instructor supervision!");
        System.out.println("");
        System.out.println("                    All recreational dive must be no decombpression dives");
        System.out.println("");
        System.out.println("                    Enjoy going down and always use safe diving practices!");
        System.out.println("");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private static class dive {

        int si;    // surface interval
        int depth;  // depth
        int bottomtime; // bottom time
        char pgend; // ending pressure group
        char pgstart; // ending pressure group
        int rnt; //residual nitrogen time
        int abt; // actual bottom time
        int tbt;  // total bottom time


    }
    static void printdiveobject(){

    }

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

    static void displaymenu(){
        System.out.println("");
        System.out.println("   CHOOSE BETWEEN THESE MENU OPTIONS        ");
        System.out.println("");
        System.out.println("          1: Check 2nd dive bottom time as per depth input ");
        System.out.println("");
        System.out.println("          2: Dive Planning");
        System.out.println("");
        System.out.println("          3: Dive Planning with dive plan displayed at the end. ");
        System.out.println("");
        System.out.println("          4: Dive Planning");
        System.out.println("");
        System.out.println("    Any other input will exit from the program!");

    }

    static void exceedslimit() {
        System.out.println("");
        System.out.println("            !!!   CAUTION   !!!");
        System.out.println("");
        System.out.println("            RECREATIONAL NO DECO DIVE LIMIT EXCEEDED!");
        System.out.println("");
        System.out.println("            PLAN ACCORDING TO SAFE PRACTICES!");

    }


    static void backtonatural(int a){
        System.out.println("Surface interval time between dives are long enough to disregard pressure groups. Next dive planning can start from the beginning");
        System.out.println("Surface interval time: " + a + " minutes.");
        System.out.println("");
        System.out.println("    Thank you for using my app.");
    }

    static int getdepthrange(int userdivedepth, int userbottomtime) {

        if (userdivedepth <= 35) {
            //noinspection deprecation
            System.out.println("Depth is smaller or equal to " + 35);
            userdivedepth = 35;
            return userdivedepth;
        }
        if (userdivedepth <= 40 && userdivedepth > 35) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 40. actual depth:  " + userdivedepth);
            userdivedepth = 40;
            return userdivedepth;
        }
        if (userdivedepth <= 50 && userdivedepth > 40) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 50. actual depth:  " + userdivedepth);
            userdivedepth = 50;
            return userdivedepth;
        }
        if (userdivedepth <= 60 && userdivedepth > 50) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 60. actual depth:  " + userdivedepth);
            userdivedepth = 60;
            return userdivedepth;
        }
        if (userdivedepth <= 70 && userdivedepth > 60) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 70. actual depth:  " + userdivedepth);
            userdivedepth = 70;
            return userdivedepth;
        }
        if (userdivedepth <= 80 && userdivedepth > 70) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 80. actual depth:  " + userdivedepth);
            userdivedepth = 80;
            return userdivedepth;
        }
        if (userdivedepth <= 90 && userdivedepth > 80) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 90. actual depth:  " + userdivedepth);
            userdivedepth = 90;
            return userdivedepth;
        }
        if (userdivedepth <= 100 && userdivedepth > 90) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 100. actual depth:  " + userdivedepth);
            userdivedepth = 100;
            return userdivedepth;
        }
        if (userdivedepth <= 110 && userdivedepth > 100) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 110. actual depth:  " + userdivedepth);
            userdivedepth = 110;
            return userdivedepth;
        }
        if (userdivedepth <= 120 && userdivedepth > 110) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 120. actual depth:  " + userdivedepth);
            userdivedepth = 120;
            return userdivedepth;
        }
        if (userdivedepth <= 130 && userdivedepth > 120) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 130. actual depth:  " + userdivedepth);
            userdivedepth = 130;
            return userdivedepth;
        }

        if (userdivedepth <= 140 && userdivedepth > 130) {
            //noinspection deprecation
            System.out.println("Depth belongs to group 140. actual depth:  " + userdivedepth);
            userdivedepth = 140;
            return userdivedepth;
        }
        if (userdivedepth > 140) {
            //noinspection deprecation
            // System.out.println("Depth too much! Stay within recreational diving limit!");
            start.exceedslimit();
            userdivedepth = 150;

            return userdivedepth;
        } else

            return userdivedepth;
    }

    @SuppressWarnings("deprecation")
    static char getpg35(int diverbottomtime, char pg35) {
        int[] d35 = {0, 10, 19, 25, 29, 32, 36, 40, 44, 48, 52, 57, 62, 67, 73, 79, 85, 92, 100, 108, 117, 127, 139, 152, 168, 188, 205};
        pg35='@';
        if (diverbottomtime <= d35[1]) {
            pg35 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d35[1] && diverbottomtime <= d35[2]) {
            pg35 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d35[2] && diverbottomtime <= d35[3]) {
            pg35 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d35[3] && diverbottomtime <= d35[4]) {
            pg35 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d35[4] && diverbottomtime <= d35[5]) {
            pg35 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d35[5] && diverbottomtime <= d35[6]) {
            pg35 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d35[6] && diverbottomtime <= d35[7]) {
            pg35 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d35[7] && diverbottomtime <= d35[8]) {
            pg35 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d35[8] && diverbottomtime <= d35[9]) {
            pg35 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d35[9] && diverbottomtime <= d35[10]) {
            pg35 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d35[10] && diverbottomtime <= d35[11]) {
            pg35 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d35[11] && diverbottomtime <= d35[12]) {
            pg35 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d35[12] && diverbottomtime <= d35[13]) {
            pg35 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d35[13] && diverbottomtime <= d35[14]) {
            pg35 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d35[14] && diverbottomtime <= d35[15]) {
            pg35 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d35[15] && diverbottomtime <= d35[16]) {
            pg35 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d35[16] && diverbottomtime <= d35[17]) {
            pg35 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d35[17] && diverbottomtime <= d35[18]) {
            pg35 = 'R';     //noinspection deprecation
        } else if (diverbottomtime > d35[18] && diverbottomtime <= d35[19]) {
            pg35 = 'S';    //noinspection deprecation
        } else if (diverbottomtime > d35[19] && diverbottomtime <= d35[20]) {
            pg35 = 'T';     //noinspection deprecation
        } else if (diverbottomtime > d35[20] && diverbottomtime <= d35[21]) {
            pg35 = 'U';    //noinspection deprecation
        } else if (diverbottomtime > d35[21] && diverbottomtime <= d35[22]) {
            pg35 = 'V';    //noinspection deprecation
        } else if (diverbottomtime > d35[22] && diverbottomtime <= d35[23]) {
            pg35 = 'W';    //noinspection deprecation
        } else if (diverbottomtime > d35[23] && diverbottomtime <= d35[24]) {
            pg35 = 'X';    //noinspection deprecation
        } else if (diverbottomtime > d35[24] && diverbottomtime <= d35[25]) {
            pg35 = 'Y';    //noinspection deprecation
        } else if (diverbottomtime > d35[25] && diverbottomtime <= d35[26]) {
            pg35 = 'Z';    //noinspection deprecation
        } else
            start.exceedslimit();

        return pg35;
    }

    static char getpg40(int diverbottomtime, char pg40) {
        int[] d40 = {0, 9, 16, 22, 25, 27, 31, 34, 37, 40, 44, 48, 51, 55, 60, 64, 69, 74, 79, 85, 91, 97, 104, 111, 120, 129, 140};
        pg40='@';
        if (diverbottomtime <= d40[1]) {
            pg40 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d40[1] && diverbottomtime <= d40[2]) {
            pg40 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d40[2] && diverbottomtime <= d40[3]) {
            pg40 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d40[3] && diverbottomtime <= d40[4]) {
            pg40 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d40[4] && diverbottomtime <= d40[5]) {
            pg40 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d40[5] && diverbottomtime <= d40[6]) {
            pg40 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d40[6] && diverbottomtime <= d40[7]) {
            pg40 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d40[7] && diverbottomtime <= d40[8]) {
            pg40 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d40[8] && diverbottomtime <= d40[9]) {
            pg40 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d40[9] && diverbottomtime <= d40[10]) {
            pg40 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d40[10] && diverbottomtime <= d40[11]) {
            pg40 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d40[11] && diverbottomtime <= d40[12]) {
            pg40 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d40[12] && diverbottomtime <= d40[13]) {
            pg40 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d40[13] && diverbottomtime <= d40[14]) {
            pg40 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d40[14] && diverbottomtime <= d40[15]) {
            pg40 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d40[15] && diverbottomtime <= d40[16]) {
            pg40 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d40[16] && diverbottomtime <= d40[17]) {
            pg40 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d40[17] && diverbottomtime <= d40[18]) {
            pg40 = 'R';     //noinspection deprecation
        } else if (diverbottomtime > d40[18] && diverbottomtime <= d40[19]) {
            pg40 = 'S';    //noinspection deprecation
        } else if (diverbottomtime > d40[19] && diverbottomtime <= d40[20]) {
            pg40 = 'T';     //noinspection deprecation
        } else if (diverbottomtime > d40[20] && diverbottomtime <= d40[21]) {
            pg40 = 'U';    //noinspection deprecation
        } else if (diverbottomtime > d40[21] && diverbottomtime <= d40[22]) {
            pg40 = 'V';    //noinspection deprecation
        } else if (diverbottomtime > d40[22] && diverbottomtime <= d40[23]) {
            pg40 = 'W';    //noinspection deprecation
        } else if (diverbottomtime > d40[23] && diverbottomtime <= d40[24]) {
            pg40 = 'X';    //noinspection deprecation
        } else if (diverbottomtime > d40[24] && diverbottomtime <= d40[25]) {
            pg40 = 'Y';    //noinspection deprecation
        } else if (diverbottomtime > d40[25] && diverbottomtime <= d40[26]) {
            pg40 = 'Z';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg40;
    }

    static char getpg50(int diverbottomtime, char pg50) {
        int[] d50 = {0, 7, 13, 17, 19, 21, 24, 26, 28, 31, 33, 36, 39, 41, 44, 47, 50, 53, 57, 60, 63, 67, 71, 75, 80};
        pg50='@';
        if (diverbottomtime <= d50[1]) {
            pg50 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d50[1] && diverbottomtime <= d50[2]) {
            pg50 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d50[2] && diverbottomtime <= d50[3]) {
            pg50 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d50[3] && diverbottomtime <= d50[4]) {
            pg50 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d50[4] && diverbottomtime <= d50[5]) {
            pg50 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d50[5] && diverbottomtime <= d50[6]) {
            pg50 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d50[6] && diverbottomtime <= d50[7]) {
            pg50 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d50[7] && diverbottomtime <= d50[8]) {
            pg50 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d50[8] && diverbottomtime <= d50[9]) {
            pg50 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d50[9] && diverbottomtime <= d50[10]) {
            pg50 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d50[10] && diverbottomtime <= d50[11]) {
            pg50 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d50[11] && diverbottomtime <= d50[12]) {
            pg50 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d50[12] && diverbottomtime <= d50[13]) {
            pg50 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d50[13] && diverbottomtime <= d50[14]) {
            pg50 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d50[14] && diverbottomtime <= d50[15]) {
            pg50 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d50[15] && diverbottomtime <= d50[16]) {
            pg50 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d50[16] && diverbottomtime <= d50[17]) {
            pg50 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d50[17] && diverbottomtime <= d50[18]) {
            pg50 = 'R';     //noinspection deprecation
        } else if (diverbottomtime > d50[18] && diverbottomtime <= d50[19]) {
            pg50 = 'S';    //noinspection deprecation
        } else if (diverbottomtime > d50[19] && diverbottomtime <= d50[20]) {
            pg50 = 'T';     //noinspection deprecation
        } else if (diverbottomtime > d50[20] && diverbottomtime <= d50[21]) {
            pg50 = 'U';    //noinspection deprecation
        } else if (diverbottomtime > d50[21] && diverbottomtime <= d50[22]) {
            pg50 = 'V';    //noinspection deprecation
        } else if (diverbottomtime > d50[22] && diverbottomtime <= d50[23]) {
            pg50 = 'W';    //noinspection deprecation
        } else if (diverbottomtime > d50[23] && diverbottomtime <= d50[24]) {
            pg50 = 'X';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg50;
    }

    static char getpg60(int diverbottomtime, char pg60) {
        int[] d60 = {0, 6, 11, 14, 16, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 42, 44, 47, 49, 52, 54, 55};
        pg60='@';
        if (diverbottomtime <= d60[1]) {
            pg60 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d60[1] && diverbottomtime <= d60[2]) {
            pg60 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d60[2] && diverbottomtime <= d60[3]) {
            pg60 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d60[3] && diverbottomtime <= d60[4]) {
            pg60 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d60[4] && diverbottomtime <= d60[5]) {
            pg60 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d60[5] && diverbottomtime <= d60[6]) {
            pg60 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d60[6] && diverbottomtime <= d60[7]) {
            pg60 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d60[7] && diverbottomtime <= d60[8]) {
            pg60 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d60[8] && diverbottomtime <= d60[9]) {
            pg60 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d60[9] && diverbottomtime <= d60[10]) {
            pg60 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d60[10] && diverbottomtime <= d60[11]) {
            pg60 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d60[11] && diverbottomtime <= d60[12]) {
            pg60 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d60[12] && diverbottomtime <= d60[13]) {
            pg60 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d60[13] && diverbottomtime <= d60[14]) {
            pg60 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d60[14] && diverbottomtime <= d60[15]) {
            pg60 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d60[15] && diverbottomtime <= d60[16]) {
            pg60 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d60[16] && diverbottomtime <= d60[17]) {
            pg60 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d60[17] && diverbottomtime <= d60[18]) {
            pg60 = 'R';     //noinspection deprecation
        } else if (diverbottomtime > d60[18] && diverbottomtime <= d60[19]) {
            pg60 = 'S';    //noinspection deprecation
        } else if (diverbottomtime > d60[19] && diverbottomtime <= d60[20]) {
            pg60 = 'T';     //noinspection deprecation
        } else if (diverbottomtime > d60[20] && diverbottomtime <= d60[21]) {
            pg60 = 'U';    //noinspection deprecation
        } else if (diverbottomtime > d60[21] && diverbottomtime <= d60[22]) {
            pg60 = 'V';     //noinspection deprecation
        } else if (diverbottomtime > d60[22] && diverbottomtime <= d60[23]) {
            pg60 = 'W';     //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg60;
    }

    static char getpg70(int diverbottomtime, char pg70) {
        int[] d70 = {0, 5, 9, 12, 13, 15, 16, 18, 19, 21, 22, 24, 26, 27, 29, 31, 33, 35, 36, 38, 40};
        pg70='@';
        if (diverbottomtime <= d70[1]) {
            pg70 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d70[1] && diverbottomtime <= d70[2]) {
            pg70 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d70[2] && diverbottomtime <= d70[3]) {
            pg70 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d70[3] && diverbottomtime <= d70[4]) {
            pg70 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d70[4] && diverbottomtime <= d70[5]) {
            pg70 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d70[5] && diverbottomtime <= d70[6]) {
            pg70 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d70[6] && diverbottomtime <= d70[7]) {
            pg70 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d70[7] && diverbottomtime <= d70[8]) {
            pg70 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d70[8] && diverbottomtime <= d70[9]) {
            pg70 = 'I';    //noinspection deprecation
            System.out.println("pg70 in the method is: " + pg70);
        } else if (diverbottomtime > d70[9] && diverbottomtime <= d70[10]) {
            pg70 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d70[10] && diverbottomtime <= d70[11]) {
            pg70 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d70[11] && diverbottomtime <= d70[12]) {
            pg70 = 'L';    //noinspection deprecation
            System.out.println("pg70 in the method is: " + pg70);
        } else if (diverbottomtime > d70[12] && diverbottomtime <= d70[13]) {
            pg70 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d70[13] && diverbottomtime <= d70[14]) {
            pg70 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d70[14] && diverbottomtime <= d70[15]) {
            pg70 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d70[15] && diverbottomtime <= d70[16]) {
            pg70 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d70[16] && diverbottomtime <= d70[17]) {
            pg70 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d70[17] && diverbottomtime <= d70[18]) {
            pg70 = 'R';     //noinspection deprecation
        } else if (diverbottomtime > d70[18] && diverbottomtime <= d70[19]) {
            pg70 = 'S';    //noinspection deprecation
        } else if (diverbottomtime > d70[19] && diverbottomtime <= d70[20]) {
            pg70 = 'T';     //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg70;
    }

    static char getpg80(int diverbottomtime, char pg80) {
        int[] d80 = {0, 4, 8, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22, 23, 25, 26, 28, 29, 30};
        pg80='@';
        if (diverbottomtime <= d80[1]) {
            pg80 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d80[1] && diverbottomtime <= d80[2]) {
            pg80 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d80[2] && diverbottomtime <= d80[3]) {
            pg80 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d80[3] && diverbottomtime <= d80[4]) {
            pg80 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d80[4] && diverbottomtime <= d80[5]) {
            pg80 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d80[5] && diverbottomtime <= d80[6]) {
            pg80 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d80[6] && diverbottomtime <= d80[7]) {
            pg80 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d80[7] && diverbottomtime <= d80[8]) {
            pg80 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d80[8] && diverbottomtime <= d80[9]) {
            pg80 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d80[9] && diverbottomtime <= d80[10]) {
            pg80 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d80[10] && diverbottomtime <= d80[11]) {
            pg80 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d80[11] && diverbottomtime <= d80[12]) {
            pg80 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d80[12] && diverbottomtime <= d80[13]) {
            pg80 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d80[13] && diverbottomtime <= d80[14]) {
            pg80 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d80[14] && diverbottomtime <= d80[15]) {
            pg80 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d80[15] && diverbottomtime <= d80[16]) {
            pg80 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d80[16] && diverbottomtime <= d80[17]) {
            pg80 = 'Q';    //noinspection deprecation
        } else if (diverbottomtime > d80[17] && diverbottomtime <= d80[18]) {
            pg80 = 'R';     //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg80;
    }

    static char getpg90(int diverbottomtime, char pg90) {
        int[] d90 = {0, 4, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25};
        pg90='@';
        if (diverbottomtime <= d90[1]) {
            pg90 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d90[1] && diverbottomtime <= d90[2]) {
            pg90 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d90[2] && diverbottomtime <= d90[3]) {
            pg90 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d90[3] && diverbottomtime <= d90[4]) {
            pg90 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d90[4] && diverbottomtime <= d90[5]) {
            pg90 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d90[5] && diverbottomtime <= d90[6]) {
            pg90 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d90[6] && diverbottomtime <= d90[7]) {
            pg90 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d90[7] && diverbottomtime <= d90[8]) {
            pg90 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d90[8] && diverbottomtime <= d90[9]) {
            pg90 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d90[9] && diverbottomtime <= d90[10]) {
            pg90 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d90[10] && diverbottomtime <= d90[11]) {
            pg90 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d90[11] && diverbottomtime <= d90[12]) {
            pg90 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d90[12] && diverbottomtime <= d90[13]) {
            pg90 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d90[13] && diverbottomtime <= d90[14]) {
            pg90 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d90[14] && diverbottomtime <= d90[15]) {
            pg90 = 'O';    //noinspection deprecation
        } else if (diverbottomtime > d90[15] && diverbottomtime <= d90[16]) {
            pg90 = 'P';     //noinspection deprecation
        } else if (diverbottomtime > d90[16] && diverbottomtime <= d90[17]) {
            pg90 = 'Q';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg90;
    }

    static char getpg100(int diverbottomtime, char pg100) {
        int[] d100 = {0, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        pg100='@';
        if (diverbottomtime <= d100[1]) {
            pg100 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d100[1] && diverbottomtime <= d100[2]) {
            pg100 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d100[2] && diverbottomtime <= d100[3]) {
            pg100 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d100[3] && diverbottomtime <= d100[4]) {
            pg100 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d100[4] && diverbottomtime <= d100[5]) {
            pg100 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d100[5] && diverbottomtime <= d100[6]) {
            pg100 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d100[6] && diverbottomtime <= d100[7]) {
            pg100 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d100[7] && diverbottomtime <= d100[8]) {
            pg100 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d100[8] && diverbottomtime <= d100[9]) {
            pg100 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d100[9] && diverbottomtime <= d100[10]) {
            pg100 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d100[10] && diverbottomtime <= d100[11]) {
            pg100 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d100[11] && diverbottomtime <= d100[12]) {
            pg100 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d100[12] && diverbottomtime <= d100[13]) {
            pg100 = 'M';     //noinspection deprecation
        } else if (diverbottomtime > d100[13] && diverbottomtime <= d100[14]) {
            pg100 = 'N';   //noinspection deprecation
        } else if (diverbottomtime > d100[14] && diverbottomtime <= d100[15]) {
            pg100 = 'O';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg100;
    }

    static char getpg110(int diverbottomtime, char pg110) {
        int[] d110 = {0, 3, 6, 7, 8, 9, 10, 11, 12, 13, 0, 14, 15, 16};
        pg110='@';
        if (diverbottomtime <= d110[1]) {
            pg110 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d110[1] && diverbottomtime <= d110[2]) {
            pg110 = 'B';
        } else if (diverbottomtime > d110[2] && diverbottomtime <= d110[3]) {
            pg110 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d110[3] && diverbottomtime <= d110[4]) {
            pg110 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d110[4] && diverbottomtime <= d110[5]) {
            pg110 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d110[5] && diverbottomtime <= d110[6]) {
            pg110 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d110[6] && diverbottomtime <= d110[7]) {
            pg110 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d110[7] && diverbottomtime <= d110[8]) {
            pg110 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d110[8] && diverbottomtime <= d110[9]) {
            pg110 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d110[9] && diverbottomtime <= d110[10]) {
            pg110 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d110[10] && diverbottomtime <= d110[11]) {
            pg110 = 'K';     //noinspection deprecation
        } else if (diverbottomtime > d110[11] && diverbottomtime <= d110[12]) {
            pg110 = 'L';    //noinspection deprecation
        } else if (diverbottomtime > d110[12] && diverbottomtime <= d110[13]) {
            pg110 = 'M';     //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg110;
    }

    static char getpg120(int diverbottomtime, char pg120) {
        int[] d120 = {0, 3, 5, 6, 7, 8, 9, 10, 11, 0, 12, 13};
        pg120='@';
        if (diverbottomtime <= d120[1]) {
            pg120 = 'A';
        } else if (diverbottomtime > d120[1] && diverbottomtime <= d120[2]) {
            pg120 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d120[2] && diverbottomtime <= d120[3]) {
            pg120 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d120[3] && diverbottomtime <= d120[4]) {
            pg120 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d120[4] && diverbottomtime <= d120[5]) {
            pg120 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d120[5] && diverbottomtime <= d120[6]) {
            pg120 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d120[6] && diverbottomtime <= d120[7]) {
            pg120 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d120[7] && diverbottomtime <= d120[8]) {
            pg120 = 'H';    //noinspection deprecation
        } else if (diverbottomtime > d120[8] && diverbottomtime <= d120[9]) {
            pg120 = 'I';    //noinspection deprecation
        } else if (diverbottomtime > d120[9] && diverbottomtime <= d120[10]) {
            pg120 = 'J';    //noinspection deprecation
        } else if (diverbottomtime > d120[10] && diverbottomtime <= d120[11]) {
            pg120 = 'K';     //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg120;
    }

    static char getpg130(int diverbottomtime, char pg130) {
        int[] d130 = {0, 3, 5, 6, 7, 0, 8, 9, 10};
        pg130='@';
        if (diverbottomtime <= d130[1]) {
            pg130 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d130[1] && diverbottomtime <= d130[2]) {
            pg130 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d130[2] && diverbottomtime <= d130[3]) {
            pg130 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d130[3] && diverbottomtime <= d130[4]) {
            pg130 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d130[4] && diverbottomtime <= d130[5]) {
            pg130 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d130[5] && diverbottomtime <= d130[6]) {
            pg130 = 'F';    //noinspection deprecation
        } else if (diverbottomtime > d130[6] && diverbottomtime <= d130[7]) {
            pg130 = 'G';    //noinspection deprecation
        } else if (diverbottomtime > d130[7] && diverbottomtime <= d130[8]) {
            pg130 = 'H';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg130;
    }

    static char getpg140(int diverbottomtime, char pg140) {
        int[] d140 = {0, 0, 4, 5, 6, 7, 8};
        pg140='@';
        if (diverbottomtime <= d140[1]) {
            pg140 = 'A';
            //noinspection deprecation
        } else if (diverbottomtime > d140[1] && diverbottomtime <= d140[2]) {
            pg140 = 'B';
            //noinspection deprecation
        } else if (diverbottomtime > d140[2] && diverbottomtime <= d140[3]) {
            pg140 = 'C';    //noinspection deprecation
        } else if (diverbottomtime > d140[3] && diverbottomtime <= d140[4]) {
            pg140 = 'D';    //noinspection deprecation
        } else if (diverbottomtime > d140[4] && diverbottomtime <= d140[5]) {
            pg140 = 'E';   //noinspection deprecation
        } else if (diverbottomtime > d140[5] && diverbottomtime <= d140[6]) {
            pg140 = 'F';    //noinspection deprecation
        } else
            //noinspection deprecation
            start.exceedslimit();

        return pg140;
    }

    static char aftersurfacepgz(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7, 8 ,9  10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43, 44, 45 , 46 47 ,48,  49,50, 51
        int[] ztime = {0, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 17, 18, 20, 21, 24, 25, 28, 29, 31, 32, 35, 36, 40, 41, 44, 45, 49, 50, 54, 55, 59, 60, 65, 66, 71, 72, 77, 78, 84, 85, 91, 92, 100, 101, 109, 110, 131, 132, 179, 180, 360};

        char aftersurfacepg = ' ';

        if (surfaceinterval >= ztime[0] && surfaceinterval <= ztime[1]) {
            aftersurfacepg = 'Z';
        } else if (surfaceinterval >= ztime[2] && surfaceinterval <= ztime[3]) {
            aftersurfacepg = 'Y';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[4] && surfaceinterval <= ztime[5]) {
            aftersurfacepg = 'X';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[6] && surfaceinterval <= ztime[7]) {
            aftersurfacepg = 'W';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[8] && surfaceinterval <= ztime[9]) {
            aftersurfacepg = 'V';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[10] && surfaceinterval <= ztime[11]) {
            aftersurfacepg = 'U';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[12] && surfaceinterval <= ztime[13]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[14] && surfaceinterval <= ztime[15]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[16] && surfaceinterval <= ztime[17]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[18] && surfaceinterval <= ztime[19]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[20] && surfaceinterval <= ztime[21]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[22] && surfaceinterval <= ztime[23]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[24] && surfaceinterval <= ztime[25]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[26] && surfaceinterval <= ztime[27]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[28] && surfaceinterval <= ztime[29]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[30] && surfaceinterval <= ztime[31]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[32] && surfaceinterval <= ztime[33]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[34] && surfaceinterval <= ztime[35]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[36] && surfaceinterval <= ztime[37]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[38] && surfaceinterval <= ztime[39]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[40] && surfaceinterval <= ztime[41]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[42] && surfaceinterval <= ztime[43]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[44] && surfaceinterval <= ztime[45]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[46] && surfaceinterval <= ztime[47]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[48] && surfaceinterval <= ztime[49]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ztime[50] && surfaceinterval <= ztime[51]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgy(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7, 8 ,9  10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43, 44, 45 , 46 47 ,48,  49,50, 51
        int[] ytime = {0, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 18, 19, 21, 22, 25, 26, 29, 30, 33, 34, 37, 38, 41, 42, 46, 47, 51, 52, 56, 57, 62, 63, 68, 69, 74, 75, 81, 82, 89, 90, 97, 98, 106, 107, 128, 129, 176, 177, 357};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ytime[0] && surfaceinterval <= ytime[1]) {
            aftersurfacepg = 'Y';
        } else if (surfaceinterval >= ytime[2] && surfaceinterval <= ytime[3]) {
            aftersurfacepg = 'X';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[4] && surfaceinterval <= ytime[5]) {
            aftersurfacepg = 'W';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[6] && surfaceinterval <= ytime[7]) {
            aftersurfacepg = 'V';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[8] && surfaceinterval <= ytime[9]) {
            aftersurfacepg = 'U';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[10] && surfaceinterval <= ytime[11]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[12] && surfaceinterval <= ytime[13]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[14] && surfaceinterval <= ytime[15]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[16] && surfaceinterval <= ytime[17]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[18] && surfaceinterval <= ytime[19]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[20] && surfaceinterval <= ytime[21]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[22] && surfaceinterval <= ytime[23]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[24] && surfaceinterval <= ytime[25]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[26] && surfaceinterval <= ytime[27]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[28] && surfaceinterval <= ytime[29]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[30] && surfaceinterval <= ytime[31]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[32] && surfaceinterval <= ytime[33]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[34] && surfaceinterval <= ytime[35]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[36] && surfaceinterval <= ytime[37]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[38] && surfaceinterval <= ytime[39]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[40] && surfaceinterval <= ytime[41]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[42] && surfaceinterval <= ytime[43]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[44] && surfaceinterval <= ytime[45]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[46] && surfaceinterval <= ytime[47]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ytime[48] && surfaceinterval <= ytime[49]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
        aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgx(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7, 8 ,9  10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47
        int[] xtime = {0, 2, 3, 5, 6, 8, 9, 11, 12, 15, 16, 18, 19, 22, 23, 26, 27, 30, 31, 34, 35, 39, 40, 43, 44, 48, 49, 53, 54, 59, 60, 65, 66, 77, 72, 78, 79, 86, 87, 94, 95, 103, 104, 125, 126, 173, 174, 354};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= xtime[0] && surfaceinterval <= xtime[1]) {
            aftersurfacepg = 'X';
        } else if (surfaceinterval >= xtime[2] && surfaceinterval <= xtime[3]) {
            aftersurfacepg = 'W';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[4] && surfaceinterval <= xtime[5]) {
            aftersurfacepg = 'V';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[6] && surfaceinterval <= xtime[7]) {
            aftersurfacepg = 'U';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[8] && surfaceinterval <= xtime[9]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[10] && surfaceinterval <= xtime[11]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[12] && surfaceinterval <= xtime[13]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[14] && surfaceinterval <= xtime[15]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[16] && surfaceinterval <= xtime[17]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[18] && surfaceinterval <= xtime[19]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[20] && surfaceinterval <= xtime[21]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[22] && surfaceinterval <= xtime[23]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[24] && surfaceinterval <= xtime[25]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[26] && surfaceinterval <= xtime[27]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[28] && surfaceinterval <= xtime[29]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[30] && surfaceinterval <= xtime[31]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[32] && surfaceinterval <= xtime[33]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[34] && surfaceinterval <= xtime[35]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[36] && surfaceinterval <= xtime[37]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[38] && surfaceinterval <= xtime[39]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[40] && surfaceinterval <= xtime[41]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[42] && surfaceinterval <= xtime[43]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[44] && surfaceinterval <= xtime[45]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= xtime[46] && surfaceinterval <= xtime[47]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';
        return aftersurfacepg;

    }

    static char aftersurfacepgw(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45
        int[] wtime = {0, 2, 3, 5, 6, 8, 9, 12, 13, 15, 16, 19, 20, 23, 24, 27, 28, 31, 32, 36, 37, 40, 41, 46, 50, 51, 56, 57, 62, 63, 68, 69, 75, 76, 83, 84, 91, 92, 100, 101, 102, 122, 123, 170, 171, 351};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= wtime[0] && surfaceinterval <= wtime[1]) {
            aftersurfacepg = 'W';
        } else if (surfaceinterval >= wtime[2] && surfaceinterval <= wtime[3]) {
            aftersurfacepg = 'V';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[4] && surfaceinterval <= wtime[5]) {
            aftersurfacepg = 'U';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[6] && surfaceinterval <= wtime[7]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[8] && surfaceinterval <= wtime[9]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[10] && surfaceinterval <= wtime[11]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[12] && surfaceinterval <= wtime[13]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[14] && surfaceinterval <= wtime[15]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[16] && surfaceinterval <= wtime[17]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[18] && surfaceinterval <= wtime[19]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[20] && surfaceinterval <= wtime[21]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[22] && surfaceinterval <= wtime[23]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[24] && surfaceinterval <= wtime[25]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[26] && surfaceinterval <= wtime[27]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[28] && surfaceinterval <= wtime[29]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[30] && surfaceinterval <= wtime[31]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[32] && surfaceinterval <= wtime[33]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[34] && surfaceinterval <= wtime[35]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[36] && surfaceinterval <= wtime[37]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[38] && surfaceinterval <= wtime[39]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[40] && surfaceinterval <= wtime[41]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[42] && surfaceinterval <= wtime[43]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= wtime[44] && surfaceinterval <= wtime[45]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;

    }

    static char aftersurfacepgv(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43
        int[] vtime = {0, 2, 3, 5, 6, 9, 10, 12, 13, 16, 17, 20, 21, 24, 25, 28, 29, 33, 34, 37, 38, 42, 43, 47, 48, 53, 54, 59, 60, 65, 66, 72, 73, 80, 81, 88, 89, 97, 98, 119, 120, 167, 168, 348};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= vtime[0] && surfaceinterval <= vtime[1]) {
            aftersurfacepg = 'V';
        } else if (surfaceinterval >= vtime[2] && surfaceinterval <= vtime[3]) {
            aftersurfacepg = 'U';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[4] && surfaceinterval <= vtime[5]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[6] && surfaceinterval <= vtime[7]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[8] && surfaceinterval <= vtime[9]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[10] && surfaceinterval <= vtime[11]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[12] && surfaceinterval <= vtime[13]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[14] && surfaceinterval <= vtime[15]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[16] && surfaceinterval <= vtime[17]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[18] && surfaceinterval <= vtime[19]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[20] && surfaceinterval <= vtime[21]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[22] && surfaceinterval <= vtime[23]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[24] && surfaceinterval <= vtime[25]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[26] && surfaceinterval <= vtime[27]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[28] && surfaceinterval <= vtime[29]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[30] && surfaceinterval <= vtime[31]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[32] && surfaceinterval <= vtime[33]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[34] && surfaceinterval <= vtime[35]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[36] && surfaceinterval <= vtime[37]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[38] && surfaceinterval <= vtime[39]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[40] && surfaceinterval <= vtime[41]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= vtime[42] && surfaceinterval <= vtime[43]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;

    }

    static char aftersurfacepgu(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41
        int[] utime = {0, 2, 3, 6, 7, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, 29, 30, 34, 35, 39, 40, 44, 45, 50, 51, 56, 57, 62, 63, 69, 70, 77, 78, 85, 86, 94, 95, 116, 117, 164, 165, 345};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= utime[0] && surfaceinterval <= utime[1]) {
            aftersurfacepg = 'U';
        } else if (surfaceinterval >= utime[2] && surfaceinterval <= utime[3]) {
            aftersurfacepg = 'T';    //noinspection deprecation
        } else if (surfaceinterval >= utime[4] && surfaceinterval <= utime[5]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= utime[6] && surfaceinterval <= utime[7]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= utime[8] && surfaceinterval <= utime[9]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= utime[10] && surfaceinterval <= utime[11]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= utime[12] && surfaceinterval <= utime[13]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= utime[14] && surfaceinterval <= utime[15]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= utime[16] && surfaceinterval <= utime[17]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= utime[18] && surfaceinterval <= utime[19]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= utime[20] && surfaceinterval <= utime[21]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= utime[22] && surfaceinterval <= utime[23]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= utime[24] && surfaceinterval <= utime[25]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= utime[26] && surfaceinterval <= utime[27]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= utime[28] && surfaceinterval <= utime[29]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= utime[30] && surfaceinterval <= utime[31]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= utime[32] && surfaceinterval <= utime[33]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= utime[34] && surfaceinterval <= utime[35]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= utime[36] && surfaceinterval <= utime[37]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= utime[38] && surfaceinterval <= utime[39]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= utime[40] && surfaceinterval <= utime[41]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgt(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,
        int[] ttime = {0, 2, 3, 6, 7, 10, 11, 13, 14, 17, 18, 22, 23, 26, 27, 31, 32, 36, 37, 41, 42, 47, 48, 53, 54, 59, 60, 66, 67, 73, 74, 82, 83, 91, 92, 113, 114, 161, 162, 342};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ttime[0] && surfaceinterval <= ttime[1]) {
            aftersurfacepg = 'T';
        } else if (surfaceinterval >= ttime[2] && surfaceinterval <= ttime[3]) {
            aftersurfacepg = 'S';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[4] && surfaceinterval <= ttime[5]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[6] && surfaceinterval <= ttime[7]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[8] && surfaceinterval <= ttime[9]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[10] && surfaceinterval <= ttime[11]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[12] && surfaceinterval <= ttime[13]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[14] && surfaceinterval <= ttime[15]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[16] && surfaceinterval <= ttime[17]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[18] && surfaceinterval <= ttime[19]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[20] && surfaceinterval <= ttime[21]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[22] && surfaceinterval <= ttime[23]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[24] && surfaceinterval <= ttime[25]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[26] && surfaceinterval <= ttime[27]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[28] && surfaceinterval <= ttime[29]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[30] && surfaceinterval <= ttime[31]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[32] && surfaceinterval <= ttime[33]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[34] && surfaceinterval <= ttime[35]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[36] && surfaceinterval <= ttime[37]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ttime[38] && surfaceinterval <= ttime[39]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgs(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37
        int[] stime = {0, 3, 4, 6, 7, 10, 11, 14, 15, 18, 19, 23, 24, 27, 28, 32, 33, 38, 39, 43, 44, 49, 50, 56, 57, 63, 64, 70, 71, 78, 79, 87, 88, 109, 110, 158, 159, 339};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= stime[0] && surfaceinterval <= stime[1]) {
            aftersurfacepg = 'S';
        } else if (surfaceinterval >= stime[2] && surfaceinterval <= stime[3]) {
            aftersurfacepg = 'R';    //noinspection deprecation
        } else if (surfaceinterval >= stime[4] && surfaceinterval <= stime[5]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= stime[6] && surfaceinterval <= stime[7]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= stime[8] && surfaceinterval <= stime[9]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= stime[10] && surfaceinterval <= stime[11]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= stime[12] && surfaceinterval <= stime[13]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= stime[14] && surfaceinterval <= stime[15]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= stime[16] && surfaceinterval <= stime[17]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= stime[18] && surfaceinterval <= stime[19]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= stime[20] && surfaceinterval <= stime[21]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= stime[22] && surfaceinterval <= stime[23]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= stime[24] && surfaceinterval <= stime[25]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= stime[26] && surfaceinterval <= stime[27]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= stime[28] && surfaceinterval <= stime[29]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= stime[30] && surfaceinterval <= stime[31]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= stime[32] && surfaceinterval <= stime[33]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= stime[34] && surfaceinterval <= stime[35]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= stime[36] && surfaceinterval <= stime[37]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgr(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37
        int[] rtime = {0, 3, 4, 7, 8, 11, 12, 15, 16, 19, 20, 24, 25, 29, 30, 34, 35, 40, 41, 46, 47, 52, 53, 59, 60, 67, 68, 75, 76, 84, 85, 106, 107, 154, 155, 335};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= rtime[0] && surfaceinterval <= rtime[1]) {
            aftersurfacepg = 'R';
        } else if (surfaceinterval >= rtime[2] && surfaceinterval <= rtime[3]) {
            aftersurfacepg = 'Q';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[4] && surfaceinterval <= rtime[5]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[6] && surfaceinterval <= rtime[7]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[8] && surfaceinterval <= rtime[9]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[10] && surfaceinterval <= rtime[11]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[12] && surfaceinterval <= rtime[13]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[14] && surfaceinterval <= rtime[15]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[16] && surfaceinterval <= rtime[17]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[18] && surfaceinterval <= rtime[19]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[20] && surfaceinterval <= rtime[21]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[22] && surfaceinterval <= rtime[23]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[24] && surfaceinterval <= rtime[25]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[26] && surfaceinterval <= rtime[27]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[28] && surfaceinterval <= rtime[29]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[30] && surfaceinterval <= rtime[31]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[32] && surfaceinterval <= rtime[33]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= rtime[34] && surfaceinterval <= rtime[35]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            //noinspection deprecation
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgq(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33
        int[] qtime = {0, 3, 4, 7, 8, 11, 12, 16, 17, 20, 21, 25, 26, 30, 31, 36, 37, 42, 43, 48, 49, 55, 56, 63, 64, 71, 72, 80, 81, 102, 103, 150, 151, 331};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= qtime[0] && surfaceinterval <= qtime[1]) {
            aftersurfacepg = 'Q';
        } else if (surfaceinterval >= qtime[2] && surfaceinterval <= qtime[3]) {
            aftersurfacepg = 'P';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[4] && surfaceinterval <= qtime[5]) {
            aftersurfacepg = 'O';    //noinspection deprecation
            System.out.println("after surface pg in the method is: " + aftersurfacepg);
        } else if (surfaceinterval >= qtime[6] && surfaceinterval <= qtime[7]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[8] && surfaceinterval <= qtime[9]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[10] && surfaceinterval <= qtime[11]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[12] && surfaceinterval <= qtime[13]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[14] && surfaceinterval <= qtime[15]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[16] && surfaceinterval <= qtime[17]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[18] && surfaceinterval <= qtime[19]) {
            aftersurfacepg = 'H';    //noinspection deprecation
            System.out.println("after surface pg in the method is: " + aftersurfacepg);
        } else if (surfaceinterval >= qtime[20] && surfaceinterval <= qtime[21]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[22] && surfaceinterval <= qtime[23]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[24] && surfaceinterval <= qtime[25]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[26] && surfaceinterval <= qtime[27]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[28] && surfaceinterval <= qtime[29]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[30] && surfaceinterval <= qtime[31]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= qtime[32] && surfaceinterval <= qtime[33]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else           aftersurfacepg = '@';
        return aftersurfacepg;
    }

    static char aftersurfacepgp(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ptime = {0, 3, 4, 7, 8, 12, 13, 16, 17, 21, 22, 27, 28, 32, 33, 38, 39, 45, 46, 51, 52, 59, 60, 67, 68, 76, 77, 98, 99, 147, 148, 328};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ptime[0] && surfaceinterval <= ptime[1]) {
            aftersurfacepg = 'P';
        } else if (surfaceinterval >= ptime[2] && surfaceinterval <= ptime[3]) {
            aftersurfacepg = 'O';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[4] && surfaceinterval <= ptime[5]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[6] && surfaceinterval <= ptime[7]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[8] && surfaceinterval <= ptime[9]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[10] && surfaceinterval <= ptime[11]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[12] && surfaceinterval <= ptime[13]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[14] && surfaceinterval <= ptime[15]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[16] && surfaceinterval <= ptime[17]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[18] && surfaceinterval <= ptime[19]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[20] && surfaceinterval <= ptime[21]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[22] && surfaceinterval <= ptime[23]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[24] && surfaceinterval <= ptime[25]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[26] && surfaceinterval <= ptime[27]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[28] && surfaceinterval <= ptime[29]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ptime[30] && surfaceinterval <= ptime[31]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';
        return aftersurfacepg;
    }

    static char aftersurfacepgo(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] otime = {0, 3, 4, 8, 9, 12, 13, 17, 18, 23, 24, 28, 29, 34, 35, 41, 42, 47, 48, 55, 56, 73, 74, 82, 83, 94, 95, 143, 144, 324};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= otime[0] && surfaceinterval <= otime[1]) {
            aftersurfacepg = 'O';
        } else if (surfaceinterval >= otime[2] && surfaceinterval <= otime[3]) {
            aftersurfacepg = 'N';    //noinspection deprecation
        } else if (surfaceinterval >= otime[4] && surfaceinterval <= otime[5]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= otime[6] && surfaceinterval <= otime[7]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= otime[8] && surfaceinterval <= otime[9]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= otime[10] && surfaceinterval <= otime[11]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= otime[12] && surfaceinterval <= otime[13]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= otime[14] && surfaceinterval <= otime[15]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= otime[16] && surfaceinterval <= otime[17]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= otime[18] && surfaceinterval <= otime[19]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= otime[20] && surfaceinterval <= otime[21]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= otime[22] && surfaceinterval <= otime[23]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= otime[24] && surfaceinterval <= otime[25]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= otime[26] && surfaceinterval <= otime[27]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= otime[28] && surfaceinterval <= otime[29]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgn(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ntime = {0, 3, 4, 8, 9, 13, 14, 18, 19, 24, 25, 30, 31, 36, 37, 43, 44, 51, 52, 59, 60, 68, 69, 90, 91, 138, 139, 319};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ntime[0] && surfaceinterval <= ntime[1]) {
            aftersurfacepg = 'N';
        } else if (surfaceinterval >= ntime[2] && surfaceinterval <= ntime[3]) {
            aftersurfacepg = 'M';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[4] && surfaceinterval <= ntime[5]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[6] && surfaceinterval <= ntime[7]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[8] && surfaceinterval <= ntime[9]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[10] && surfaceinterval <= ntime[11]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[12] && surfaceinterval <= ntime[13]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[14] && surfaceinterval <= ntime[15]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[16] && surfaceinterval <= ntime[17]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[18] && surfaceinterval <= ntime[19]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[20] && surfaceinterval <= ntime[21]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[22] && surfaceinterval <= ntime[23]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[24] && surfaceinterval <= ntime[25]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ntime[26] && surfaceinterval <= ntime[27]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgm(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] mtime = {0, 4, 5, 9, 10, 14, 15, 19, 20, 25, 26, 32, 33, 39, 40, 46, 47, 55, 56, 64, 65, 85, 86, 134, 135, 315};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= mtime[0] && surfaceinterval <= mtime[1]) {
            aftersurfacepg = 'M';
        } else if (surfaceinterval >= mtime[2] && surfaceinterval <= mtime[3]) {
            aftersurfacepg = 'L';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[4] && surfaceinterval <= mtime[5]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[6] && surfaceinterval <= mtime[7]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[8] && surfaceinterval <= mtime[9]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[10] && surfaceinterval <= mtime[11]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[12] && surfaceinterval <= mtime[13]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[14] && surfaceinterval <= mtime[15]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[16] && surfaceinterval <= mtime[17]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[18] && surfaceinterval <= mtime[19]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[20] && surfaceinterval <= mtime[21]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[22] && surfaceinterval <= mtime[23]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= mtime[24] && surfaceinterval <= mtime[25]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgl(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ltime = {0, 4, 5, 9, 10, 15, 16, 21, 22, 27, 28, 34, 35, 42, 43, 50, 51, 59, 60, 81, 82, 129, 130, 310};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ltime[0] && surfaceinterval <= ltime[1]) {
            aftersurfacepg = 'L';
        } else if (surfaceinterval >= ltime[2] && surfaceinterval <= ltime[3]) {
            aftersurfacepg = 'K';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[4] && surfaceinterval <= ltime[5]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[6] && surfaceinterval <= ltime[7]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[8] && surfaceinterval <= ltime[9]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[10] && surfaceinterval <= ltime[11]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[12] && surfaceinterval <= ltime[13]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[14] && surfaceinterval <= ltime[15]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[16] && surfaceinterval <= ltime[17]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[18] && surfaceinterval <= ltime[19]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[20] && surfaceinterval <= ltime[21]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ltime[22] && surfaceinterval <= ltime[23]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgk(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ktime = {0, 4, 5, 10, 11, 16, 17, 22, 23, 29, 30, 37, 38, 45, 46, 54, 55, 76, 77, 124, 125, 305};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ktime[0] && surfaceinterval <= ktime[1]) {
            aftersurfacepg = 'K';
        } else if (surfaceinterval >= ktime[2] && surfaceinterval <= ktime[3]) {
            aftersurfacepg = 'J';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[4] && surfaceinterval <= ktime[5]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[6] && surfaceinterval <= ktime[7]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[8] && surfaceinterval <= ktime[9]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[10] && surfaceinterval <= ktime[11]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[12] && surfaceinterval <= ktime[13]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[14] && surfaceinterval <= ktime[15]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[16] && surfaceinterval <= ktime[17]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[18] && surfaceinterval <= ktime[19]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ktime[20] && surfaceinterval <= ktime[21]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgj(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] jtime = {0, 5, 6, 11, 12, 17, 18, 24, 25, 31, 32, 40, 41, 49, 50, 71, 72, 119, 120, 300};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= jtime[0] && surfaceinterval <= jtime[1]) {
            aftersurfacepg = 'J';
        } else if (surfaceinterval >= jtime[2] && surfaceinterval <= jtime[3]) {
            aftersurfacepg = 'I';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[4] && surfaceinterval <= jtime[5]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[6] && surfaceinterval <= jtime[7]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[8] && surfaceinterval <= jtime[9]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[10] && surfaceinterval <= jtime[11]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[12] && surfaceinterval <= jtime[13]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[14] && surfaceinterval <= jtime[15]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[16] && surfaceinterval <= jtime[17]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= jtime[18] && surfaceinterval <= jtime[19]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else           aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgi(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] itime = {0, 5, 6, 11, 12, 18, 19, 26, 27, 34, 35, 43, 44, 65, 66, 113, 114, 294};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= itime[0] && surfaceinterval <= itime[1]) {
            aftersurfacepg = 'I';
        } else if (surfaceinterval >= itime[2] && surfaceinterval <= itime[3]) {
            aftersurfacepg = 'H';    //noinspection deprecation
        } else if (surfaceinterval >= itime[4] && surfaceinterval <= itime[5]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= itime[6] && surfaceinterval <= itime[7]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= itime[8] && surfaceinterval <= itime[9]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= itime[10] && surfaceinterval <= itime[11]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= itime[12] && surfaceinterval <= itime[13]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= itime[14] && surfaceinterval <= itime[15]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= itime[16] && surfaceinterval <= itime[17]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgh(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] htime = {0, 5, 6, 12, 13, 20, 21, 28, 29, 37, 38, 59, 60, 107, 108, 288};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= htime[0] && surfaceinterval <= htime[1]) {
            aftersurfacepg = 'H';
        } else if (surfaceinterval >= htime[2] && surfaceinterval <= htime[3]) {
            aftersurfacepg = 'G';    //noinspection deprecation
        } else if (surfaceinterval >= htime[4] && surfaceinterval <= htime[5]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= htime[6] && surfaceinterval <= htime[7]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= htime[8] && surfaceinterval <= htime[9]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= htime[10] && surfaceinterval <= htime[11]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= htime[12] && surfaceinterval <= htime[13]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= htime[14] && surfaceinterval <= htime[15]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgg(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] gtime = {0, 6, 7, 13, 14, 22, 23, 31, 32, 53, 54, 101, 102, 282};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= gtime[0] && surfaceinterval <= gtime[1]) {
            aftersurfacepg = 'G';
            //noinspection deprecation
        } else if (surfaceinterval >= gtime[2] && surfaceinterval <= gtime[3]) {
            aftersurfacepg = 'F';    //noinspection deprecation
        } else if (surfaceinterval >= gtime[4] && surfaceinterval <= gtime[5]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= gtime[6] && surfaceinterval <= gtime[7]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= gtime[8] && surfaceinterval <= gtime[9]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= gtime[10] && surfaceinterval <= gtime[11]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= gtime[12] && surfaceinterval <= gtime[13]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgf(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ftime = {0, 7, 8, 15, 16, 24, 25, 46, 47, 94, 95, 275};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ftime[0] && surfaceinterval <= ftime[1]) {
            aftersurfacepg = 'F';
        } else if (surfaceinterval >= ftime[2] && surfaceinterval <= ftime[3]) {
            aftersurfacepg = 'E';    //noinspection deprecation
        } else if (surfaceinterval >= ftime[4] && surfaceinterval <= ftime[5]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= ftime[6] && surfaceinterval <= ftime[7]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= ftime[8] && surfaceinterval <= ftime[9]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ftime[10] && surfaceinterval <= ftime[11]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepge(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] etime = {0, 7, 8, 16, 17, 38, 39, 87, 88, 268};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= etime[0] && surfaceinterval <= etime[1]) {
            aftersurfacepg = 'E';
        } else if (surfaceinterval >= etime[2] && surfaceinterval <= etime[3]) {
            aftersurfacepg = 'D';    //noinspection deprecation
        } else if (surfaceinterval >= etime[4] && surfaceinterval <= etime[5]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= etime[6] && surfaceinterval <= etime[7]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= etime[8] && surfaceinterval <= etime[9]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgd(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] dtime = {0, 8, 9, 30, 31, 78, 79, 259};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= dtime[0] && surfaceinterval <= dtime[1]) {
            aftersurfacepg = 'D';
            //noinspection deprecation
        } else if (surfaceinterval >= dtime[2] && surfaceinterval <= dtime[3]) {
            aftersurfacepg = 'C';    //noinspection deprecation
        } else if (surfaceinterval >= dtime[4] && surfaceinterval <= dtime[5]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= dtime[6] && surfaceinterval <= dtime[7]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static char aftersurfacepgc(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] ctime = {0, 21, 22, 79, 80, 250};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= ctime[0] && surfaceinterval <= ctime[1]) {
            aftersurfacepg = 'C';
        } else if (surfaceinterval >= ctime[2] && surfaceinterval <= ctime[3]) {
            aftersurfacepg = 'B';    //noinspection deprecation
        } else if (surfaceinterval >= ctime[4] && surfaceinterval <= ctime[5]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';
        return aftersurfacepg;
    }

    static char aftersurfacepgb(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] btime = {0, 47, 48, 228};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= btime[0] && surfaceinterval <= btime[1]) {
            aftersurfacepg = 'B';
        } else if (surfaceinterval >= btime[2] && surfaceinterval <= btime[3]) {
            aftersurfacepg = 'A';    //noinspection deprecation
        } else
            aftersurfacepg = '@';
        return aftersurfacepg;
    }

    static char aftersurfacepga(int surfaceinterval, char currentpg) {
        //             0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
        int[] atime = {0, 180};
        char aftersurfacepg = ' ';

        if (surfaceinterval >= atime[0] && surfaceinterval <= atime[1]) {
            aftersurfacepg = 'A';
        } else
            aftersurfacepg = '@';

        return aftersurfacepg;
    }

    static int getmaxtimeseconddive(int depthrange2) {
        int maxd = 0;
        int[] d35 = {0, 10, 19, 25, 29, 32, 36, 40, 44, 48, 52, 57, 62, 67, 73, 79, 85, 92, 100, 108, 117, 127, 139, 152, 168, 188, 205};
        int[] d40 = {0, 9, 16, 22, 25, 27, 31, 34, 37, 40, 44, 48, 51, 55, 60, 64, 69, 74, 79, 85, 91, 97, 104, 111, 120, 129, 140};
        int[] d50 = {0, 7, 13, 17, 19, 21, 24, 26, 28, 31, 33, 36, 39, 41, 44, 47, 50, 53, 57, 60, 63, 67, 71, 75, 80};
        int[] d60 = {0, 6, 11, 14, 16, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 42, 44, 47, 49, 52, 54, 55};
        int[] d70 = {0, 5, 9, 12, 13, 15, 16, 18, 19, 21, 22, 24, 26, 27, 29, 31, 33, 35, 36, 38, 40};
        int[] d80 = {0, 4, 8, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22, 23, 25, 26, 28, 29, 30};
        int[] d90 = {0, 4, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25};
        int[] d100 = {0, 3, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] d110 = {0, 3, 6, 7, 8, 9, 10, 11, 12, 13, 0, 14, 15, 16};
        int[] d120 = {0, 3, 5, 6, 7, 8, 9, 10, 11, 0, 12, 13};
        int[] d130 = {0, 3, 5, 6, 7, 0, 8, 9, 10};
        int[] d140 = {0, 0, 4, 5, 6, 7, 8};

        switch (depthrange2) {
            case 35:
                int d21 = d35[d35.length - 1];
                maxd = d21;
                break;
            case 40:
                int d22 = d40[d40.length - 1];
                maxd = d22;
                break;
            case 50:
                int d23 = d50[d50.length - 1];
                maxd = d23;
                break;
            case 60:
                int d24 = d60[d60.length - 1];
                maxd = d24;
                break;
            case 70:
                int d25 = d70[d70.length - 1];
                maxd = d25;
                break;
            case 80:
                int d26 = d80[d80.length - 1];
                maxd = d26;
                break;
            case 90:
                int d27 = d90[d90.length - 1];
                maxd = d27;
                break;
            case 100:
                int d28 = d100[d100.length - 1];
                maxd = d28;
                break;
            case 110:
                int d29 = d110[d110.length - 1];
                maxd = d29;
                break;
            case 120:
                int d210 = d120[d120.length - 1];
                maxd = d210;
                break;
            case 130:
                int d211 = d130[d130.length - 1];
                maxd = d211;
                break;
            case 140:
                int d212 = d140[d140.length - 1];
                maxd = d212;
                break;

            default:
                System.out.print("Default run! : ERROR!");
                maxd = 0;
        }

        return maxd;
    }

    static int getotalbottomtime(int depthrange2, char h, int t) {
        int value;
        int[] rnta = {0, 10, 9, 7, 6, 5, 4, 4, 3, 3, 3, 3};
        int[] rntb = {0, 19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5};
        int[] rntc = {0, 25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6};
        int[] rntd = {0, 29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7};
        int[] rnte = {0, 32, 27, 21, 17, 15, 13, 11, 10, 9, 8, 8, 0};
        int[] rntf = {0, 36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8};
        int[] rntg = {0, 40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9};
        int[] rnth = {0, 44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10};
        int[] rnti = {0, 48, 40, 31, 25, 21, 18, 16, 14, 13, 12};
        int[] rntj = {0, 52, 44, 33, 27, 22, 19, 17, 15, 14, 12};
        int[] rntk = {0, 57, 48, 36, 29, 24, 21, 18, 16, 14, 13};
        int[] rntl = {0, 62, 51, 38, 31, 26, 22, 19, 17, 15};
        int[] rntm = {0, 67, 55, 41, 33, 27, 23, 21, 18, 16};
        int[] rntn = {0, 73, 60, 44, 35, 29, 25, 22, 19};
        int[] rnto = {0, 79, 64, 47, 37, 31, 26, 23, 20};
        int[] rntp = {0, 85, 69, 71, 50, 39, 33, 28, 24};
        int[] rntq = {0, 92, 74, 53, 42, 34, 29, 25};
        int[] rntr = {0, 100, 79, 57, 44, 36, 30};
        int[] rnts = {0, 108, 85, 60, 47, 38};
        int[] rntt = {0, 117, 91, 63, 49, 40};
        int[] rntu = {0, 127, 97, 67, 52};
        int[] rntv = {0, 139, 104, 71, 54};
        int[] rntw = {0, 152, 111, 75, 55};
        int[] rntx = {0, 168, 120, 80};
        int[] rnty = {0, 188, 129};
        int[] rntz = {0, 205, 140};

        switch (h) {
            case 'A':
                switch (depthrange2) {
                    case 35:
                        value = t - rnta[1];
                        break;
                    case 40:
                        value = t - rnta[2];
                        break;
                    case 50:
                        value = t - rnta[3];
                        break;
                    case 60:
                        value = t - rnta[4];
                        break;
                    case 70:
                        value = t - rnta[5];
                        break;
                    case 80:
                        value = t - rnta[6];
                        break;
                    case 90:
                        value = t - rnta[7];
                        break;
                    case 100:
                        value = t - rnta[8];
                        break;
                    case 110:
                        value = t - rnta[9];
                        break;
                    case 120:
                        value = t - rnta[10];
                        break;
                    case 130:
                        value = t - rnta[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("switch in the switch is default!!!!!!");
                }
                break;
            case 'B':
                switch (depthrange2) {
                    case 35:
                        value = t - rntb[1];
                        break;
                    case 40:
                        value = t - rntb[2];
                        break;
                    case 50:
                        value = t - rntb[3];
                        break;
                    case 60:
                        value = t - rntb[4];
                        break;
                    case 70:
                        value = t - rntb[5];
                        break;
                    case 80:
                        value = t - rntb[6];
                        break;
                    case 90:
                        value = t - rntb[7];
                        break;
                    case 100:
                        value = t - rntb[8];
                        break;
                    case 110:
                        value = t - rntb[9];
                        break;
                    case 120:
                        value = t - rntb[10];
                        break;
                    case 130:
                        value = t - rntb[11];
                        break;
                    default:
                        value = -1;
                }
                break;
            case 'C':
                switch (depthrange2) {
                    case 35:
                        value = t - rntc[1];
                        break;
                    case 40:
                        value = t - rntc[2];
                        break;
                    case 50:
                        value = t - rntc[3];
                        break;
                    case 60:
                        value = t - rntc[4];
                        break;
                    case 70:
                        value = t - rntc[5];
                        break;
                    case 80:
                        value = t - rntc[6];
                        break;
                    case 90:
                        value = t - rntc[7];
                        break;
                    case 100:
                        value = t - rntc[8];
                        break;
                    case 110:
                        value = t - rntc[9];
                        break;
                    case 120:
                        value = t - rntc[10];
                        break;
                    case 130:
                        value = t - rntc[11];
                        break;
                    default:
                        value = -1;
                }
                break;
            case 'D':
                switch (depthrange2) {
                    case 35:
                        value = t - rntd[1];
                        break;
                    case 40:
                        value = t - rntd[2];
                        break;
                    case 50:
                        value = t - rntd[3];
                        break;
                    case 60:
                        value = t - rntd[4];
                        break;
                    case 70:
                        value = t - rntd[5];
                        break;
                    case 80:
                        value = t - rntd[6];
                        break;
                    case 90:
                        value = t - rntd[7];
                        break;
                    case 100:
                        value = t - rntd[8];
                        break;
                    case 110:
                        value = t - rntd[9];
                        break;
                    case 120:
                        value = t - rntd[10];
                        break;
                    case 130:
                        value = t - rntd[11];
                        break;
                    default:
                        value = -1;
                }

                break;
            case 'E':
                switch (depthrange2) {
                    case 35:
                        value = t - rnte[1];
                        break;
                    case 40:
                        value = t - rnte[2];
                        break;
                    case 50:
                        value = t - rnte[3];
                        break;
                    case 60:
                        value = t - rnte[4];
                        break;
                    case 70:
                        value = t - rnte[5];
                        break;
                    case 80:
                        value = t - rnte[6];
                        break;
                    case 90:
                        value = t - rnte[7];
                        break;
                    case 100:
                        value = t - rnte[8];
                        break;
                    case 110:
                        value = t - rnte[9];
                        break;
                    case 120:
                        value = t - rnte[10];
                        break;
                    case 130:
                        value = t - rnte[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }

                break;
            case 'F':
                switch (depthrange2) {
                    case 35:
                        value = t - rntf[1];
                        break;
                    case 40:
                        value = t - rntf[2];
                        break;
                    case 50:
                        value = t - rntf[3];
                        break;
                    case 60:
                        value = t - rntf[4];
                        break;
                    case 70:
                        value = t - rntf[5];
                        break;
                    case 80:
                        value = t - rntf[6];
                        break;
                    case 90:
                        value = t - rntf[7];
                        break;
                    case 100:
                        value = t - rntf[8];
                        break;
                    case 110:
                        value = t - rntf[9];
                        break;
                    case 120:
                        value = t - rntf[10];
                        break;
                    case 130:
                        value = t - rntf[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'G':
                switch (depthrange2) {
                    case 35:
                        value = t - rntg[1];
                        break;
                    case 40:
                        value = t - rntg[2];
                        break;
                    case 50:
                        value = t - rntg[3];
                        break;
                    case 60:
                        value = t - rntg[4];
                        break;
                    case 70:
                        value = t - rntg[5];
                        break;
                    case 80:
                        value = t - rntg[6];
                        break;
                    case 90:
                        value = t - rntg[7];
                        break;
                    case 100:
                        value = t - rntg[8];
                        break;
                    case 110:
                        value = t - rntg[9];
                        break;
                    case 120:
                        value = t - rntg[10];
                        break;
                    case 130:
                        value = t - rntg[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'H':
                switch (depthrange2) {
                    case 35:
                        value = t - rnth[1];
                        break;
                    case 40:
                        value = t - rnth[2];
                        break;
                    case 50:
                        value = t - rnth[3];
                        break;
                    case 60:
                        value = t - rnth[4];
                        break;
                    case 70:
                        value = t - rnth[5];
                        break;
                    case 80:
                        value = t - rnth[6];
                        break;
                    case 90:
                        value = t - rnth[7];
                        break;
                    case 100:
                        value = t - rnth[8];
                        break;
                    case 110:
                        value = t - rnth[9];
                        break;
                    case 120:
                        value = t - rnth[10];
                        break;
                    case 130:
                        value = t - rnth[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'I':
                switch (depthrange2) {
                    case 35:
                        value = t - rnti[1];
                        break;
                    case 40:
                        value = t - rnti[2];
                        break;
                    case 50:
                        value = t - rnti[3];
                        break;
                    case 60:
                        value = t - rnti[4];
                        break;
                    case 70:
                        value = t - rnti[5];
                        break;
                    case 80:
                        value = t - rnti[6];
                        break;
                    case 90:
                        value = t - rnti[7];
                        break;
                    case 100:
                        value = t - rnti[8];
                        break;
                    case 110:
                        value = t - rnti[9];
                        break;
                    case 120:
                        value = t - rnti[10];
                        break;
                    case 130:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'J':
                switch (depthrange2) {
                    case 35:
                        value = t - rntj[1];
                        break;
                    case 40:
                        value = t - rntj[2];
                        break;
                    case 50:
                        value = t - rntj[3];
                        break;
                    case 60:
                        value = t - rntj[4];
                        break;
                    case 70:
                        value = t - rntj[5];
                        break;
                    case 80:
                        value = t - rntj[6];
                        break;
                    case 90:
                        value = t - rntj[7];
                        break;
                    case 100:
                        value = t - rntj[8];
                        break;
                    case 110:
                        value = t - rntj[9];
                        break;
                    case 120:
                        value = t - rntj[10];
                        break;
                    case 130:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'K':
                switch (depthrange2) {
                    case 35:
                        value = t - rntk[1];
                        break;
                    case 40:
                        value = t - rntk[2];
                        break;
                    case 50:
                        value = t - rntk[3];
                        break;
                    case 60:
                        value = t - rntk[4];
                        break;
                    case 70:
                        value = t - rntk[5];
                        break;
                    case 80:
                        value = t - rntk[6];
                        break;
                    case 90:
                        value = t - rntk[7];
                        break;
                    case 100:
                        value = t - rntk[8];
                        break;
                    case 110:
                        value = t - rntk[9];
                        break;
                    case 120:
                        value = t - rntk[10];
                        break;
                    case 130:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'L':
                switch (depthrange2) {
                    case 35:
                        value = t - rntl[1];
                        break;
                    case 40:
                        value = t - rntl[2];
                        break;
                    case 50:
                        value = t - rntl[3];
                        break;
                    case 60:
                        value = t - rntl[4];
                        break;
                    case 70:
                        value = t - rntl[5];
                        break;
                    case 80:
                        value = t - rntl[6];
                        break;
                    case 90:
                        value = t - rntl[7];
                        break;
                    case 100:
                        value = t - rntl[8];
                        break;
                    case 110:
                        value = t - rntl[9];
                        break;
                    case 120:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    case 130:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'M':
                switch (depthrange2) {
                    case 35:
                        value = t - rntm[1];
                        break;
                    case 40:
                        value = t - rntm[2];
                        break;
                    case 50:
                        value = t - rntm[3];
                        break;
                    case 60:
                        value = t - rntm[4];
                        break;
                    case 70:
                        value = t - rntm[5];
                        break;
                    case 80:
                        value = t - rntm[6];
                        break;
                    case 90:
                        value = t - rntm[7];
                        break;
                    case 100:
                        value = t - rntm[8];
                        break;
                    case 110:
                        value = t - rntm[9];
                        break;
                    case 120:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    case 130:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'N':
                switch (depthrange2) {
                    case 35:
                        value = t - rntn[1];
                        break;
                    case 40:
                        value = t - rntn[2];
                        break;
                    case 50:
                        value = t - rntn[3];
                        break;
                    case 60:
                        value = t - rntn[4];
                        break;
                    case 70:
                        value = t - rntn[5];
                        break;
                    case 80:
                        value = t - rntn[6];
                        break;
                    case 90:
                        value = t - rntn[7];
                        break;
                    case 100:
                        value = t - rntn[8];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'O':
                switch (depthrange2) {
                    case 35:
                        value = t - rnto[1];
                        break;
                    case 40:
                        value = t - rnto[2];
                        break;
                    case 50:
                        value = t - rnto[3];
                        break;
                    case 60:
                        value = t - rnto[4];
                        break;
                    case 70:
                        value = t - rnto[5];
                        break;
                    case 80:
                        value = t - rnto[6];
                        break;
                    case 90:
                        value = t - rnto[7];
                        break;
                    case 100:
                        value = t - rnto[8];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'P':
                switch (depthrange2) {
                    case 35:
                        value = t - rntp[1];
                        break;
                    case 40:
                        value = t - rntp[2];
                        break;
                    case 50:
                        value = t - rntp[3];
                        break;
                    case 60:
                        value = t - rntp[4];
                        break;
                    case 70:
                        value = t - rntp[5];
                        break;
                    case 80:
                        value = t - rntp[6];
                        break;
                    case 90:
                        value = t - rntp[7];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Q':
                switch (depthrange2) {
                    case 35:
                        value = t - rntq[1];
                        break;
                    case 40:
                        value = t - rntq[2];
                        break;
                    case 50:
                        value = t - rntq[3];
                        break;
                    case 60:
                        value = t - rntq[4];
                        break;
                    case 70:
                        value = t - rntq[5];
                        break;
                    case 80:
                        value = t - rntq[6];
                        break;
                    case 90:
                        value = t - rntq[7];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'R':
                switch (depthrange2) {
                    case 35:
                        value = t - rntr[1];
                        break;
                    case 40:
                        value = t - rntr[2];
                        break;
                    case 50:
                        value = t - rntr[3];
                        break;
                    case 60:
                        value = t - rntr[4];
                        break;
                    case 70:
                        value = t - rntr[5];
                        break;
                    case 80:
                        value = t - rntr[6];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'S':
                switch (depthrange2) {
                    case 35:
                        value = t - rnts[1];
                        break;
                    case 40:
                        value = t - rnts[2];
                        break;
                    case 50:
                        value = t - rnts[3];
                        break;
                    case 60:
                        value = t - rnts[4];
                        break;
                    case 70:
                        value = t - rnts[5];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'T':
                switch (depthrange2) {
                    case 35:
                        value = t - rntt[1];
                        break;
                    case 40:
                        value = t - rntt[2];
                        break;
                    case 50:
                        value = t - rntt[3];
                        break;
                    case 60:
                        value = t - rntt[4];
                        break;
                    case 70:
                        value = t - rntt[5];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'U':
                switch (depthrange2) {
                    case 35:
                        value = t - rntu[1];
                        break;
                    case 40:
                        value = t - rntu[2];
                        break;
                    case 50:
                        value = t - rntu[3];
                        break;
                    case 60:
                        value = t - rntu[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'V':
                switch (depthrange2) {
                    case 35:
                        value = t - rntv[1];
                        break;
                    case 40:
                        value = t - rntv[2];
                        break;
                    case 50:
                        value = t - rntv[3];
                        break;
                    case 60:
                        value = t - rntv[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'W':
                switch (depthrange2) {
                    case 35:
                        value = t - rntw[1];
                        break;
                    case 40:
                        value = t - rntw[2];
                        break;
                    case 50:
                        value = t - rntw[3];
                        break;
                    case 60:
                        value = t - rntw[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'X':
                switch (depthrange2) {
                    case 35:
                        value = t - rntx[1];
                        break;
                    case 40:
                        value = t - rntx[2];
                        break;
                    case 50:
                        value = t - rntx[3];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Y':
                switch (depthrange2) {
                    case 35:
                        value = t - rnty[1];
                        break;
                    case 40:
                        value = t - rnty[2];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Z':
                switch (depthrange2) {
                    case 35:
                        value = t - rntz[1];
                        break;
                    case 40:
                        value = t - rntz[2];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            default:
                value = -1;
        }
        return value;
    }

    static int get2nddiveRNT(int depthrange2, char h) {
        int value;
        int[] rnta = {0, 10, 9, 7, 6, 5, 4, 4, 3, 3, 3, 3};
        int[] rntb = {0, 19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5};
        int[] rntc = {0, 25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6};
        int[] rntd = {0, 29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7};
        int[] rnte = {0, 32, 27, 21, 17, 15, 13, 11, 10, 9, 8, 8, 0};
        int[] rntf = {0, 36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8};
        int[] rntg = {0, 40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9};
        int[] rnth = {0, 44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10};
        int[] rnti = {0, 48, 40, 31, 25, 21, 18, 16, 14, 13, 12};
        int[] rntj = {0, 52, 44, 33, 27, 22, 19, 17, 15, 14, 12};
        int[] rntk = {0, 57, 48, 36, 29, 24, 21, 18, 16, 14, 13};
        int[] rntl = {0, 62, 51, 38, 31, 26, 22, 19, 17, 15};
        int[] rntm = {0, 67, 55, 41, 33, 27, 23, 21, 18, 16};
        int[] rntn = {0, 73, 60, 44, 35, 29, 25, 22, 19};
        int[] rnto = {0, 79, 64, 47, 37, 31, 26, 23, 20};
        int[] rntp = {0, 85, 69, 71, 50, 39, 33, 28, 24};
        int[] rntq = {0, 92, 74, 53, 42, 34, 29, 25};
        int[] rntr = {0, 100, 79, 57, 44, 36, 30};
        int[] rnts = {0, 108, 85, 60, 47, 38};
        int[] rntt = {0, 117, 91, 63, 49, 40};
        int[] rntu = {0, 127, 97, 67, 52};
        int[] rntv = {0, 139, 104, 71, 54};
        int[] rntw = {0, 152, 111, 75, 55};
        int[] rntx = {0, 168, 120, 80};
        int[] rnty = {0, 188, 129};
        int[] rntz = {0, 205, 140};

        switch (h) {
            case 'A':
                switch (depthrange2) {
                    case 35:
                        value = rnta[1];
                        break;
                    case 40:
                        value = rnta[2];
                        break;
                    case 50:
                        value = rnta[3];
                        break;
                    case 60:
                        value = rnta[4];
                        break;
                    case 70:
                        value = rnta[5];
                        break;
                    case 80:
                        value = rnta[6];
                        break;
                    case 90:
                        value = rnta[7];
                        break;
                    case 100:
                        value = rnta[8];
                        break;
                    case 110:
                        value = rnta[9];
                        break;
                    case 120:
                        value = rnta[10];
                        break;
                    case 130:
                        value = rnta[11];
                        break;

                    default:
                        value = 0;
                        System.out.print("switch in the switch is default!!!!!!");
                }
                break;
            case 'B':
                switch (depthrange2) {
                    case 35:
                        value = rntb[1];
                        break;
                    case 40:
                        value = rntb[2];
                        break;
                    case 50:
                        value = rntb[3];
                        break;
                    case 60:
                        value = rntb[4];
                        break;
                    case 70:
                        value = rntb[5];
                        break;
                    case 80:
                        value = rntb[6];
                        break;
                    case 90:
                        value = rntb[7];
                        break;
                    case 100:
                        value = rntb[8];
                        break;
                    case 110:
                        value = rntb[9];
                        break;
                    case 120:
                        value = rntb[10];
                        break;
                    case 130:
                        value = rntb[11];
                        break;
                    default:
                        value = 0;
                        System.out.print("switch in the switch is default!!!!!!");
                }

                break;
            case 'C':
                switch (depthrange2) {
                    case 35:
                        value = rntc[1];
                        break;
                    case 40:
                        value = rntc[2];
                        break;
                    case 50:
                        value = rntc[3];
                        break;
                    case 60:
                        value = rntc[4];
                        break;
                    case 70:
                        value = rntc[5];
                        break;
                    case 80:
                        value = rntc[6];
                        break;
                    case 90:
                        value = rntc[7];
                        break;
                    case 100:
                        value = rntc[8];
                        break;
                    case 110:
                        value = rntc[9];
                        break;
                    case 120:
                        value = rntc[10];
                        break;
                    case 130:
                        value = rntc[11];
                        break;
                    default:
                        value = 0;
                        System.out.print("switch in the switch is default!!!!!!");
                }
                break;
            case 'D':
                switch (depthrange2) {
                    case 35:
                        value = rntd[1];
                        break;
                    case 40:
                        value = rntd[2];
                        break;
                    case 50:
                        value = rntd[3];
                        break;
                    case 60:
                        value = rntd[4];
                        break;
                    case 70:
                        value = rntd[5];
                        break;
                    case 80:
                        value = rntd[6];
                        break;
                    case 90:
                        value = rntd[7];
                        break;
                    case 100:
                        value = rntd[8];
                        break;
                    case 110:
                        value = rntd[9];
                        break;
                    case 120:
                        value = rntd[10];
                        break;
                    case 130:
                        value = rntd[11];
                        break;
                    default:
                        value = 0;
                        System.out.print("switch in the switch is default!!!!!!");
                }

                break;
            case 'E':
                switch (depthrange2) {
                    case 35:
                        value = rnte[1];
                        break;
                    case 40:
                        value = rnte[2];
                        break;
                    case 50:
                        value = rnte[3];
                        break;
                    case 60:
                        value = rnte[4];
                        break;
                    case 70:
                        value = rnte[5];
                        break;
                    case 80:
                        value = rnte[6];
                        break;
                    case 90:
                        value = rnte[7];
                        break;
                    case 100:
                        value = rnte[8];
                        break;
                    case 110:
                        value = rnte[9];
                        break;
                    case 120:
                        value = rnte[10];
                        break;
                    case 130:
                        value = rnte[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }

                break;
            case 'F':
                switch (depthrange2) {
                    case 35:
                        value = rntf[1];
                        break;
                    case 40:
                        value = rntf[2];
                        break;
                    case 50:
                        value = rntf[3];
                        break;
                    case 60:
                        value = rntf[4];
                        break;
                    case 70:
                        value = rntf[5];
                        break;
                    case 80:
                        value = rntf[6];
                        break;
                    case 90:
                        value = rntf[7];
                        break;
                    case 100:
                        value = rntf[8];
                        break;
                    case 110:
                        value = rntf[9];
                        break;
                    case 120:
                        value = rntf[10];
                        break;
                    case 130:
                        value = rntf[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'G':
                switch (depthrange2) {
                    case 35:
                        value = rntg[1];
                        break;
                    case 40:
                        value = rntg[2];
                        break;
                    case 50:
                        value = rntg[3];
                        break;
                    case 60:
                        value = rntg[4];
                        break;
                    case 70:
                        value = rntg[5];
                        break;
                    case 80:
                        value = rntg[6];
                        break;
                    case 90:
                        value = rntg[7];
                        break;
                    case 100:
                        value = rntg[8];
                        break;
                    case 110:
                        value = rntg[9];
                        break;
                    case 120:
                        value = rntg[10];
                        break;
                    case 130:
                        value = rntg[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'H':
                switch (depthrange2) {
                    case 35:
                        value = rnth[1];
                        break;
                    case 40:
                        value = rnth[2];
                        break;
                    case 50:
                        value = rnth[3];
                        break;
                    case 60:
                        value = rnth[4];
                        break;
                    case 70:
                        value = rnth[5];
                        break;
                    case 80:
                        value = rnth[6];
                        break;
                    case 90:
                        value = rnth[7];
                        break;
                    case 100:
                        value = rnth[8];
                        break;
                    case 110:
                        value = rnth[9];
                        break;
                    case 120:
                        value = rnth[10];
                        break;
                    case 130:
                        value = rnth[11];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'I':
                switch (depthrange2) {
                    case 35:
                        value = rnti[1];
                        break;
                    case 40:
                        value = rnti[2];
                        break;
                    case 50:
                        value = rnti[3];
                        break;
                    case 60:
                        value = rnti[4];
                        break;
                    case 70:
                        value = rnti[5];
                        break;
                    case 80:
                        value = rnti[6];
                        break;
                    case 90:
                        value = rnti[7];
                        break;
                    case 100:
                        value = rnti[8];
                        break;
                    case 110:
                        value = rnti[9];
                        break;
                    case 120:
                        value = rnti[10];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'J':
                switch (depthrange2) {
                    case 35:
                        value = rntj[1];
                        break;
                    case 40:
                        value = rntj[2];
                        break;
                    case 50:
                        value = rntj[3];
                        break;
                    case 60:
                        value = rntj[4];
                        break;
                    case 70:
                        value = rntj[5];
                        break;
                    case 80:
                        value = rntj[6];
                        break;
                    case 90:
                        value = rntj[7];
                        break;
                    case 100:
                        value = rntj[8];
                        break;
                    case 110:
                        value = rntj[9];
                        break;
                    case 120:
                        value = rntj[10];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'K':
                switch (depthrange2) {
                    case 35:
                        value = rntk[1];
                        break;
                    case 40:
                        value = rntk[2];
                        break;
                    case 50:
                        value = rntk[3];
                        break;
                    case 60:
                        value = rntk[4];
                        break;
                    case 70:
                        value = rntk[5];
                        break;
                    case 80:
                        value = rntk[6];
                        break;
                    case 90:
                        value = rntk[7];
                        break;
                    case 100:
                        value = rntk[8];
                        break;
                    case 110:
                        value = rntk[9];
                        break;
                    case 120:
                        value = rntk[10];
                        break;

                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'L':
                switch (depthrange2) {
                    case 35:
                        value = rntl[1];
                        break;
                    case 40:
                        value = rntl[2];
                        break;
                    case 50:
                        value = rntl[3];
                        break;
                    case 60:
                        value = rntl[4];
                        break;
                    case 70:
                        value = rntl[5];
                        break;
                    case 80:
                        value = rntl[6];
                        break;
                    case 90:
                        value = rntl[7];
                        break;
                    case 100:
                        value = rntl[8];
                        break;
                    case 110:
                        value = rntl[9];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'M':
                switch (depthrange2) {
                    case 35:
                        value = rntm[1];
                        break;
                    case 40:
                        value = rntm[2];
                        break;
                    case 50:
                        value = rntm[3];
                        break;
                    case 60:
                        value = rntm[4];
                        break;
                    case 70:
                        value = rntm[5];
                        break;
                    case 80:
                        value = rntm[6];
                        break;
                    case 90:
                        value = rntm[7];
                        break;
                    case 100:
                        value = rntm[8];
                        break;
                    case 110:
                        value = rntm[9];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'N':
                switch (depthrange2) {
                    case 35:
                        value = rntn[1];
                        break;
                    case 40:
                        value = rntn[2];
                        break;
                    case 50:
                        value = rntn[3];
                        break;
                    case 60:
                        value = rntn[4];
                        break;
                    case 70:
                        value = rntn[5];
                        break;
                    case 80:
                        value = rntn[6];
                        break;
                    case 90:
                        value = rntn[7];
                        break;
                    case 100:
                        value = rntn[8];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'O':
                switch (depthrange2) {
                    case 35:
                        value = rnto[1];
                        break;
                    case 40:
                        value = rnto[2];
                        break;
                    case 50:
                        value = rnto[3];
                        break;
                    case 60:
                        value = rnto[4];
                        break;
                    case 70:
                        value = rnto[5];
                        break;
                    case 80:
                        value = rnto[6];
                        break;
                    case 90:
                        value = rnto[7];
                        break;
                    case 100:
                        value = rnto[8];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'P':
                switch (depthrange2) {
                    case 35:
                        value = rntp[1];
                        break;
                    case 40:
                        value = rntp[2];
                        break;
                    case 50:
                        value = rntp[3];
                        break;
                    case 60:
                        value = rntp[4];
                        break;
                    case 70:
                        value = rntp[5];
                        break;
                    case 80:
                        value = rntp[6];
                        break;
                    case 90:
                        value = rntp[7];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Q':
                switch (depthrange2) {
                    case 35:
                        value = rntq[1];
                        break;
                    case 40:
                        value = rntq[2];
                        break;
                    case 50:
                        value = rntq[3];
                        break;
                    case 60:
                        value = rntq[4];
                        break;
                    case 70:
                        value = rntq[5];
                        break;
                    case 80:
                        value = rntq[6];
                        break;
                    case 90:
                        value = rntq[7];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'R':
                switch (depthrange2) {
                    case 35:
                        value = rntr[1];
                        break;
                    case 40:
                        value = rntr[2];
                        break;
                    case 50:
                        value = rntr[3];
                        break;
                    case 60:
                        value = rntr[4];
                        break;
                    case 70:
                        value = rntr[5];
                        break;
                    case 80:
                        value = rntr[6];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'S':
                switch (depthrange2) {
                    case 35:
                        value = rnts[1];
                        break;
                    case 40:
                        value = rnts[2];
                        break;
                    case 50:
                        value = rnts[3];
                        break;
                    case 60:
                        value = rnts[4];
                        break;
                    case 70:
                        value = rnts[5];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'T':
                switch (depthrange2) {
                    case 35:
                        value = rntt[1];
                        break;
                    case 40:
                        value = rntt[2];
                        break;
                    case 50:
                        value = rntt[3];
                        break;
                    case 60:
                        value = rntt[4];
                        break;
                    case 70:
                        value = rntt[5];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'U':
                switch (depthrange2) {
                    case 35:
                        value = rntu[1];
                        break;
                    case 40:
                        value = rntu[2];
                        break;
                    case 50:
                        value = rntu[3];
                        break;
                    case 60:
                        value = rntu[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'V':
                switch (depthrange2) {
                    case 35:
                        value = rntv[1];
                        break;
                    case 40:
                        value = rntv[2];
                        break;
                    case 50:
                        value = rntv[3];
                        break;
                    case 60:
                        value = rntv[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'W':
                switch (depthrange2) {
                    case 35:
                        value = rntw[1];
                        break;
                    case 40:
                        value = rntw[2];
                        break;
                    case 50:
                        value = rntw[3];
                        break;
                    case 60:
                        value = rntw[4];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'X':
                switch (depthrange2) {
                    case 35:
                        value = rntx[1];
                        break;
                    case 40:
                        value = rntx[2];
                        break;
                    case 50:
                        value = rntx[3];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Y':
                switch (depthrange2) {
                    case 35:
                        value = rnty[1];
                        break;
                    case 40:
                        value = rnty[2];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            case 'Z':
                switch (depthrange2) {
                    case 35:
                        value = rntz[1];
                        break;
                    case 40:
                        value = rntz[2];
                        break;
                    default:
                        value = -1;
                        System.out.print("2nd dive too deep! Risk of deco (loop in switch of the switch)");
                }
                break;
            default:
                value = -2;

        }
        return value;
    }

    static char getpressuregroup(int asd, int qwe) {
        char pgvalue;
        char gtpg1;
        char gtpg2;
        char gtpg3;
        char gtpg4;
        char gtpg5;
        char gtpg6;
        char gtpg7;
        char gtpg8;
        char gtpg9;
        char gtpg10;
        char gtpg11;
        char gtpg12;

        switch (asd) {
            case 35:
                return start.getpg35(qwe, ' ');
            case 40:
                gtpg2 = start.getpg40(qwe, ' ');
                pgvalue = gtpg2;
                break;
            case 50:
                gtpg3 = start.getpg50(qwe, ' ');
                pgvalue = gtpg3;
                break;
            case 60:
                gtpg4 = start.getpg60(qwe, ' ');
                pgvalue = gtpg4;
                break;
            case 70:
                gtpg5 = start.getpg70(qwe, ' ');
                pgvalue = gtpg5;
                break;
            case 80:
                gtpg6 = start.getpg80(qwe, ' ');
                pgvalue = gtpg6;
                break;
            case 90:
                gtpg7 = start.getpg90(qwe, ' ');
                pgvalue = gtpg7;
                break;
            case 100:
                gtpg8 = start.getpg100(qwe, ' ');
                pgvalue = gtpg8;
                break;
            case 110:
                gtpg9 = start.getpg110(qwe, ' ');
                pgvalue = gtpg9;
                break;
            case 120:
                gtpg10 = start.getpg120(qwe, ' ');
                pgvalue = gtpg10;
                break;
            case 130:
                gtpg11 = start.getpg130(qwe, ' ');
                pgvalue = gtpg11;
                break;
            case 140:
                gtpg12 = start.getpg140(qwe, ' ');
                pgvalue = gtpg12;
                break;
            default:
                pgvalue = '!';

        }
        return pgvalue;
    }

    static char getpressuregroupaftersurfaceinterval(int surfaceinterval, char previouspg) {
        char pgaftersurface;
        switch (previouspg) {
            case 'Z':
                pgaftersurface = start.aftersurfacepgz(surfaceinterval, previouspg);
                break;
            case 'Y':
                pgaftersurface = start.aftersurfacepgy(surfaceinterval, previouspg);
            case 'X':
                pgaftersurface = start.aftersurfacepgx(surfaceinterval, previouspg);
                break;
            case 'W':
                pgaftersurface = start.aftersurfacepgw(surfaceinterval, previouspg);
                break;
            case 'V':
                pgaftersurface = start.aftersurfacepgv(surfaceinterval, previouspg);
                break;
            case 'U':
                pgaftersurface = start.aftersurfacepgu(surfaceinterval, previouspg);
                break;
            case 'T':
                pgaftersurface = start.aftersurfacepgt(surfaceinterval, previouspg);
                break;
            case 'S':
                pgaftersurface = start.aftersurfacepgs(surfaceinterval, previouspg);
                break;
            case 'R':
                pgaftersurface = start.aftersurfacepgr(surfaceinterval, previouspg);
                break;
            case 'Q':
                pgaftersurface = start.aftersurfacepgq(surfaceinterval, previouspg);
                break;
            case 'P':
                pgaftersurface = start.aftersurfacepgp(surfaceinterval, previouspg);
                break;
            case 'O':
                pgaftersurface = start.aftersurfacepgo(surfaceinterval, previouspg);
                break;
            case 'N':
                pgaftersurface = start.aftersurfacepgn(surfaceinterval, previouspg);
                break;
            case 'M':
                pgaftersurface = start.aftersurfacepgm(surfaceinterval, previouspg);
                break;
            case 'L':
                pgaftersurface = start.aftersurfacepgl(surfaceinterval, previouspg);
                break;
            case 'K':
                pgaftersurface = start.aftersurfacepgk(surfaceinterval, previouspg);
                break;
            case 'J':
                pgaftersurface = start.aftersurfacepgj(surfaceinterval, previouspg);
                break;
            case 'I':
                pgaftersurface = start.aftersurfacepgi(surfaceinterval, previouspg);
                break;
            case 'H':
                pgaftersurface = start.aftersurfacepgh(surfaceinterval, previouspg);
                break;
            case 'G':
                pgaftersurface = start.aftersurfacepgg(surfaceinterval, previouspg);
                break;
            case 'F':
                pgaftersurface = start.aftersurfacepgf(surfaceinterval, previouspg);
                break;
            case 'E':
                pgaftersurface = start.aftersurfacepge(surfaceinterval, previouspg);
                break;
            case 'D':
                pgaftersurface = start.aftersurfacepgd(surfaceinterval, previouspg);
                break;
            case 'C':
                pgaftersurface = start.aftersurfacepgc(surfaceinterval, previouspg);
                break;
            case 'B':
                pgaftersurface = start.aftersurfacepgb(surfaceinterval, previouspg);
                break;
            case 'A':
                pgaftersurface = start.aftersurfacepga(surfaceinterval, previouspg);
                break;
            default:
                pgaftersurface = '!';
                //  boolen input!!!!!!
        }
        return pgaftersurface;
    }

    static void original() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter diving depth in feet: ");
        String input1 = sc.nextLine();
        Integer diverdepth = (int) Double.parseDouble(input1);
        System.out.println("Enter bottom time in minutes: ");
        String input2 = sc.nextLine();
        Integer diverbottomtime = (int) Integer.parseInt(input2);
        int depthrange = start.getdepthrange(diverdepth, diverbottomtime);
        int qwe = diverbottomtime;
        char currentpg = 0;
        char pgaftersurface;

        currentpg = start.getpressuregroup(depthrange, qwe);
        if (currentpg == '!') {
            return;
        } else {}

        System.out.println();
        System.out.println("After your first dive  " + diverdepth + " feet deep and " + diverbottomtime + " minutes long your ending dive pressure group is: " + currentpg);

        System.out.println("Enter surface interval in minutes: ");
        String input3 = sc.nextLine();
        Integer surfaceinterval = (int) Integer.parseInt(input3);

        char previouspg = currentpg;

        currentpg = start.getpressuregroupaftersurfaceinterval(surfaceinterval, previouspg);
            if (currentpg == '!') {
                return;
            } else {}

         if (currentpg == '@') {
                start.backtonatural(surfaceinterval);
            return;
            } else {}

        System.out.println("After surface interval your PG is: " + currentpg);

        System.out.println("Enter desired depth of 2nd dive in feet: ");
        String input4 = sc.nextLine();
        Integer diverdepth2ndcheck = (int) Integer.parseInt(input4);
        int depthrange2check = start.getdepthrange(diverdepth2ndcheck, 0);

        int t = start.getmaxtimeseconddive(depthrange2check);
        System.out.println("Maximum time allowed in " + depthrange2check + " feet is " + t + " minutes");
        int tbt = start.getotalbottomtime(depthrange2check, currentpg, t);
                if (tbt == -1) {
                    return;
                } else {}
        System.out.println("If you enter 2nd dive in pressure group " + currentpg + ", hence actual adjusted maximum bottom time is " + tbt + " minutes! ");


        System.out.println("Input 2nd dive depth considering the above listed: ");
        String input5 = sc.nextLine();
        Integer diverdepth2nd = (int) Integer.parseInt(input5);
        int depthrange2 = start.getdepthrange(diverdepth2nd, 0);
        int t2 = start.getmaxtimeseconddive(depthrange2);

        System.out.println("Input 2nd dive bottom time: ");
        String input6 = sc.nextLine();
        Integer seconddivetime = (int) Integer.parseInt(input6);
        int seconddiveRNT = start.get2nddiveRNT(depthrange2, currentpg);
        System.out.println("RNT is: " + seconddiveRNT);
        int qwe2 = seconddivetime + seconddiveRNT;
        currentpg = start.getpressuregroup(depthrange2, qwe2);
        if (currentpg == '!') {
            return;
        } else {}
        System.out.println("PG after 2nd dive: " + currentpg);

    }


//   dive planning with variables saved in object for display and the end of the cycle


    public static void origobject() {
        dive first = new dive( );  //object created!!!!!!!!!!!!!!
        int diverdepth=inputInt("Enter diving depth in feet: ");
        Scanner sc = new Scanner(System.in);
/*        System.out.println("Enter diving depth in feet: ");
        String input1 = sc.nextLine();
        Integer diverdepth = (int) Double.parseDouble(input1);*/
            first.depth=diverdepth;
        int diverbottomtime=inputInt("Enter bottom time in minutes: ");
/*        System.out.println("Enter bottom time in minutes: ");
        String input2 = sc.nextLine();
        Integer diverbottomtime = (int) Integer.parseInt(input2);*/
            first.bottomtime=diverbottomtime;
        int depthrange = start.getdepthrange(diverdepth, diverbottomtime);
        int qwe = diverbottomtime;
        char currentpg = 0;
        char pgaftersurface;

        currentpg = start.getpressuregroup(depthrange, qwe);
        if (currentpg == '!') {
            return;
        } else {}
        if (currentpg == '@') {
            return;
        } else {}
            first.pgend=currentpg;
        System.out.println();
        System.out.println("After your first dive  " + diverdepth + " feet deep and " + diverbottomtime + " minutes long your ending dive pressure group is: " + currentpg);

        System.out.println("Enter surface interval in minutes: ");
        String input3 = sc.nextLine();
        Integer surfaceinterval = (int) Integer.parseInt(input3);
        dive second = new dive();
            second.si=surfaceinterval;
        char previouspg = currentpg;

        currentpg = start.getpressuregroupaftersurfaceinterval(surfaceinterval, previouspg);
            if (currentpg == '!') {
                return;
            } else {}
           second.pgstart=currentpg;
        System.out.println("After surface interval your PG is: " + currentpg);
        int diverdepth2nd=inputInt("Enter desired depth of 2nd dive in feet: ");
/*        System.out.println("Enter desired depth of 2nd dive in feet: ");
        String input4 = sc.nextLine();
        Integer diverdepth2nd = (int) Integer.parseInt(input4);*/
            second.depth=diverdepth2nd;
        int depthrange2check = start.getdepthrange(diverdepth2nd, 0);

        int t = start.getmaxtimeseconddive(depthrange2check);
        int tbt = start.getotalbottomtime(depthrange2check, currentpg, t);
        if (tbt == -1) {
            start.exceedslimit();
            return;
        } else {}
        System.out.println("If you enter 2nd dive in pressure group " + currentpg + ", hence actual adjusted maximum bottom time is " + tbt + " minutes! ");

        int depthrange2 = start.getdepthrange(diverdepth2nd, 0);
        int t2 = start.getmaxtimeseconddive(depthrange2);
        int seconddivetime=inputInt("Input 2nd dive bottom time: ");
/*        System.out.println("Input 2nd dive bottom time: ");
        String input6 = sc.nextLine();
        Integer seconddivetime = (int) Integer.parseInt(input6);*/
            second.bottomtime=seconddivetime;
        int seconddiveRNT = start.get2nddiveRNT(depthrange2, currentpg);
        System.out.println("RNT is: " + seconddiveRNT);
            second.rnt=seconddiveRNT;
        int qwe2 = seconddivetime + seconddiveRNT;
            second.tbt=qwe2;
        currentpg = start.getpressuregroup(depthrange2, qwe2);
        if (currentpg == '!') {
            return;
        } else {}
        if (currentpg == '@') {
            return;
        } else {}
        System.out.println("PG after 2nd dive: " + currentpg);
            second.pgend=currentpg;

            System.out.println("1st dive depth: "+ first.depth);
            System.out.println("1st dive bottom time:"+ first.bottomtime);
            System.out.println("1st dive ending Pressure Group:"+ first.pgend);
            System.out.println(" --- Surface Interval in minutes: "+ second.si);
            System.out.println("2nd dive starting Pressure Group: "+ second.pgstart);
            System.out.println("2nd dive depth: "+ second.depth);
            System.out.println("2nd dive bottom time: "+ second.bottomtime);
            System.out.println("2nd dive RNT: "+ second.rnt);
            System.out.println("2nd dive TBT: "+ second.tbt);
            System.out.println("2nd dive ending Pressure Group: "+ second.pgend);
    }

    static void check2ndplanning() {
        int diverdepth=inputInt("Enter diving depth in feet: ");
        Scanner sc = new Scanner(System.in);
/*        System.out.println("Enter first dive depth in feet: ");
        String input1 = sc.nextLine();
        Integer diverdepth = (int) Double.parseDouble(input1);*/
        int diverbottomtime=inputInt("Enter first dive bottom time in minutes: ");
/*        System.out.println("Enter first dive bottom time in minutes: ");
        String input2 = sc.nextLine();
        Integer diverbottomtime = (int) Integer.parseInt(input2);*/
        int depthrange = start.getdepthrange(diverdepth, diverbottomtime);
        int qwe = diverbottomtime;
        char currentpg = 0;
        char pgaftersurface;
        currentpg = start.getpressuregroup(depthrange, qwe);
        if (currentpg == '!') {
            return;
        } else {}
        if (currentpg == '@') {
            return;
        } else {}
        System.out.println();
        System.out.println("After your first dive  " + diverdepth + " feet deep and " + diverbottomtime + " minutes long you ended dive in pressure group " + currentpg);
        int surfaceinterval=inputInt("Enter surface interval in minutes ");
/*        System.out.println("Enter surface interval in minutes: ");
        String input3 = sc.nextLine();
        Integer surfaceinterval = (int) Integer.parseInt(input3);*/
        char previouspg = currentpg;
        currentpg = start.getpressuregroupaftersurfaceinterval(surfaceinterval, previouspg);
        if (currentpg == '!') {
            return;
        } else {}
        if (currentpg == '@') {
            start.backtonatural(surfaceinterval);
            return;
        } else {}
        System.out.println("After surface interval(" + surfaceinterval + " minutes) your PG is: " + currentpg);
        int diverdepth2ndcheck=inputInt("Enter desired depth of 2nd dive in feet: ");
/*        System.out.println("Enter desired depth of 2nd dive in feet: ");
        String input4 = sc.nextLine();
        Integer diverdepth2ndcheck = (int) Integer.parseInt(input4);*/
        int depthrange2check = start.getdepthrange(diverdepth2ndcheck, 0);
        int t = start.getmaxtimeseconddive(depthrange2check);
        int tbt = start.getotalbottomtime(depthrange2check, currentpg, t);
        if (tbt == -1) {
            start.exceedslimit();
            return;
        } else {}

        if (diverdepth2ndcheck > diverdepth) {
            System.out.print("Plan your first dive to be the deepest dive, followed by shallower dive!");
            return;
        } else
            System.out.println("You start the 2nd dive in pressure group " + currentpg + " adjusted maximum bottom time is " + tbt + " minutes if you plan to dive to " + diverdepth2ndcheck + " feet deep.");
            }
        }

