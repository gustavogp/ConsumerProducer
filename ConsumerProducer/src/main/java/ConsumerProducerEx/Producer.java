package main.java.ConsumerProducerEx;

import java.util.Random;

public class Producer implements Runnable{

	Drop drop;
	private String[] verso = {"O doce", "mais doce", "e' o doce", "de batata doce"};
	private Random random = new Random();
	
	public Producer (Drop drop) {
		this.drop = drop;
	}
	
	@Override
	public void run() {
	
		for (int i = 0; i < verso.length; i++) {
			drop.put(verso[i]);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		drop.put("DONE");
	}

}
