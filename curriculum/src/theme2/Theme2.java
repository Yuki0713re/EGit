/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package theme2;

public class Theme2 {
	
	private String name;
	private double length;
	private double speed;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブx
		
		Theme2 lion = new Theme2();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
	
	public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getSpeed() {
        return speed;
    }
}