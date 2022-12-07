package Lab12;

public abstract class Device {
    private int ID;
    protected double price;
    private static int startID = 1000;

    public Device(){}
    protected Device(double price){
        this.price = price;
        this.ID = startID;
        startID++;
    }

    public int getID(){
        return this.ID;
    }

    @Override
    public String toString() {
        return "Device{" +
                "ID=" + ID +
                ", price=" + price +
                '}';
    }
}
