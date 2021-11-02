package Lesson7Hw;

import java.util.Scanner;

class Lesson7 {


    public static void main(String[] args) {

        Cat[] Cats = new Cat[5];
        Cats[0] = new Cat("Barsik", 15);
        Cats[1] = new Cat("Murzik", 20);
        Cats[2] = new Cat("Pyshok", 25);
        Cats[3] = new Cat("Myrka", 20);
        Cats[4] = new Cat("Musya", 30);

        Plate toEat = new Plate(50);

        Plate.info();
        for (Cat cat : Cats) {
            cat.eat(toEat);
            cat.info();
            Plate.info();
        }


//        addFood(plata); // вот оно не хочет рабоать

    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добавьте еды: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }
}


//
//        Cat[] cat = {
//                new Cat("Barsik", 12),
//                new Cat("Myrka", 5),
//                new Cat("Pushok", 3),
//                new Cat("Barsik1", 5),
//                new Cat("Barsik2", 9),
//
//        };
//        Plate plate = new Plate(10);
//        plate.info();
//
//        for (Cat cat1 : cat) {
//            cat1.info();
//
//
//        }
//    }
//    private static void printInfo(Cat... cats) {
//        for (Cat cat : cats) {
//            System.out.println(" ");
//        }
//    }
//}


//            cat[i].info();
//            System.out.println();
//
//
//        plate.info();
//        if (plate.getFood() > cat.getAppetite()) {
//            cat.eat(plate);
//        } else if (plate.getFood() < cat.getAppetite()) {
//        }
//    }
//}
//
//}

