//package Lesson6Hw;
//
//public class Cat extends Animal {
//
//    private static int count;
//
//    public static int getCount() {
//        return count;
//    }
//
//    public Cat(String name, int stamina) {
//        super(name, stamina);
//        count++;
//    }
//
//    @Override
//    boolean run(int distance) {
//        super.run(distance);
//        if (distance < 200) {
//            System.out.println("Наш кот " + name + " пробежал " + distance + " метров");
//            return true;
//        }
//        {
//            System.out.println("Дистанция слишком большая, надо тренироваться.");
//        }
//        return false;
//    }
//
//    @Override
//    boolean swim(int distance) {
//        super.swim(distance);
//        if (distance > 0) {
//            System.out.println("Наш кот " + name + " сбежал с дистанции, так как не умеет плавать.");
//            return true;
//        }
//        {
//            System.out.println("Нашему коту " + name + " повезло, плыть ему не пришлось!");
//        }
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "stamina=" + stamina +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//
//
//
//
