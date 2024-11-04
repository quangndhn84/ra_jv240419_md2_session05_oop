package execise;

import java.util.Scanner;

public class BTT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        do {
            System.out.println("*****************MENU*****************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. Sắp xếp mảng giảm dần");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d]=", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử của mảng là:");
                    for (int element : numbers) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    for (int i = 0; i < numbers.length - 1; i++) {
                        for (int j = i + 1; j < numbers.length; j++) {
                            if (numbers[i] < numbers[j]) {
                                //Đổi chỗ 2 phần tử i và j
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong mảng giảm dần");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        } while (true);
    }
}
