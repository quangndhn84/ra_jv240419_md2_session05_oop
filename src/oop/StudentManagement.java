package oop;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Syntax khởi tạo đối tượng: ClassName objectName = new Constructor(argument)
        //1. Khởi tạo đối tuợng sinh viên 1 mà không khởi tạo bất cứ thông tin gì
        Student student1 = new Student();
        //2. Khởi tạo đối tượng sinh viên 2 và khởi tạo mã sinh viên (SV002) và tên sinh viên ("Nguyễn Văn B")
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khởi tạo đối tượng sinh viên 3 và khởi tạo tât cả thông tin sinh viên
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25, false, "Hồ Chí Minh");
        //4. Nhập thông tin cho sinh viên 1
        System.out.println("NHẬP THÔNG TIN CHO SINH VIÊN 1:");
        student1.inputData(scanner);
        //5. Nhập thông tin sinh viên 2: tuổi, giới tính và địa chỉ
        System.out.println("NHẬP CÁC THÔNG TIN CÒN LẠI CHO SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        //6. Tính trung bình tuổi của 3 sinh viên
        int avgAge = (student1.getAge() + student2.getAge() + student3.getAge()) / 3;
        System.out.println("Tuổi trung bình của 3 sinh viên là: " + avgAge);
        //Gọi phương thức của đối tượng: objectName.methodName(argument)
        //In ra thông tin sinh viên
        System.out.println("THÔNG TIN SINH VIÊN 1 LÀ: ");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2 LÀ:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3 LÀ:");
        student3.displayData();

    }
}
