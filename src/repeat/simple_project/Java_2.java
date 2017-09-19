package repeat.simple_project;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mykhailo on 15/09/2017.
 */
public class Java_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = {-1, 18, -500};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        String[] sar = {"one", "two", "three"};
        for (int i = 0; i < sar.length; i++) {
            System.out.println(sar[i]);
        }
        System.out.println();

        String arr[] = new String[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        System.out.println();

        arr[0] = "hello";
        arr[1] = "world";
        arr[2] = "!!!";

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        System.out.println();

        int j = 0;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }
        System.out.println();

        do {
            System.out.println("Hola");
        } while (false);
        System.out.println();

        Random r = new Random();
        System.out.println(r.nextInt(50));
        System.out.println();
        
        int iar[] = new int[5];
        for (int i = 0; i < iar.length; i++) {
            iar[i] = r.nextInt(1000);
            System.out.println(iar[i] + " ");
        }
        System.out.println();

        int[] iar2 = new int[10];
        for (int i = 0; i < iar2.length; i++) {
            iar2[i] = r.nextInt(100);
            if (i % 2 == 0) {
                System.out.println(i + " " + iar2[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < iar2.length; i++) {
            if (i % 2 == 0 && iar2[i] % 2 == 0) {
                System.out.println(i + " " + iar2[i]);
            }
        }
        scan.close();
    }
}
