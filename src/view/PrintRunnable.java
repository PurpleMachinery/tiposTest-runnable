package view;

public class PrintRunnable {
	////////////////////
	private static void print(Object var) {
		System.out.println(var.toString());
	}
	////////////////////

	public static void main(String[] args) {
		Runnable one = new Runnable() {
			public void run() {
				print(1);
			}
		};
		Runnable two = new Runnable() {
			public void run() {
				print(2);
			}
		};
		Runnable finalRunnable = new Runnable() {
			public void run() {
				one.run();
				two.run();
			}
		};
		Thread thread = new Thread(finalRunnable);
		thread.start();
	}
}
