import java.util.ArrayList;

public class FlowersStore {

    ArrayList<Flowers> bouquet = new ArrayList<>();
    private int total;


    public int wallet(ArrayList<Flowers> bouquet){

        for (int i = 0; i < bouquet.size() ; i++) {
            total = total + bouquet.get(i).getPrice();
        }


        return total;
    }

    public ArrayList sell(int nubmerOfRoses, int numberOfChamomiles, int numberOfTulips) {
        for (int i = 0; i < nubmerOfRoses; i++) {
            bouquet.add(new Rose());
        }
        for (int i = 0; i < numberOfChamomiles; i++) {
            bouquet.add(new Chamomile());
        }
        for (int i = 0; i < numberOfTulips; i++) {
            bouquet.add(new Tulip());
        }
        return bouquet;
    }

    public ArrayList sellSequence(int nubmerOfRoses, int numberOfChamomiles, int numberOfTulips) {
        int var = Math.max(nubmerOfRoses, numberOfChamomiles);
        int max = Math.max(var, numberOfTulips);
        for (int i = 0; i < max; i++) {
            if (i<nubmerOfRoses) {
                bouquet.add(new Rose());
            }
            if (i<numberOfChamomiles) {
                bouquet.add(new Chamomile());
            }
            if (i<numberOfTulips) {
                bouquet.add(new Tulip());
            }
        }

        return bouquet;
    }

}
