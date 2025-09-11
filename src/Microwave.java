public class Microwave{
    //attributes
    private String brand;
    private int maxPower;

    public Microwave (String manufacturer, int power)
    {
      
        brand = manufacturer;
        maxPower = power;
    }
    //microwave behaviors...
    public void spin()
    {

    }
    public void spin(boolean spinVal)
    {

    }
    public void cook()
    {

    }
    public void cook(int seconds, int power)
    {
        System.out.println("Cooking for " + seconds + " at " + power + "W");
    }
    public void cook30()
    {
        cook(30, maxPower);
    }
    public void beep()
    {
        System.out.println("BEEP");
    }
    public void defrost(int time)
    {

    }
    public void defrost(int time, int power)
    {

    }

    public static void main(String[] args)
    {
        Microwave mySweetCookingDevice = new Microwave("Samsung", 800);
        mySweetCookingDevice.cook30();
        mySweetCookingDevice.cook(120, 400);
        mySweetCookingDevice.beep();
    }
}