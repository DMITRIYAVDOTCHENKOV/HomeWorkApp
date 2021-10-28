package Lesson7Hw;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void info() {

        System.out.println(name + " имеет аппетит " + appetite + ".\n" + name + " приступает к еде.");
        String isHungry = !satiety ? " сыт" : " остается голодным,т.к. в тарелке мало еды.";
        System.out.println(name + isHungry);
    }

    public void eat(Plate p) {
        if (satiety && p.decreaseFood(appetite)) {
            satiety = false;
        }
        System.out.println("---------------------");
    }


}

//
//    private final int appetite;
//    private final String name;
//    private boolean satiety;
//
//
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
//        this.satiety = true;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAppetite() {
//        return appetite;
//    }
//
//
//    void isЕhereАood (Plate plate) {
//        if (!plate.isThereEnoughFood(appetite) == true && satiety == true);{
//        }
//        System.out.println("---------");
//    }
//    void info() {
//        if (getFood() >= getAppetite()) {
//            System.out.println("У " + name + " " + appetite + " аппети. "
//                    + "Он может приступить к еду");;
//        } {
//        }
//    }
//
//
//    public boolean getSatiety() {
//        return satiety;
//    }
//
//
//    private int getFood() {
//        return appetite;
//    }
//
//
//}
//
//
//
