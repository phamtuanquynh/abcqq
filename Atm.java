import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final long WITHDRAW_LIMIT = 20_000_000;
        long balance = 5_000_000;
        long withdrawn = 0;
        long[] history = new long[5];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.print("\n1.Số dư 2.Nạp 3.Rút 4.Lịch sử 0.Thoát | Chọn: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> System.out.println("Số dư: " + balance + " đồng");

                case 2, 3 -> {
                    System.out.print("Số tiền: ");
                    if (!scanner.hasNextLong()) {
                        System.out.println("Vui lòng nhập số");
                        scanner.next();
                        continue;
                    }
                    long amount = scanner.nextLong();
                    if (amount <= 0) {
                        System.out.println("Số tiền phải lớn hơn 0");
                    } else if (option == 3 && amount > balance) {
                        System.out.println("Số dư không đủ");
                    } else if (option == 3 && withdrawn + amount > WITHDRAW_LIMIT) {
                        System.out.println("Vượt hạn mức rút. Còn được rút: "
                                + (WITHDRAW_LIMIT - withdrawn) + " đồng");
                    } else {
                        long change = option == 2 ? amount : -amount;
                        balance += change;
                        if (option == 3) {
                            withdrawn += amount;
                        }
                        if (count == history.length) {
                            for (int i = 0; i < history.length - 1; i++) {
                                history[i] = history[i + 1];
                            }
                            count--;
                        }
                        history[count] = change;
                        count++;

                        System.out.println("Thành công. Số dư: " + balance + " đồng");
                    }
                }

                case 4 -> {
                    if (count == 0) {
                        System.out.println("Chưa có giao dịch nào");
                    } else {
                        System.out.println("Lịch sử " + count + " giao dịch gần nhất:");
                        for (int i = 0; i < count; i++) {
                            String type = history[i] > 0 ? "Nạp" : "Rút";
                            System.out.println((i + 1) + ". " + type + " " + Math.abs(history[i]) + " đồng");
                        }
                    }
                }

                case 0 -> running = false;
                default -> System.out.println("Không có chức năng " + option);
            }
        }
        System.out.println("Cảm ơn bạn đã dùng Onward ATM");
        scanner.close();
    }
}
