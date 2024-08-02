class Area{
    final float pi = 3.1412f;
    void accept(int rad){
        float ac = pi*(rad*rad);
        System.out.println("Area of the circle is "+ac);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Area ar = new Area();
        ar.accept(5);
    }
}
