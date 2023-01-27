package expert001_02;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
		// new가 사라지고 생성자에 파라미터값이 추가되었다
		// 생성자에서 Tire객체를 직접 생성할 것인가 아니면 대신생성하는 부분을 만들것인가
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}

}
