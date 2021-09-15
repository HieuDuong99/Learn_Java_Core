public class type {
    public static void main(String[] args) {
       /* System.out.println(Long.MAX_VALUE);
        boolean boolVar1 = false;
        boolean boolVar2 = false;
        System.out.println(boolVar1 && boolVar2);//&&: "phép nhân"
        System.out.println(boolVar1 || boolVar2);//||: "phép cộng"
        System.out.println(boolVar1 ^ boolVar2);//Exlusive OR = "tuyển mạnh", kiểu "phép trừ ko lấy dấu"
        String str1 = "This is my company's address";
        String str2 = "I said: \"This is my car\"";//Ký tự đặc biệt => thêm \
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1+"\n"+str2);//\n là "enter xuống dòng"
        //String dài => cắt nhỏ ra để hiển thị
        String multiLines = "Hi everybody."+ //"" chứa string, '' chứa character(ký tự)
                "I am a student."+
                "I live in Hanoi";
        System.out.println(multiLines);
        char c = '2';//character(ký tự)
        System.out.println(c);*/
        int x = 10;
        float y = x;//Implicit casting: Ép kiểu "ngầm định", từ kiểu nhỏ => kiểu to.VD: int sang float
        System.out.println("y = "+y);
        double floatVar = 123.345;
        int intVar = (int)floatVar;//Explicit casting: Ép kiểu "tường minh", từ to => nhỏ. VD: float sang int
        System.out.println("intVar = "+intVar);
        boolean a = false;
//        int b = (boolean)a;//Kiểu dữ liệu boolean ko cho ép kiểu
        //Kiểu ký tự - char = character
        char char1 = (char)65;//Tham khảo bảng mã ASCII
        System.out.println("char1 = "+char1);
        //Kiểu byte ngược lại của char
        byte byte1 = (byte)'A';
        System.out.println("byte1 = "+byte1);
        System.out.println(Byte.MAX_VALUE);

    }
}
