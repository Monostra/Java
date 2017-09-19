package repeat.simple_project;

import java.util.Random;

/**
 * Created by Mykhailo on 16/09/2017.
 */
public class Java_4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(100);
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        int[] qw = rev(ar);
        for (int i = 0; i < qw.length; i++) {
            System.out.print(qw[i] + " ");
        }
        System.out.println();

        int[] qw2 = rev2(ar);
        for (int i = 0; i < qw2.length; i++) {
            System.out.print(qw2[i] + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println(retint(40));
        System.out.println();

        boolean b = mySW("sdfag", 'w');
        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println();

        System.out.println(repl("hello", 'e', '&'));
    }

    public static int[] rev(int[] ar) {
        int[] arr = new int[ar.length];
        for (int i = 0; i < arr.length; i++) {
            arr[ar.length - 1 - i] = ar[i];
        }
        return arr;
    }

    public static int[] rev2(int[] ar) {
        int[] arr = new int[ar.length];
        for (int i = ar.length-1; i >= 0; i--) {
            arr[ar.length-1-i] = ar[i];
        }
        return arr;
    }

    public static double retint(int sum) {
        double sumWPDV = sum * 1.2;
        return sumWPDV;
    }

    public static boolean mySW(String string, char sfx) {
        char[] chArray = string.toCharArray();
        if (chArray[chArray.length - 1] == sfx) {
            return true;
        }
        return false;
    }

    public static String repl(String string, char ch1, char ch2) {
        String s = "";
        char[] chAray = string.toCharArray();
        for (int i = 0; i < chAray.length; i++) {
            if (chAray[i] == ch1) {
                chAray[i] = ch2;
            }
            s += chAray[i];
        }
        return s;
    }

}
