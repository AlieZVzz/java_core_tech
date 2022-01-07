import java.util.Scanner;

public class demo {
    public static void main(String[] arg) {
        String all = String.join(" / ", "S", "M", "L", "XL");
        String repeated = "Java".repeat(3);
        String greeting = "Hello";
        System.out.println(all + repeated + greeting.charAt(4));
        System.out.println(all.equals(greeting));
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
    }
}
