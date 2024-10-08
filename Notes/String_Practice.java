import java.util.Scanner;
public class String_Practice {
    public static void main(String[] args)
    {

        String str4 = "h" + "ello".toLowerCase();
        String str5 = "hello";
        System.out.println(str4 == str5);

        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // scanner.nextLine(); // Consume the newline character
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

    }
}
