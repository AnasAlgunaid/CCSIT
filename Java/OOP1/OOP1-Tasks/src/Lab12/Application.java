package Lab12;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Device> list = new ArrayList<>();

        list.add(new Phone(2500, 2));
        list.add(new Phone(3000, 1));

        list.add(new Fridge(4000, 7));
        list.add(new Fridge(2000, 5));

        for(int i = 0; i < 4; i++){
            System.out.println(list.get(i).toString());
        }

        if(((Fridge)list.get(2)).compareTo(((Fridge) list.get(3))) > 0){
            System.out.println("Fridge with ID " + list.get(2).getID() + " has more shelves.");
        }
        else if(((Fridge)list.get(2)).compareTo(((Fridge) list.get(3))) < 0){
            System.out.println("Fridge with ID " + list.get(3).getID() + " has more shelves.");
        }

        else{
            System.out.println("Both fridges have the same number of shelves.");
        }
    }
}
