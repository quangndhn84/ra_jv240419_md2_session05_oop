package oop;

import java.util.Scanner;

public class Student {
    /*
     * Khai báo lớp sinh viên có:
     * 1. Các thuộc tính:
     *   - Mã sinh viên, tên sinh viên, tuổi, giới tính, địa chỉ
     * 2. Có các constructor;
     *   - Constructor không có tham số (khởi tạo đối tượng mà không khởi tạo bất cứ thông tin gì của đối tuợng)
     *   --> default Constructor
     *   - Constructor có 2 tham số để khởi tạo đối tượng với mã sinh viên và tên sinh viên
     *   - Constructor có tất cả tham số để khởi tạo tất cả thông tin của đối tượng
     * 3. Có các phương thức
     *   - Các phương thức getter/setter để truy cập với tất cả các thuộc tính của đối tượng
     *   - Các phương thức thể hiện hành vi của đối tượng
     *       + Hành vi tính tổng 2 số nguyên
     *       + Hành vi chào thầy
     *       + Hành vi yêu
     *       + Hành vi nhập thông tin cho đối tượng
     *       + Hành vi hiển thị thông tin của đối tượng
     * */
    //1. Các thuộc tính của lớp (Fields/Properties/Attributes): thể hiện đặc điểm của đối tượng
    //Syntax: Access Modifier(private) + Datatype + attributeName;
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;

    //2. Constructors: các hàm tạo - giúp khởi tạo đối tượng từ lớp
    //Syntax: Access Modifier(public) + ClassName (parameters)
    //Syntax: Datatype + paramName
    //Default Constructor
    public Student() {
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    //3. Methods: Thể hiện hành vi của đối tượng
    //Syntax: Access Modifier + ReturnData + methodName(parameters)
    //--3.1. Getter/Setter: truy cập và làm việc với các thuộc tính của đối tượng
    //----Getter: lấy dữ liệu của thuộc tính
    //----Setter: gán giá trị vào cho thuộc tính

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //--3.2. Methods thể hiện hành vi của đối tượng
    //Syntax: Access Modifier + ReturnData + methodName(parameters)
    //Phương thức tính tổng 2 số nguyên
    public int addTwoNumbers(int firstNumber, int secondNumber) {
        //logic của phương thức
        int total = firstNumber + secondNumber;
        return total;
    }

    //Phuơng thức chào thầy: in ra màn hình console "Em chào thầy [tên thầy]"
    public void helloTeacher(String teacherName) {
        System.out.println("Em chào thầy " + teacherName);
    }

    //Phương thức yêu: in ra màn hình console "I love you"
    public void love() {
        System.out.println("I love you");
    }

    //Phương thức cho phép nhập thông tin đối tượng: mã sinh viên, tên sinh viên, tuổi, giới tính, địa chỉ
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
    }

    //Phương thức hiển thị thông tin sinh viên
    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %s - Địa chỉ: %s\n", this.sex ? "Nam" : "Nữ", this.address);
    }


}
