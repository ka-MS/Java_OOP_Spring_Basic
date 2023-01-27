package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// 쇼핑몰 정보 -> bean들이 등록된 xml파일 경로
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");
		
		// 자동차 구매 -> xml에 등록되어 있는 bean파일 정보를 가져옴 + 속성설정까지
		Car car = context.getBean("car", Car.class);
		
		System.out.println(car.getTireBrand());

	}

}
