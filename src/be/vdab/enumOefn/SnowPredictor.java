package be.vdab.enumOefn;

public class SnowPredictor {
    Seasons currentSeason;

    SnowPredictor() {
    }

    public static void main(String[] args) {
        SnowPredictor c = new SnowPredictor();
        c.currentSeason=Seasons.Winter;

            if (c.currentSeason == Seasons.Winter) {
                System.out.println("Er is een grote kans dat het zal sneeuwen");
            } else if (c.currentSeason == Seasons.Automn) {
                System.out.println("Er kan sneeuw vallen in dit seizoen");
            } else if (c.currentSeason == Seasons.Summer) {
                System.out.println("Er is geen kans op sneeuw");
            } else if (c.currentSeason == Seasons.Spring) {
                System.out.println("Er kan sneeuw vallen, maar wellicht niet");
            }

        }

    }


