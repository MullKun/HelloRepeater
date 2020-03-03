public class HelloRepeaterDemo {
    public static void main(String[] args) {
        int numberOfThreads = Integer.parseInt(args[0]);
        for (; numberOfThreads >= 1; numberOfThreads--) {
            HelloRepeater helloRepeaterInstance = new HelloRepeater(numberOfThreads);
            helloRepeaterInstance.run();
        }

    }
}

class HelloRepeater implements Runnable {
    Integer id;
    public HelloRepeater(Integer id) {
        this.id = id;
    }

    public void run() {
        synchronized (this){
            System.out.println("Hello world "+ this.id);
        }
    }
}
