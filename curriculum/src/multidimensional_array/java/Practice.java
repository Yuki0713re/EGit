/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array.java;

public class Practice {

	public static void main(String[] args) {
		String[] sub={"国語","数学","英語"};
		
		String[] person ={ "生徒１","生徒２","生徒３","生徒４" };
				
		int test[][] = {{64,73,69},{58,81,75},{86,68,79},{72,55,80}};
		
		int sum = 0;
		int jaAvg = 0;
		int maAvg = 0;
		int enAvg = 0;
		
		for(int i = 0;i < person.length;i++) {
			System.out.println(person[i] + ":");
			for(int j = 0;j < sub.length;j++) {
				System.out.println(sub[j] + test[i][j] + "点");
				sum += test[i][0];	
			}
		}
		
		for(int i = 0; i < test.length; i++) {
			jaAvg += test[i][0];
			maAvg += test[i][1];
			enAvg += test[i][2];
			}
			System.out.println("国語の平均点は" + (double)jaAvg / test.length + "点です。");
			System.out.println("数学の平均点は" + (double)maAvg / test.length + "点です。");
			System.out.println("英語の平均点は" + (double)enAvg / test.length + "点です。");
		}
	}