import java.time.LocalDate;
import java.util.Scanner;
public class ensyu01＿06 {
public static void main(String[] args) {
        // スキャナーを作成してキーボード入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // ユーザーに名前の入力を求める
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        // 今日の日付を取得
        LocalDate today = LocalDate.now();

        // 名前と日付を表示
        System.out.println("私の名前は " + name + " です。");
        System.out.println("今日の日付は " + today.getYear() + "年" 
                           + today.getMonthValue() + "月" 
                           + today.getDayOfMonth() + "日 です。");

        // スキャナーを閉じる
        scanner.close();
    }
}
