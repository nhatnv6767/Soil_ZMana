import java.text.DecimalFormat;
import java.util.Scanner;

public class Input {
    public static Scanner scan = new Scanner(System.in);

    public static int inputInt(String content) {
        int result = 0;
        System.out.print(content);
        result = Integer.parseInt(scan.nextLine());
        return result;
    }

    public static double inputInDouble(String content) {
        double result = 0;
        System.out.print(content);
        result = Double.parseDouble(scan.nextLine());
        return result;
    }

    public static double inputInFloat(String content) {
        float result = 0;
        System.out.print(content);
        result = Float.parseFloat(scan.nextLine());
        return result;
    }

    public static double inputInLong(String content) {
        long result = 0;
        System.out.print(content);
        result = Long.parseLong(scan.nextLine());
        return result;
    }

    public static String inputInString(String content) {
        String result = "";
        System.out.print(content);
//        result = scan.nextLine();
        result = scan.nextLine();
        return result;
    }

    public static String inputInDate() {
        String result = "";
        System.out.print("Enter date (dd/MM/yyyy): ");
//        result = scan.nextLine();
        result = scan.nextLine();
        return result;
    }

    public static String toVnd(double money) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        String result = "";
        result = df.format(money);
        return result;
    }

}
