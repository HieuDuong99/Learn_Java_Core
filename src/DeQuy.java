public class DeQuy {
    public static long factorial(int n) {
        if (n < 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }

    }

    public static int add(int n) { //if(<2) return n
        if (n == 1) {
            return 1;
        } else {
            return n + add(n - 1);
        }
    }

    public static int Fibonaci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return Fibonaci(n - 1) + Fibonaci(n - 2);
        }
    }

    public static int AddElement(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + AddElement(n / 10);
        }
    }
    public static int countDigits(int n) {
        if (n < 10) { // điều kiện dừng
            return 1;
        } else { // bước đệ quy
            return 1 + countDigits(n / 10);
        }
    }




        public static void main (String[]args){
            long ans = factorial(5);
            System.out.println(ans);
            System.out.println(add(10));
            System.out.println("Fibonaci " + Fibonaci(30));
            System.out.println(AddElement(123));
            System.out.println(countDigits(100));

        }
    }
