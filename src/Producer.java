import java.util.Random;

public class Producer extends Thread {
	CustomBuffer buffer;
	
	public Producer(CustomBuffer buffer){
		this.buffer=buffer;
	}
	@Override
	public void run(){
		Random r=new Random();
		while(true){
			int num=r.nextInt();
			buffer.add(num);
			System.out.println("Produced " + num);
		}
	}
}
