public class Student {
    public  String studentId;
    public String fullName;
    public float avfGrade;
    public String email;
    public String address;

    public Student(String studentId, String fullName, float avfGrade, String email, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.avfGrade = avfGrade;
        this.email = email;
        this.address = address;
    }

    //co nhieu constructor ten trung vs ten class mac dinh se ko co tham so
    //bat dau vs public
    public Student(){
        fullName = "lam";
        avfGrade=0;

    }

    public Student(String Id) {
        studentId=Id;

    }

    public void doHomeWork(String subject) {
        System.out.println("Dang lam bai"+subject);

    }


    public static void main(String[] args) {
        Student student1 = new Student("11", "Tran Van Ban", 9.5f, "dhieu999@gmail.com", "294 Vinh Hung ");
        System.out.println(student1.studentId);
        Student Linh = new Student("11", "DOAN LINH",9.9f,"linh2k@gmail.co","Mai Dong");
        Student Lan = new Student("22");
        Lan.doHomeWork("Lan");
        System.out.println(Lan.fullName);
    }
}
