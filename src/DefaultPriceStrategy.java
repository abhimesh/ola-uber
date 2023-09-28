public class DefaultPriceStrategy implements PriceMatchingStrategy{
    @Override
    public Double calculatePrice(TripMetaData tripMetaData) {
        return (double)100;
    }
}
