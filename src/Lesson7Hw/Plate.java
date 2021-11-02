//package Lesson7Hw;
//
//public class Plate {
//    private static int food;
//
//    public Plate(int food) {
//        Plate.food = food;
//    }
//
//    public boolean decreaseFood(int n) {
//        int difference = food - n;
//        if (difference < 0) return false;
//        food -= n;
//        return true;
//    }
//
//    public static void info() {
//        System.out.println(" У нас: " + food + " Тарелок с едой");
//    }
//
//    public void addFood(int food) {
//        System.out.println("=====================================\nДобавляем еду: " + food);
//        Plate.food += food;
//    }
//
//}
////
////    private int food;
////
////    public Plate(int food) {
////        this.food = food;
////    }
////
////
////    public int getFood() {
////        return food;
////    }
////
////    public void setFood(int food) {
////        this.food = food;
////    }
////
////    public void info() {
////        System.out.println("У нас есть: " + food + " тарелок с едой");
////    }
////
////    public boolean decreaseFood(int appetite) {
////        if (food > 0) {
////            this.food -= appetite;
////            return true;
////        }
////        return false;
////    }
////    public boolean isThereEnoughFood( int foodCount ) {
////        return getFood() >= foodCount;
////    }
////
////
////}
//
