class thread_one extends Thread{
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " - " + "A");
        }
    }
}
class thread_two extends Thread{
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " - " + "B");
        }
    }
}
class thread_three extends Thread{
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " - " + "C");
        }
    }
}
class thread_pro2{
    public static void main(String[] args){
        thread_one one = new thread_one();
        one.start();
        thread_two two = new thread_two();
        two.start();
        thread_three three = new thread_three();
        three.start();
    }
}