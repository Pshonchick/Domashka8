import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {


FlowersStore flowerStore = new FlowersStore();
FlowersStore flowerStore1 = new FlowersStore();
flowerStore.sell(3,2,1);
flowerStore1.sellSequence(3,2,1);

        System.out.println("How sell works: " );

        for (int i = 0; i < flowerStore.bouquet.size() ; i++) {
            System.out.print(flowerStore.bouquet.get(i));
        }
        System.out.println(" ");
        System.out.println("How sellSequence works: " );

        for (int i = 0; i <flowerStore1.bouquet.size() ; i++) {
            System.out.print( flowerStore1.bouquet.get(i));
        }


        FlowersStore flowersStore = new FlowersStore();
        flowerStore.bouquet.add(0, new Rose());
        flowerStore.bouquet.add(1, new Rose());
        flowerStore.bouquet.add(2, new Tulip());
        flowerStore.bouquet.add(3, new Rose());
        flowerStore.bouquet.add(4, new Tulip());
        flowerStore.bouquet.add(5, new Chamomile());
        flowerStore.bouquet.add(6, new Rose());
        flowerStore.bouquet.add(7, new Chamomile());

        System.out.println(flowerStore.bouquet.toString());
        FlowersSaver flowersSaver = new FlowersSaver();
        flowersSaver.save(Paths.get("C:\\GoIT\\FS\\FS.txt"));

        System.out.println(flowersSaver.bouquet.toString());

    }
}
