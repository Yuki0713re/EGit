package basicClass;

public class Dog extends Animal {
	
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String animalName;
	// Q2：フィールドに動物の数の変数を定義してください。
	public int numberOfAnimals;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。S
	//　コンストラクタ	
	public Dog(String n) {
        this.animalName = n;
    }
	// 動物の名前を取得するメソッド
	public String getAnimalName() {
	     return this.animalName;
	}
	// 動物の名前を設定するメソッド
	public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//　コンストラクタ
	public Dog(int a){
		this.numberOfAnimals = a;
	}
	// 動物の数を取得するメソッド
	public int getNumberOfAnimals() {
        return this.numberOfAnimals;
    }
	// 動物の数を設定するメソッド
	public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }
	
}