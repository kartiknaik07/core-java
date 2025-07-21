class Students {
    String name;
    int age;
    int rollNumber;
    String grade;
    String schoolName;

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Arun";
        System.out.println(s1.name);
        s1.age = 16;
        System.out.println(s1.age);
        s1.rollNumber = 23;
        System.out.println(s1.rollNumber);
        s1.grade = "10th";
        System.out.println(s1.grade);
        s1.schoolName = "ABC School";
        System.out.println(s1.schoolName);

        Students s2 = new Students();
        s2.name = "Meera";
        System.out.println(s2.name);
        s2.age = 15;
        System.out.println(s2.age);

        Students s3 = new Students();
        s3.name = "John";
        System.out.println(s3.name);
        s3.age = 17;
        System.out.println(s3.age);

        Students s4 = new Students();
        s4.name = "Varun";
        System.out.println(s4.name);
        s4.age = 18;
        System.out.println(s4.age);

        Students s5 = new Students();
        s5.name = "Neha";
        System.out.println(s5.name);
        s5.age = 19;
        System.out.println(s5.age);

        Students s6 = new Students();
        s6.name = "Ravi";
        System.out.println(s6.name);
        s6.age = 16;
        System.out.println(s6.age);

        Students s7 = new Students();
        s7.name = "Sara";
        System.out.println(s7.name);
        s7.age = 14;
        System.out.println(s7.age);

        Students s8 = new Students();
        s8.name = "Rahul";
        System.out.println(s8.name);
        s8.age = 17;
        System.out.println(s8.age);

        Students s9 = new Students();
        s9.name = "Priya";
        System.out.println(s9.name);
        s9.age = 15;
        System.out.println(s9.age);

        Students s10 = new Students();
        s10.name = "Kiran";
        System.out.println(s10.name);
        s10.age = 18;
        System.out.println(s10.age);

        s1.setStudent("Charan", 20, 101, "12th", "xyz");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.grade);
        System.out.println(s1.schoolName);
    }

    public void setStudent(String n, int a, int r, String g, String sn) {
        name = n;
        age = a;
        rollNumber = r;
        grade = g;
        schoolName = sn;
    }
}
