public class student extends person{

    private String graduatedIn;

    public student(String name, int age, String gender, String graduatedIn){
        super(name, age, gender);
        this.graduatedIn = graduatedIn;
    }
     public void introduceStudent(){
        System.out.println("Hi!!, I am "+ getName() + "and I am graduated in " + graduatedIn);
     }

     public void updateMyName(String updatedName){
        setName(updatedName);
     }
}
