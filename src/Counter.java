public class Counter {
    private static int count = 0;
    private static String webName = "Hero Academy";
    //Static Block
    private String webColor = "red";
    private final float  PI = 3.14F;
    static {
        count = 5;
        webName = "HeroAcademy";
    }
    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void visited() {
        count++;
        this.printCount();
    }
    public void printCount() {
        System.out.println("Count --->" + count);
    }
    // greeting when visit
    public static void greetingHero(String heroName) {
        System.out.println("Welcome " + heroName);
    }
}
