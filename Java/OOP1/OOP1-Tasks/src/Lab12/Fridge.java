package Lab12;

public class Fridge extends Device implements Comparable<Fridge>{
    private int numShelf;
    public Fridge(double price, int numShelf){
        super(price);
        this.numShelf = numShelf;
    }

    public int getNumShelf() {
        return numShelf;
    }

    public void setNumShelf(int numShelf) {
        this.numShelf = numShelf;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", numShelf=" + numShelf
                + '}';
    }

    @Override
    public int compareTo(Fridge f) {
        if(numShelf > f.getNumShelf()){
            return 1;
        }
        else if(numShelf < f.getNumShelf()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
