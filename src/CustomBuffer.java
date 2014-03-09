
public class CustomBuffer {
	Integer[] buffer=new Integer[10];
	int index=0;
	
	public CustomBuffer(){}
	public synchronized void add(int num){
		if(index>=buffer.length-1){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				buffer[index++]=num;
				notify();
			
		}
	
	
	public synchronized int remove(){
		if(index<=0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				int removed=buffer[--index];
				notify();
				return removed;
			}
}
