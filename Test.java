class Bicycle{
    public int gear, speed;

    public Bicycle(int gear, int speed){
            this.gear = gear;
            this.speed =speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedup(int increment){
        speed += increment;
    }
    public String toString()
    {
        return("No. of Gears are "+ gear
                + "\n" +
                "Speed of bicycle is : " + speed
        );

    }
}
class MountainBike extends Bicycle{

    public int seatheight;

    public MountainBike(int gear, int speed, int startheight){
            super(gear, speed);
            seatheight = startheight;
    }
    public void setHeight(int newvalue){
        seatheight = newvalue;
    }
    @Override
    public String toString()
    {
        return ( super.toString() + "\n seat height is :" + seatheight);
    }
}
public class Test{
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}