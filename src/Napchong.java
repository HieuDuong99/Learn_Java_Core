import java.util.Scanner;

public class Napchong {

//    public static int add(int a, int b) {
//        return a+b;
//
//    }
//
//    public static double add(double a, double b) {
//        return a+b;
//
//    }

    public static int findMax(int a, int b, int c) {

        int max = a;
        if (a < b) {
            max=b;
        }
        if (c > b) {
            max =c;

        }
        return max;

    }
    public static double findMax(double a, double b, double c) {

        double max = a;
        if (a < b) {
            max=b;
        }
        if (c > b) {
            max =c;

        }
        return max;

    }




    public static void main(String[] args) {
//        double c = add(5.00, 4.00);
//        System.out.println(c);
//        int d = add(3, 4);
//        int f = add(4, 2);
//        System.out.println(d);
//        System.out.println(add(4.34f,4.23d));23d
        System.out.println("Hay nhap 3 so di nao ");

        var input = new Scanner(System.in);
       int a = input.nextInt();
      int  b= input.nextInt();
      int  c=input.nextInt();
      int k=findMax(a,b,c);
        System.out.println("So Lon nHat day nay");
        System.out.println(k);
        System.out.println(findMax(4f,8f,10f));


    }
}
