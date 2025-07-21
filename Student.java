class Student {
    static String name = "Rahul";
    static int age = 21;
    static char grade = 'A';
    static String course = "Computer Science";
    static int year = 3;

    public static void main(String[] args) {
        String n = getName();
        int a = getAge();
        char g = getGrade();
        String c = getCourse();
        int y = getYear();

        System.out.println(n);
        System.out.println(a);
        System.out.println(g);
        System.out.println(c);
        System.out.println(y);
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static char getGrade() {
        return grade;
    }

    public static String getCourse() {
        return course;
    }

    public static int getYear() {
        return year;
    }
}
