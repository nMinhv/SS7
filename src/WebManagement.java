public class WebManagement {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.visited();
        // gọi phương thức
        Counter.greetingHero("User1");
        Counter counter2 = new Counter();
        counter2.visited();
        Counter.greetingHero("USer2");
        Counter counter3 = new Counter();
        Counter.greetingHero("USer3");
        counter3.visited();

    }
}
