package expert001_01;

public class Car {
	Tire tire;

	public Car() {
//		tire = new KoreaTire();
		tire = new AmericaTire();
		
		// 자동차가 어떤 타이어를 생성할것인지 구체적으로 선택
		// 유연성이 떨어진다 할 수 있음
	}

	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}

}
