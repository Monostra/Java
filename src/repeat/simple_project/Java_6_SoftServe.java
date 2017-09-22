package repeat.simple_project;

/**
 * Created by Mykhailo on 21/09/2017.
 */
//
//
//
////
public class Java_6_SoftServe {
    public static void main(String[] args) {
        int k = 0;
        int s = 0;
        switch (k) {
            case 0: {k += 2; s += k;}
            case 1: {k += 2; s += k;}
        }
        System.out.println(s); //s=6
    }
}
//

//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//       for(byte i = 254; i<255; i++) {
//           System.out.println(i);
//       }
//    }
//}
//interface Box{
//	protected void open();
//	void clsoe();
//	public void empty();
//}
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        for (short i = 126; i <= 127; i++) {
//            System.out.println(i); //i= 126,127
//        }
//    }
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        for (short i = 126; i < 127; i++) {
//            System.out.println(i); //i= 126
//        }
//    }
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        short i = 32766;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 32767); // i=32766
//    }
//}
//
//
//
//
//Public Class Java_6_SoftServe {
//    Public Static Void Main(String[] Args) {
//        Long L = 0L;
//        System.Out.Println("Hello, World No " + L + "!");
//    } // 0    // 3 errors
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        boolean c = true;
//        if (a == true) {
//            if (b == true) {
//                if (c == true) {
//                    System.out.println("1");
//                } else {
//                    System.out.println("2");
//                }
//            } else if (a && (b = c)) {
//                System.out.println("3");
//            } else {
//                System.out.println("4");
//            }
//        } // 3
//    }
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int s = 1;
//        int k = 1;
//        while (k-- > 0) {
//            s += k;
//        }
//        System.out.println(++s); //s = 2
//    }
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int s = 1;
//        int k = 0;
//        do {
//            s += 2;
//        } while (s != 100);
//        System.out.println(s); //s = infinite loop
//    }
//}
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int s = 1;
//        int k = 0;
//        while (k< 10){
//            k += 2;
//            if (k > 5) {
//                break;
//            }
//            s += k;
//        }
//        System.out.println(s); //s = infinite loop
//    }
//}
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int s = 1;
//        int k = 0;
//        do {
//            s += 2;
//        } while (s != 101);
//        System.out.println(s); //s = 101
//    }
//}
//
//
//
//
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int s = 1;
//        for (int i = 5; i > 0; i--) {
//            s += i;
//            if (i != 0) {
//                break;
//            }
//        }
//        System.out.println(s); //s=6
//    }
//}
//
//
//
//
//class A {
//    private int id;
//    private String name;
//
//    public A(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        A a1 = new A(1, "F");
//        A a2 = new A(2, "S");
//        a2 = a1;
//        a1.setName("T");
//        System.out.println(a2.getName()); //a2 = T
//    }
//}
//
//
//
//
////
////
//public class Java_6_SoftServe {
//    public static void main(String[] args) {
//        int i;
//        int sum = 1;
//        for (i = 1; i <=10 ; i++) {
//            sum +=i;
//        }
//        System.out.println(sum);
//    }
//}
//class MyException extends Exception{}
//class MyRuntimeException extends RuntimeException{}
//class Java_6_SoftServe{
//    void method1(){throw new MyException();}
//    void method2(){throw new MyRuntimeException();}
//}



