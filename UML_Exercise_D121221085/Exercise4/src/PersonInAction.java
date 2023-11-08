public class PersonInAction {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Khadhi Musaid Syah");
        student.setAddress("Jl. Tamangapa no. 12");
        student.setCampus("Universitas Hasanuddin");

        Monthly monthlyEmployee = new Monthly();
        monthlyEmployee.setName("Andi Siti Aisyah Amin");
        monthlyEmployee.setAddress("Jl. Abdesir no. 99");
        monthlyEmployee.setTotalSalary(2500);
        monthlyEmployee.addAbsent(1);
        monthlyEmployee.calculateSalary();

        Hourly hourlyEmployee = new Hourly();
        hourlyEmployee.setName("Andi Syafiudin Musafir");
        hourlyEmployee.setAddress("Jalan Hertasning 08");
        hourlyEmployee.setTotalSalary(2500);
        hourlyEmployee.addHour( 12 );
        hourlyEmployee.calculateSalary();

        System.out.println("\nStudent:");
        System.out.println("Name        : " + student.getName());
        System.out.println("Address     : " + student.getAddress());
        System.out.println("Campus      : " + student.getCampus());

        System.out.println("\nMonthly Employee:");
        System.out.println("Name        : " + monthlyEmployee.getName());
        System.out.println("Address     : " + monthlyEmployee.getAddress());
        System.out.println("Total Salary: " + monthlyEmployee.getTotalSalary());

        System.out.println("\nHourly Employee:");
        System.out.println("Name        : " + hourlyEmployee.getName());
        System.out.println("Address     : " + hourlyEmployee.getAddress());
        System.out.println("Total Salary: " + hourlyEmployee.getTotalSalary());

    }

}