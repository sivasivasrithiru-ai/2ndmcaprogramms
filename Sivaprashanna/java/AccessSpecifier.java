class AccessDemo {

    public int a = 10;       // public
    private int b = 20;      // private
    protected int c = 30;    // protected
    int d = 40;              // default

    public void display() {
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class AccessSpecifier {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.c);
        System.out.println("Default: " + obj.d);

        obj.display(); // Accessing private variable through method
    }
}