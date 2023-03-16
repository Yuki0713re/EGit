package introduction2;

class Person extends Main{
	// インスタンスフィールドを定義
	private String lastName;
	private String firstName;
//	private String fullName = lastName + firstName;
	private int age;
	private double height;
	private double weight;
	private static int count = 0; // 静的変数を用意する

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String lastName,String firstName,int age,double height,double weight){
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // インスタンスが生成されるたびにカウントをインクリメントする
	}
	
//	public String getName() {
//		return name;
//		
//	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getFullName() {
		return lastName + "" + firstName;
	}
	
	public int getAge() {
		return age;
		
	}
	public double getHeight() {
		return height;
		
	}
	
	public double bmi() {
	    double bmi = weight / height;  // BMIを計算して返す
	    return bmi;
	}
	
	public void print() {
	    System.out.println("名前は" + this.lastName + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.printf("BMIは%.2fです\n", this.bmi());
	}

	public static int getCount() { // カウントを取得するための静的メソッドを用意する
        return count;
    }
	
	// buyメソッドの定義
    public void buy(Car car) {
    	car.setOwner(this.getFullName());
        System.out.println(car.getOwner() + "が購入しました。");
    }
    
    public void buy(Bicycle bicycle) {
    	bicycle.setOwner(this.getFullName());
    	System.out.println(bicycle.getOwner() + "が購入しました");
    	}
	
}