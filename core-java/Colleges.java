class Colleges {
    static int totalStudents = 2000;
    static int totalTeachers = 100;
    static int totalDepartments = 10;
    static int feePerStudent = 50000;
    static int scholarshipPerStudent = 10000;

    

    public static double studentTeacherRatio() {
        return totalStudents /  totalTeachers;
    }

    
    public static int totalFees() {
        return totalStudents * feePerStudent;
    }

   
    public static int totalScholarship() {
        return totalStudents * scholarshipPerStudent;
    }

    
    public static int netIncome() {
        return totalFees() - totalScholarship();
    }

    
    public static double avgStudentsPerDept() {
        return totalStudents / totalDepartments;
    }

}
