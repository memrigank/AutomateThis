public class driver extends person{

    private String licenseType;

    public driver(String name, int age, String gender, String licenseType) {
        super(name, age, gender);
        this.licenseType = licenseType;
    }

    public void introduceDriver(){
        System.out.println("Hi!!, I am "+ getName() + " and I can drive " + licenseType);
    }
}
