package expert001_02;

public class Driver {

	public static void main(String[] args) {
		Tire tire = new KoreaTire();
		// Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		//운전자가 어떤 객체를 생성해 사용할것인지 선택해서 생성
		System.out.println(car.getTireBrand());

	}

}
