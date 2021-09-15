import java.util.Scanner;

public class switchexpression {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Nhap vao thang trong nam");
        var thang = input.nextInt();

        String result = switch (thang){
            case 1, 2, 3 -> "Mua Xuan";
            case 4,5,6 -> "Mua Ha";
            case 7,8,9 -> "Mua thu";
            case 10,11,12 -> "Mua dong";

            default ->("Khong hop le roi: " + thang);
        };
        System.out.println(result);



    }
}
