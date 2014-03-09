
public class Main {
	public static void main(String[] args){
		CustomBuffer buffer=new CustomBuffer();
		Producer producer=new Producer(buffer);
		Consumer consumer= new Consumer(buffer);
		producer.start();
		consumer.start();
		

	}
}
