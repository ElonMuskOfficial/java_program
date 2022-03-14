class thread_one extends Thread {
    public void run() {
        try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
    }
  
}
class thread_two extends Thread {
    public void run() {
        try {
			for (int i = 6; i < 10; i++) {
				Thread.sleep(4000);
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
    }
}
class Sleep_Thread{
    public static void main(String args[]){
        thread_one T1 = new thread_one();
        T1.start();
        thread_two T2 = new thread_two();
        T2.start();
    }
}