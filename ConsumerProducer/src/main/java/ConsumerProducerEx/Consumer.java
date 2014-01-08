package main.java.ConsumerProducerEx;

import java.util.Random;

public class Consumer implements Runnable {

	Drop drop;
	private Random random = new Random();
	
	public Consumer (Drop drop) {
		this.drop = drop;
	}
	
	public void run() {
		
		for( String message = drop.take(); ! message.equals("DONE"); message = drop.take()) {
			System.out.format("Message Received: %s%n", message);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
