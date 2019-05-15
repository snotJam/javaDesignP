package lastAndDetailDesc.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStrategy(new CarToSchool());
        student.toSchool();
        System.out.println("---------------------------");
        Student student1 = new Student();
        student1.setStrategy(new BusToSchool());
        student1.toSchool();
    }
}
