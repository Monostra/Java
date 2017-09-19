package repeat.simple_project;

import java.util.Scanner;

/**
 * Created by Mykhailo on 18/09/2017.
 */
public class Java_5 {
    static int acount = 500000;
    static String pincode = "1234";

    public static String scanString() {
        return new Scanner(System.in).nextLine();
    }

    public static int scanInt() {
        System.out.print("Enter a number: ");
        return new Scanner(System.in).nextInt();
    }

    public static void fillPhone() {
        System.out.println("Enter your phone number in format: +38 xxx xxx xx xx");
        String phone = scanString();
        if (phone.length() != 13 || !phone.startsWith("+")) {
            System.out.println("wrong number");
        } else {
            System.out.println("Enter sum for phone");
            getMoney();
        }
    }

    public static void setMoney() {
        int i = scanInt();
        acount += Math.abs(i);
    }

    public static void getMoney() {
        int i = Math.abs(scanInt());
        if (acount > i) {
            acount -= i;
        } else {
            System.out.println("error");
        }
    }

    public static boolean pincode() {
        System.out.print("Enter pin: ");
        String pin = scanString();
        if (pin.length() != 4 || !pin.equals(pincode)) {
            System.out.println("error");
            return false;
        }
        return true;
    }

    public static void menu() {
        if (pincode()) {
            while (true) {
                switch (scanInt()) {
                    case 1:
                        System.out.println(acount);
                        break;
                    case 2:
                        getMoney();
                        System.out.println(acount);
                        break;
                    case 3:
                        setMoney();
                        System.out.println(acount);
                        break;
                    case 4:
                        fillPhone();
                        System.out.println(acount);
                        break;
                    case 5:
                        System.out.println("exit");
                        return;
                    default:
                        System.out.println("wrong comand");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
