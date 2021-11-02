//package Lesson6Hw;
//
//import java.util.Random;
//
//
//public class Lesson6 {
//    public static void main(String[] args) {
//        Animal[] participants = prepareParticipants();
//        playGame(participants);
//
//
//    }
//
//    protected static Animal[] prepareParticipants() {
//        return new Animal[]{
//                new Cat("Barsir", 100),
//                new Cat("Mypka", 400),
//                new Cat("Pushok", 200),
//                new Cat("KisKis", 20),
//                new Dogs("Kolli", 500),
//                new Dogs("Sharic", 700),
//                new Dogs("Recs", 300),
//        };
//    }
//
//
//    private static void playGame(Animal[] participants) {
//        Random random = new Random();
//
//
//        for (Animal participant : participants) {
//            participant.printInfo();
//            System.out.println(participant.run(random.nextInt(500)));
//            System.out.println(participant.swim(random.nextInt(20)));
//            System.out.println("_________");
//        }
//        System.out.println("В забеге принмало участие " + Animal.getCount() + " животных");
//        System.out.println("Из них кошек было: " + Cat.getCount());
//        System.out.println("А собак: " + Dogs.getCount());
//    }
//}
//
//
//
//
//
//
