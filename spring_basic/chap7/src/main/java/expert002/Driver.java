package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// 쇼핑몰 정보 -> bean들이 등록된 xml파일 경로
		ApplicationContext context = new ClassPathXmlApplicationContext("expert002/expert002.xml");
		
		// 자동차 구매 -> xml에 등록되어 있는 bean파일 정보를 가져옴
		Car car = context.getBean("car", Car.class);
		
		// 타이어 구매 
		Tire tire = context.getBean("americaTire", Tire.class);
		
		car.setTire(tire);
		System.out.println(car.getTireBrand());

	}

}
