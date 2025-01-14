public class doctor extends person {

    private String specialization;
     public doctor(String name, int age, String gender, String specialization){
         super(name, age, gender);
         this.specialization = specialization;
     }

     public void introduceDoctor(){
         System.out.println("Hi!!, I am "+ getName() + "and I am specialized in " + specialization);
     }
}
