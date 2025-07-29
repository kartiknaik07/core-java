class MobilePhoneDetails {
    public static void main(String[] args) {
        String[] models = {"iPhone 13", "Galaxy S22", "Pixel 6", "OnePlus 10", "Realme 11", "Redmi Note 12", "Vivo V27", "Oppo F23", "Nothing Phone", "Motorola Edge"};
        int[] ram = {6, 8, 8, 12, 6, 4, 8, 6, 12, 8};
        float[] screenSize = {6.1f, 6.5f, 6.4f, 6.7f, 6.6f, 6.5f, 6.8f, 6.6f, 6.5f, 6.7f};
        char[] rating = {'A','A','B','A','B','B','A','B','A','A'};
        double[] price = {79999.0, 74999.0, 59999.0, 64999.0, 25999.0, 18999.0, 30999.0, 27999.0, 39999.0, 34999.0};
        long[] imei = {123456789012345L,234567890123456L,345678901234567L,456789012345678L,567890123456789L,678901234567890L,789012345678901L,890123456789012L,901234567890123L,101234567890123L};

        for(int i = 0; i < models.length; i++) {
            System.out.println(models[i]);
        }
        for(int i = 0; i < ram.length; i++) {
            System.out.println(ram[i]);
        }
        for(int i = 0; i < screenSize.length; i++) {
            System.out.println(screenSize[i]);
        }
        for(int i = 0; i < rating.length; i++) {
            System.out.println(rating[i]);
        }
        for(int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
        for(int i = 0; i < imei.length; i++) {
            System.out.println(imei[i]);
        }
    }
}
