class WageCalculation {
    public static final int ABSENT = 0;
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmployeeWage;

    public WageCalculation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int calculateWorkinghours() {
        int empHour = 0;
        int totalWorkingHours = 0;
        for(int i=1; i<=numOfWorkingDays; i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case ABSENT:
                    empHour = 0;
                    break;
                case FULLTIME:
                    empHour = 8;
                    break;
                case PARTTIME:
                    empHour = 4;
                    break;
            }
            totalWorkingHours += empHour;
            if(totalWorkingHours >= maxHoursPerMonth)
                break;
        }
        //System.out.println(totalWorkingHours);
        return totalWorkingHours;
    }
    public void totalEmpWage(int totalWorkingHours) {
        int totalEmpWage = (empRatePerHour * totalWorkingHours);
        System.out.println("Wages per month of the employee working in " + company + " is : Rs." +totalEmpWage);
    }



}
