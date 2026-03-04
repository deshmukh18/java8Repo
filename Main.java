public class Main {
    int er = 234;
    Main m;

    private static void main(String[] args) {
        A a = new B();
        a.add();

        B b = new B();
        b.add();

        C c = new C();
        c.add();

        Main m = new Main();
        Main.print(m.er);

    }

    public static void print(int ere) {
        System.out.println(ere);
    }
}
