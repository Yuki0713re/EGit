package method;

//import java.util.Arrays;
//import java.util.Random;
public class Method {
//	static Random random = new Random();
//	static int randomValue = random.nextInt(100);

	public static void main(String[] args) {
//		Random random = new Random();
//		int randomValue = random.nextInt(101);
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
			hello();
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
			int val1 = calc(5);
			System.out.println(val1);
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
			int val2 = calc2(3,5);
			System.out.println(val2);
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
			double val3 = calc3(2.0,5.0);
			System.out.println(val3);
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。			
			int[] a = rand();
			for(int i = 0;i < a.length;i++) {
				int rnd = new java.util.Random().nextInt(101);
				System.out.println(rnd);
			}
			
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
			int sum = 0;
			int[] b = rand1();
			for(int i = 0;i < b.length;i++) {
				int rnd = new java.util.Random().nextInt(101);
				sum += rnd;
				System.out.println(rnd);
			}
			double average = (double)sum / b.length;
			System.out.println(average);
	}
	
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void hello() {
		System.out.println("Hello Java");
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int calc(int num1) {
		int addNum = num1 +1;
		return addNum;
	}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int calc2(int num1,int num2) {
		int addNum = num1 * num2;
		return addNum;
	}
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double calc3(double dec1,double dec2) {
		double addNum = dec1 * dec2;
		return addNum;
	}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int rand(int num1) {
		int addNum = num1;
		return addNum;
	}
	private static int[] rand() {
		int[] arrNum = {5,10,50};
		return arrNum;
	}
	
//	import java.util.Random;
//
//	public class RandomNumbers {
//	    public static int[] generateRandomNumbers(int count) {
//	        int[] result = new int[count];
//	        Random random = new Random();
//
//	        for (int i = 0; i < count; i++) {
//	            result[i] = random.nextInt(100) + 1;
//	        }
//
//	        return result;
//	    }
//	}
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	private static int[] rand1() {
		int[] arrNum = {5,10,50};
		return arrNum;
	}
}

//public class AverageRandomNumbers {
//    public static double getAverageRandomNumbers(int count) {
//        int[] randomNumbers = RandomNumbers.generateRandomNumbers(count);
//        double sum = 0.0;
//
//        for (int randomNumber : randomNumbers) {
//            sum += randomNumber;
//        }
//
//        return sum / count;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int count = 10;
//        int[] randomNumbers = RandomNumbers.generateRandomNumbers(count);
//        double average = AverageRandomNumbers.getAverageRandomNumbers(count);
//        
//        System.out.println("ランダムな数値:");
//        for (int randomNumber : randomNumbers) {
//            System.out.println(randomNumber);
//        }
//        System.out.println("平均値: " + average);
//    }
//}