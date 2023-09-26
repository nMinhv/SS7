package ra.bt.bt1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Minh");
        System.out.print("Original value:");
        System.out.println(myClass.getMyString());
        myClass.setMyString("Minh");
        System.out.print("New value: ");
        System.out.println(myClass.getMyString());
    }
}
