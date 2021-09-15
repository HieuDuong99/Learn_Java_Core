import java.util.Scanner;

public class arrayLesson {


    public static int sumElement(int[] arr1) {

        int sum= 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = input.nextInt();
        System.out.println("so phan tu cua mang la " + n);
        System.out.println("Nhap mang di nao");
        int[] arr1 = new int[n];
        for (var i = 0; i<n; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("mang la" + arr1);
      /*  for (var i = 0; i<n; i++){
            System.out.print(arr1[i]);
        }*/
        for(var item: arr1){
            System.out.println(item);}
        System.out.println("TOng cac phan tu cua mang la" + sumElement(arr1));

       /* int[] arr1 = new int[]{1, 3, 15, 51, 123};*/
        System.out.print(sumElement(arr1));


    }
}

