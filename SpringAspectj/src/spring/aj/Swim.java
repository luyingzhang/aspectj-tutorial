package spring.aj;

public class Swim implements SwimInterface {

	public void holdBreath() {
		System.out.println("憋氣開始...");
		try {
			for( int i=0; i<3; i++ ){
				System.out.println("我忍耐...");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("憋氣完成...");
	}

}
