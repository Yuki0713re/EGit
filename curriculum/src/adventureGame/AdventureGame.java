package adventureGame;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
※数値は毎回変わるように作ってください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/
import java.util.Scanner;

public class AdventureGame {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   // 名前の入力
   System.out.print("名前を入力してください：");
   String name = scanner.nextLine();
   
   // nullチェック
   if (name == null || name.isEmpty()) {
     System.out.println("名前が入力されていません。");
     return;
   }

   // ステータスの設定
   int hp = (int)(Math.random() * 1000) + 1;
   int mp = (int)(Math.random() * 1000) + 1;
   int attack = (int)(Math.random() * 500) + 1;
   int agility = (int)(Math.random() * 1000) + 1;
   int defense = (int)(Math.random() * 100) + 1;

   // メッセージの表示
   System.out.println("こんにちは " + name + " さん");
   System.out.println("ステータス");
   System.out.println("HP：" + hp);
   System.out.println("MP：" + mp);
   System.out.println("攻撃力：" + attack);
   System.out.println("素早さ：" + agility);
   System.out.println("防御力：" + defense);
   System.out.println("さあ冒険に出かけよう！");
 }
}