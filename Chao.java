import java.util.Scanner;

public class Chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap que quan: ");
        String city = scanner.nextLine();

        System.out.println();
        System.out.println("Xin chao " + name);
        System.out.println("Ten ban co " + name.length() + " ky tu");
        System.out.println("Ban den tu " + city);
    }


    }