import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напечатайте текст");
        String text = scanner.nextLine();
        if (text.length() <= 100) {
            System.out.println("Этот текст легко читать!!!");
        } else {
            System.out.println("Этот текст слишком большой!!!");
        }
    }
}
