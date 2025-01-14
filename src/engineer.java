public class engineer extends person{
    private String specialization;

    public engineer(String name, int age, String gender, String specialization){
        super(name, age, gender);
        this.specialization = specialization;
    }

    public void introduceEngineer(){
        System.out.println("Hi!!, I am "+ getName() + "and I am specialized in " + specialization);
    }
}
