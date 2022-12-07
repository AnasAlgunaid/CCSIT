package Lab12;

public class Phone extends Device implements Cloneable{
    private int numSIM;

    public Phone(double price, int numSIM){
        super(price);
        this.numSIM = numSIM;
    }

    public int getNumSIM() {
        return numSIM;
    }

    public void setNumSIM(int numSIM) {
        this.numSIM = numSIM;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", numSIM=" + numSIM
                + '}';
    }
}
