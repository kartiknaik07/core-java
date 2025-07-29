class VehicleDetails {
    public static void main(String[] args) {
        String[] model = {"Swift", "Creta", "i20", "Nexon", "Altroz", "Innova", "XUV700", "Punch", "Baleno", "Verna"};
        int[] year = {2019, 2020, 2021, 2022, 2023, 2018, 2023, 2021, 2020, 2019};
        float[] mileage = {21.5f, 18.3f, 20.1f, 17.0f, 19.5f, 12.4f, 15.2f, 18.9f, 20.0f, 17.3f};
        char[] fuelType = {'P','D','P','D','P','D','D','P','P','P'};
        double[] price = {600000.0, 1000000.0, 800000.0, 900000.0, 850000.0, 1500000.0, 1800000.0, 700000.0, 750000.0, 950000.0};
        long[] regNo = {KA01AB1234L, KA02CD2345L, KA03EF3456L, KA04GH4567L, KA05IJ5678L, KA06KL6789L, KA07MN7890L, KA08OP8901L, KA09QR9012L, KA10ST0123L};

        for (int i = 0; i < model.length; i++) {
            System.out.println(model[i]);
        }
        for (int i = 0; i < year.length; i++) {
            System.out.println(year[i]);
        }
        for (int i = 0; i < mileage.length; i++) {
            System.out.println(mileage[i]);
        }
        for (int i = 0; i < fuelType.length; i++) {
            System.out.println(fuelType[i]);
        }
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
        for (int i = 0; i < regNo.length; i++) {
            System.out.println(regNo[i]);
        }
    }
}
