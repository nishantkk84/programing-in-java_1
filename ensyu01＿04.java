import java.util.Scanner;
public class ensyu01＿04 {

public class SumAndAverageInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Xの値を入力してください: ");
        double X = scanner.nextDouble();

        System.out.print("Yの値を入力してください: ");
        double Y = scanner.nextDouble();

        System.out.print("Zの値を入力してください: ");
        double Z = scanner.nextDouble();

        
        double sum = X + Y + Z;

        
        double average = sum / 3;

       
        System.out.println("合計:");
        System.out.println(X + " + " + Y + " + " + Z + " = " + sum);

        
        System.out.println("平均:");
        System.out.println("(" + X + " + " + Y + " + " + Z + ") / 3 = " + average);

       
        scanner.close();
    }
}
}