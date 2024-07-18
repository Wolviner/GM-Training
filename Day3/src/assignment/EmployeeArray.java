package assignment;



class EmployeeDetails {
    private String name;
    private int id;
    private double sal;
    private double grosssal;
    private double netsal;

    public EmployeeArray(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
        calculateSalaries();
    }

    private void calculateSal() {
        double hra, ta, a, it;
        
        if (sal >= 70) {
            hra = 0.15 * sal;
            ta = 0.10 * sal;
            a = 0.10 * sal;
            it = 0.11 * sal;
        } else if (sal >= 50) {
            hra = 0.13 * sal;
            ta = 0.08 * sal;
            a = 0.08 * sal;
            it = 0.09 * sal;
        } else if (sal >= 30) {
            hra = 0.10 * sal;
            ta = 0.07 * sal;
            a = 0.07 * sal;
            it = 0.08 * sal;
        } else {
            hra = ta = a = 0.0;
            it = 0.0;
        }

        grosssal = sal + hra + ta + a;
        netsal = grosssal - it;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getsal() {
        return sal;
    }

    public double getGrosssal() {
        return grosssal;
    }

    public double getNetsal() {
        return netsal;
    }
}
