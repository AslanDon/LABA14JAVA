import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String ipv4 = input.nextLine();
        Pattern p = Pattern.compile("\\b(25[^0-5]\\.|2[0-4]\\d\\.|1\\d\\d\\.|\\d\\d?\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)\\b");
        Matcher m = p.matcher(ipv4);
        System.out.print("Найденный IP: ");
        while (m.find())
        {
            System.out.print(m.group());
        }
    }
}