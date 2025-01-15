public class baseClass {

    public static void main(String[] args){
        person person = new person("Atom", 32, "Male");
        System.out.println(person.getName());
        student student = new student("Bruce", 32, "Male", "Aerospace");
        student.introduceStudent();
        engineer engineer = new engineer("Maurice", 32, "Male", "Plasma Physics");
        engineer.introduceEngineer();
        doctor doctor = new doctor("Jovine", 32, "Female", "Gyne");
        doctor.introduceDoctor();
        driver driver = new driver("Tonui", 43, "Male", "Truck");
        driver.introduceDriver();
    }
}
