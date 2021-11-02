//package Lesson6Hw;
//
//public class Dogs extends Animal {
//    private static int count;
//
//    public static int getCount() {
//        return count;
//    }
//
//    public Dogs(String name, int stamina) {
//        super(name, stamina);
//        count++;
//    }
//
//    @Override
//    boolean run(int distance) {
//        super.run(distance);
//        if (distance < 500) {
//            System.out.println("Наш пес " + name + " пробежал " + distance + " метров");
//            return true;
//        } else {
//            System.out.println("Дистанция слишком большая, надо тренироваться.");
//        }
//        return false;
//    }
//
//    @Override
//    boolean swim(int distance) {
//        super.swim(distance);
//        if (distance < 10) {
//            System.out.println("Наш пес " + name + " проплыл " + distance + " метров");
//            return true;
//        } else {
//            System.out.println("Пес не осилил данную дистанцию...");
//        }
//        return false;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Dogs{" +
//                "stamina=" + stamina +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//
//
////    public int obstacleLengthDogs;
////
////    public Dogs(int toRun, int toSail, int obstacleLength, int obstacleLengthRandomDogs) {
////        super(toRun, toSail, obstacleLength, obstacleLengthRandomDogs);
////        this.obstacleLengthDogs = obstacleLengthRandomDogs;
////
////    }
////
////
////    protected  int obstacleLengthRandomDogs() {
////        return new Random().nextInt(20);}
////
////
////
////    public void goToRun() {
////        int toRun = obstacleLengthRandom();
//////        int obstacleLengthRandomDogs = 0;
//////        if (toRun < 200 && obstacleLengthRandomDogs < 10) {
////        int obstacleLengthRandomDogs = obstacleLengthRandomDogs();
////        System.out.println("Наша собака смогла пробежать: " + toRun + " и проплыть: " + obstacleLengthRandomDogs + " метров");
//////        } else if (toRun < 200 && obstacleLengthRandomDogs > 10) {
//////            System.out.println("Наша собака смогла пробежать: " + toRun + " метров. " + "Но водную дистанцию осилить не смогла");
//////        }else if (toRun > 200 && obstacleLengthRandomDogs > 10) {
//////            System.out.println("Надо больше тренироваться! такую дистанцию собака осилить не может.");
////        }
////    }
