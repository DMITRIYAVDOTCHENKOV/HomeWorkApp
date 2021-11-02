//package Employee;
//
//import java.util.Random;
//
//public class EmployeeFail {
//    private String SNP;
//    private String post;
//    private String email;
//    private String telephone;
//    private int salary;
//    private int age;
//
//
//    public EmployeeFail(String SNP, String post, String email, String telephone, int salary) {
//        this.SNP = SNP;
//        this.post = post;
//        this.email = email;
//        this.telephone = telephone;
//        this.salary = salary;
//        this.age = ageRandom();
//
//
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int ageRandom() {
//        return new Random().nextInt(15)+30;
//    }
//
//
//
//    public void info() {
//        if (age > 40) {
//            System.out.println("Я " + SNP + ", работаю " + post + ". Мне " + age + " лет."
//                    + " Моя зарпалат: " + salary + " т.р"
//                    + "\n Мои контакты: " + " email - " + email + " " + telephone);
//        } else if (age < 18) {
//            System.out.println(SNP + " Вы слищком молоды, что бы рабоать!!");
//        }
//    }
//}
//
//
