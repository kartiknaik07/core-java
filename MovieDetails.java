class MovieDetails {
    public static void main(String[] args) {
        String[] titles = {"KGF", "RRR", "Pushpa", "Vikram", "Leo", "Jailer", "Kantara", "Salar", "Beast", "Pathaan"};
        int[] year = {2018, 2022, 2021, 2022, 2023, 2023, 2022, 2023, 2022, 2023};
        float[] rating = {8.5f, 9.0f, 8.2f, 8.8f, 7.9f, 8.0f, 9.1f, 8.6f, 6.9f, 7.5f};
        char[] lang = {'K','T','T','T','T','T','K','T','T','H'};
        double[] collection = {250.5, 300.0, 280.8, 310.2, 270.0, 260.5, 240.4, 295.0, 220.0, 320.5};
        long[] views = {50000000L, 70000000L, 65000000L, 72000000L, 68000000L, 64000000L, 55000000L, 60000000L, 43000000L, 75000000L};

        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }
        for (int i = 0; i < year.length; i++) {
            System.out.println(year[i]);
        }
        for (int i = 0; i < rating.length; i++) {
            System.out.println(rating[i]);
        }
        for (int i = 0; i < lang.length; i++) {
            System.out.println(lang[i]);
        }
        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[i]);
        }
        for (int i = 0; i < views.length; i++) {
            System.out.println(views[i]);
        }
    }
}
