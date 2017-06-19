public class ConvertAverageSpeedinMiles {
    public static void main (String [] args){

        double distance = 14.0;
        int tijd = 45*60 +30;
        int aantalSecondenPerUur = 3600;
        double tijdInUren = tijd / (double)aantalSecondenPerUur;
        double kilometerPerUur = distance / tijdInUren;

        double milesPerUur = Average.converter(14);
    }
}