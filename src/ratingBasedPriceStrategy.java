public class ratingBasedPriceStrategy implements PriceMatchingStrategy {

    @Override
    public Double calculatePrice(TripMetaData tripMetaData) {
        if(tripMetaData.driverRating>=4)
        {return (double)100;}

        return (double) 10;
    }
}
