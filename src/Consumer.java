
public class Consumer extends Thread {
	private CustomBuffer buffer;
	
	public Consumer(CustomBuffer buffer){
		this.buffer=buffer;
	}
	@Override
	public void run() {
		while(true){
			int num=buffer.remove();
			System.out.println("Consumed "+num);
		}
	}

}
