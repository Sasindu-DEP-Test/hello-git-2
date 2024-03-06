public class AppInitializer {
    {
        B.y += 2 + ((C)this).x;
    }
    {
        System.out.println("AppInitializer: Instance");
    }
    static{
        System.out.println("AppInitializer: Static");
    }
    public static void main(String[] args) {
        System.out.println(new C().z);
    }
}
class A extends B{
    int x = 10;
    static{
        y = D.a;
    }
    {
        System.out.println("A: Instance");
    }
    static{
        System.out.println("A: Static");
    }
}
class B extends AppInitializer{
    static int y = 20;
    {
        System.out.println("B: Instance");
    }
    static{
        System.out.println("B: Static");
    }
}
class C extends D{
    {
        y = x + a;
    }
    int z = x + y;
    static {
        y += 3;
    }
    public C() {
        super(2);
        System.out.println("C: Constructor");
        x++;
    }
    {
        System.out.println("C: Instance");
    }
    static{
        System.out.println("C: Static");
    }
}
class D extends A{
    static int a = 15 + y;
    { a = x + 2; }
    D(int value){
        y += value;
        {
            a++;
        }
    }
    {
        System.out.println("D: Instance");
    }
    static{
        System.out.println("D: Static");
    }
}
