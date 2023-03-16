package introduction;

class Person extends Main{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	private static int count = 0; // 静的変数を用意する

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // インスタンスが生成されるたびにカウントをインクリメントする
	}
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}
	public double getHeight() {
		return age;
		
	}
	
	public double bmi() {
	    double bmi = weight / height;  // BMIを計算して返す
	    return bmi;
	}
	
	public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.printf("BMIは%.2fです\n", this.bmi());
	}

	public static int getCount() { // カウントを取得するための静的メソッドを用意する
        return count;
    }
	
}