package expert_001_01;

import static org.junit.Assert.*;

import org.junit.Test;

import expert001_01.Car;

public class CarTest {

	@Test
	public void 자동차_장착_타이어브랜드_테스트() {
		Car car = new Car();
		assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
		// 매개변수 두개를 비교해서 같으면 true 틀리면 exception 발생
	}
}
