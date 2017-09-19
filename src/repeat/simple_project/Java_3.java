package repeat.simple_project;

/**
 * Created by Mykhailo on 15/09/2017.
 */
public class Java_3 {
    public static void main(String[] args) {
        hello("everyone");
        System.out.println();

        sum(2,3);
        System.out.println();

        calculator(4,2,"+");
        System.out.println();

        int[] ar = {1, 3, 5, 34};
        print(ar);
        System.out.println();

        qwer(1,4,5,6);
        System.out.println();

        calc("+", 4,2,2);
    }

    public static void hello(String str) {
        System.out.println("Hello " + str);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void calculator(int a, int b, String c) {
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println((double) a / b);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void qwer(int... a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res + a[i];
        }
        System.out.println(res);
    }

    public static void calc(String ac, int ...a) {
        int res = 0;
        switch (ac) {
            case "+":
                res = a[0];
                for (int i = 1; i < a.length; i++) {
                    res = res + a[i];
                }
                System.out.println(res);
                break;
            case "-":
                res = a[0];
                for (int i = 1; i < a.length; i++) {
                    res = res - a[i];
                }
                System.out.println(res);
                break;
            case "*":
                res = a[0];
                for (int i = 1; i < a.length; i++) {
                    res = res * a[i];
                }
                System.out.println(res);
                break;
            case "/":
                double r = a[0];
                for (int i = 1; i < a.length; i++) {
                    r = r / a[i];
                }
                System.out.println(r);
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

}
