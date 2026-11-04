import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // đọc từ bàn phím (System.in)

        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();           // đọc cả dòng, kể cả dấu cách

        System.out.print("Gửi tiết kiệm bao nhiêu tháng? ");
        // hasNextInt: hỏi "từ kế tiếp có phải số nguyên không?", KHÔNG lấy nó ra
        while (!scanner.hasNextInt()) {
            String bad = scanner.next();             // lấy bỏ từ sai
            System.out.print("'" + bad + "' không phải số. Nhập lại: ");
        }
        int months = scanner.nextInt();              // đọc một số nguyên
        System.out.println();
        System.out.println(name + " gửi kỳ hạn " + months + " tháng");
    }
}