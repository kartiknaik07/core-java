class Employee {
    static String name = "Kartik";
    static int id = 101;
    static String department = "HR";
    static double salary = 45000.75;
    static boolean isPermanent = true;

    public static void main(String[] args) {
        String n = getName();
        int i = getId();
        String d = getDepartment();
        double s = getSalary();
        boolean p = getIsPermanent();

        System.out.println(n);
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        System.out.println(p);
    }

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static String getDepartment() {
        return department;
    }

    public static double getSalary() {
        return salary;
    }

    public static boolean getIsPermanent() {
        return isPermanent;
    }
}
