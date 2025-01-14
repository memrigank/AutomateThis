public class person {

    private String name;
    private  int age;
    private String gender;

    public person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

     protected String getName(){
        return name;
     }

    protected void setName(String updatedName){
        this.name= updatedName;
    }
}
