class CricketPlayerDetails {
    public static void main(String[] args) {
        String[] names = {"Virat", "Rohit", "Dhoni", "Kohli", "Rahul", "Jadeja", "Hardik", "Bumrah", "Shami", "Gill"};
        int[] age = {35, 36, 42, 35, 32, 34, 30, 29, 33, 24};
        float[] average = {52.3f, 45.8f, 50.1f, 55.0f, 42.4f, 38.7f, 35.5f, 22.3f, 24.9f, 47.5f};
        char[] grade = {'A','A','A','S','B','A','B','A','B','A'};
        double[] runs = {12000.0, 10000.0, 11000.0, 12300.0, 8000.0, 4500.0, 3000.0, 800.0, 1000.0, 2300.0};
        long[] jerseyNo = {18L, 45L, 7L, 18L, 1L, 8L, 33L, 93L, 11L, 77L};

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for(int i = 0; i < average.length; i++) {
            System.out.println(average[i]);
        }
        for(int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
        for(int i = 0; i < runs.length; i++) {
            System.out.println(runs[i]);
        }
        for(int i = 0; i < jerseyNo.length; i++) {
            System.out.println(jerseyNo[i]);
        }
    }
}
