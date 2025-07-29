class EmployeeDetails {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Priya", "Amit", "Sneha", "Rakesh", "Meena", "Nikhil", "Divya", "Suresh", "Kiran"};
        int[] age = {30, 28, 32, 26, 35, 29, 31, 27, 34, 33};
        float[] salary = {45000.5f, 52000.0f, 61000.3f, 47000.8f, 70000.0f, 49000.2f, 53000.6f, 50000.4f, 68000.0f, 55000.0f};
        char[] grade = {'B', 'A', 'A', 'B', 'S', 'A', 'A', 'B', 'S', 'A'};
        double[] bonus = {4500.5, 5200.0, 6100.3, 4700.8, 7000.0, 4900.2, 5300.6, 5000.4, 6800.0, 5500.0};
        long[] empId = {1001L, 1002L, 1003L, 1004L, 1005L, 1006L, 1007L, 1008L, 1009L, 1010L};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for (int i = 0; i < salary.length; i++) {
            System.out.println(salary[i]);
        }
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
        for (int i = 0; i < bonus.length; i++) {
            System.out.println(bonus[i]);
        }
        for (int i = 0; i < empId.length; i++) {
            System.out.println(empId[i]);
        }
    }
}
