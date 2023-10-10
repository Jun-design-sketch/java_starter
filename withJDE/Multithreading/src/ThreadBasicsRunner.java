// extends Thread
// implements Runnable

class Task1 extends Thread {
	@Override
	public void run() { // SIGNATURE
		System.out.print("\nTask1 Start");

		for (int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}

		// Thread.yield();

		System.out.println("\nTask1 End");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Start");

		for (int i = 201; i < 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask2 End");

	}

}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		// Task1
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		// task1.run();
		task1.start();

		// Task2
		System.out.print("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		System.out.println("\n");

		// wait for task1,2 to complete
		task1.join();
		task2Thread.join();

		// Task3
		System.out.print("\nTask3 Kicked Off");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n");
	}
}
