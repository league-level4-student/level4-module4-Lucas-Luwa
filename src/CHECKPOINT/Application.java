package CHECKPOINT;

import java.util.Random;

public class Application {
	readymadeCake RMC = new readymadeCake();
	orderCake OC = new orderCake();

	public static void main(String[] args) {
		Application ap = new Application();
		ap.randomizer();
	}

	public void randomizer() {
		Random n = new Random();
		for (int i = 0; i < 20; i++) {
			int rand = n.nextInt(1);
			int randrate = n.nextInt(50);
			int quantity = n.nextInt(10);
			if (rand == 1) {
				RMC.quantity[i] = quantity;
				RMC.rate[i] = randrate;
				RMC.name[i] = "Cake #" + i;
			} else {

				OC.weight[i] = quantity;
				OC.rate[i] = randrate;
				OC.name[i] = "Cake #" + i;
			}
		}
	}

	public int grandtotal() {
		int holder = 0;
		for (int i = 0; i < 20; i++) {
			// calc price next time
		}
		return holder;
	}
}
