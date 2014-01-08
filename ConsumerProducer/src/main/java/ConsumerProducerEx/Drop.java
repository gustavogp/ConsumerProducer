package main.java.ConsumerProducerEx;

public class Drop {

	private String message;
	private boolean empty = true;
	
	public synchronized void put( String message) {
		
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.message = message;
		empty = false;
		notifyAll();
	}
	
	public synchronized String take() {
		
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		notifyAll();
		return this.message;
	}
	
}
