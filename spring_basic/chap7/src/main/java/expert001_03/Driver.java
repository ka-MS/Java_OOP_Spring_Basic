package expert001_03;

public class Driver {

	public static void main(String[] args) {
		Tire tire = new KoreaTire();
//		 Tire tire = new AmericaTire();
		Car car = new Car();
		// 생성한 객체를 set을 통해 속성을 주입해서 사용
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());

	}

}
