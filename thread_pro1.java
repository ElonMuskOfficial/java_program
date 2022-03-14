class thread_one implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " > " + "A");
        }
    }
}
class thread_two implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            
            System.out.println(i + " = " + "B");
        }
    }
}
class thread_three implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " - " + "C");
        }
    }
}
class thread_pro1{
    public static void main(String[] args) {
        thread_one one = new thread_one();
        Thread T1 = new Thread(one);
        T1.start();
        thread_two two = new thread_two();
        Thread T2 = new Thread(two);
        T2.start();
        thread_three three = new thread_three();
        Thread T3 = new Thread(three);
        T3.start();
    }
}