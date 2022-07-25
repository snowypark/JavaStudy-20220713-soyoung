package j11_상속factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	@Override
	public void starts() {
		System.out.print("삼성 ");
		super.starts();
	}
	
	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}
	
}
