package basicClass;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Animal {
	

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog("犬");
		
		System.out.println(dog.getAnimalName());
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animals = new Dog(10);
		
		System.out.println(animals.getNumberOfAnimals());
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在の日時を取得する
        LocalDateTime now = LocalDateTime.now();
        
        // 日時を指定されたフォーマットに変換する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedNow = now.format(formatter);
        
        // 変換された日時をコンソールに出力する
        System.out.println("現在の日時：" + formattedNow);
	}
}