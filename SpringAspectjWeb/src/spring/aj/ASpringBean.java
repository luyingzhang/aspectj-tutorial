package spring.aj;


public class ASpringBean {

    public String nag(){
		System.out.println("工作開始...");
		try {
			for( int i=0; i<3; i++ ){
		        System.out.println( "碎碎念...@$#" );
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		}
        return "我寫好了...";
    }
}
