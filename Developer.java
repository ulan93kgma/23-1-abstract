public class Developer extends Employee {
    private String grades;


    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }
    public void writeCode() {
        super.person();
        System.out.println(" writes code");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Maldivy");
    }
    void goToDayOff() {
        System.out.println("дежурство в нерабочее время");
    }
}
