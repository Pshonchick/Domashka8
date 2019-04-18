public class Tulip extends  Flowers{
    public int getTulipPrice() {
        return TulipPrice;
    }

    public int TulipPrice = 15;

    public int getPriceOfTulip() {
        return TulipPrice;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
