class Vehicles{
    protected int wheels;
    protected String color;
    protected int speed;
    protected int seat;
    Vehicles(int nwheels,int wspeed,int hseat,String wcolor){
        wheels = nwheels;
        speed = wspeed;
        seat = hseat;
        color = wcolor;
    }
    public void showpeed (int newval){
        speed = newval;
    }
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
class Scooter extends Vehicles{
    int breaks;
    Scooter(int nwheels,int wspeed, int hseat,String wcolor,int nbreaks){
        super(nwheels,wspeed,hseat,wcolor);
        this.breaks = nbreaks;
    }
}
class Carss extends Vehicles{
     int something;
    Carss(int nwheels,int wspeed, int hseat,String wcolor,int nsomething){
        super(nwheels,wspeed,hseat,wcolor);
    }

}


public class HirarchialInheritance {
    public static void main(String[] args) {
        Scooter s = new Scooter(2, 100, 2, "balack", 2);
        Carss c = new Carss(4, 200, 4, "red", 5);
        s.showpeed(100);
        System.out.println("speed is "+s.speed);
        s.applyBreak(20);
        System.out.println("speed is "+s.speed);
        s.speedUp(150);
        System.out.println("speed is "+s.speed);
        c.showpeed(100);
        System.out.println("speed is "+c.speed);
        c.applyBreak(20);
        System.out.println("speed is "+c.speed);
        c.speedUp(150);
        System.out.println("speed is "+c.speed);
        
    }   
}
