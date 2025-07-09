import java.util.Scanner;
public class ensyu01＿05 {
  public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("A の値を入力してください（小数点数）: ");
        double A = scanner.nextDouble();

        
        System.out.print("B の値を入力してください（小数点数）: ");
        double B = scanner.nextDouble();

        
        double sum = A + B;

        
        double average = sum / 2;

       
        System.out.println("合計:");
        System.out.println(A + " + " + B + " = " + sum);

  
        System.out.println("平均:");
        System.out.println("(" + A + " + " + B + ") / 2 = " + average);

   
        scanner.close();
    }
}
