class GalToLitTable {

    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            //gallons = 10; // Starting data is 10 gallons
            liters = gallons * 3.7854; // Translate to liters

            System.out.println(gallons + " gallons is " +
                    liters + " liters");
            counter++; // This code makes empty string string each 10.
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

        }
    }
}