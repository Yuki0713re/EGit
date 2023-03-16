package introduction2;

class Main {
	  public static void main(String[] args) {
		  Person person1 = new Person("鈴木","太郎", 20, 1.7, 60);
//		  person1.print();
		  Person person2 = new Person("山田","花子", 22, 1.5, 40);
//		  person2.print();
	   
//	    System.out.println(person1.name);
//	    System.out.println(person1.age);
//	    System.out.println(person1.height);
//	    persons.print();
	    
//	    System.out.println("合計" + Person.getCount() + "人です");
	    
	    Car car = new Car();
	    Bicycle bicycle = new Bicycle();
	    
	    car.setOwner(person1.getFullName());
	    bicycle.setOwner(person2.getFullName());
	    System.out.println(car.getOwner());
	    System.out.println(bicycle.getOwner());
	    
	    person1.buy(car);
	    person2.buy(bicycle);
	  }
	}