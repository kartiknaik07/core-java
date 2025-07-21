class Employees {
    String name;
    int id;
    String department;
    double salary;
    String designation;

    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.name = "Priya";
        System.out.println(e1.name);
        e1.id = 101;
        System.out.println(e1.id);

        Employees e2 = new Employees();
        e2.name = "Ravi";
        System.out.println(e2.name);
        e2.id = 102;
        System.out.println(e2.id);

        Employees e3 = new Employees();
        e3.name = "Megha";
        System.out.println(e3.name);
        e3.id = 103;
        System.out.println(e3.id);

        Employees e4 = new Employees();
        e4.name = "Kiran";
        System.out.println(e4.name);
        e4.id = 104;
        System.out.println(e4.id);

        Employees e5 = new Employees();
        e5.name = "Anita";
        System.out.println(e5.name);
        e5.id = 105;
        System.out.println(e5.id);

        Employees e6 = new Employees();
        e6.name = "Sunil";
        System.out.println(e6.name);
        e6.id = 106;
        System.out.println(e6.id);

        Employees e7 = new Employees();
        e7.name = "Deepa";
        System.out.println(e7.name);
        e7.id = 107;
        System.out.println(e7.id);

        Employees e8 = new Employees();
        e8.name = "Ajay";
        System.out.println(e8.name);
        e8.id = 108;
        System.out.println(e8.id);

        Employees e9 = new Employees();
        e9.name = "Nisha";
        System.out.println(e9.name);
        e9.id = 109;
        System.out.println(e9.id);

        Employees e10 = new Employees();
        e10.name = "Arun";
        System.out.println(e10.name);
        e10.id = 110;
        System.out.println(e10.id);

        e1.setEmployee("Shyam", 120, "IT", 75000.0, "Developer");
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.department);
        System.out.println(e1.salary);
        System.out.println(e1.designation);
    }

    public void setEmployee(String n, int i, String d, double s, String des) {
        name = n;
        id = i;
        department = d;
        salary = s;
        designation = des;
    }
}
