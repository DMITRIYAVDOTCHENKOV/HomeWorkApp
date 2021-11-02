//package java1.lesson4;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class TicTacToeMy {
//
//    public static final String AI_WIN_MSG = "Победил компьютер!";
//    public static final String HUMAN_WIN_MSG = "Победил человек!";
//    public static final String DRAW_MSG = "Ничья!";
//
//
//    private static final char DAT_X = 'X';
//    private static final char DAT_0 = '0';
//    private static final char DOT_EMPTY = '•';
//
//
//    private static final int SIZE = 5;
//    private static final int DOT_TO_WIN = 4;
//
//
//    private static char[][] map;
//    private static final Scanner scanner = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//        initMAp();
//        printMap();
//        while (true) {
//            HumanTurn();
//            printMap();
//
//            if (checkEndGame(DAT_X)) {
//                break;
//            }
//
//            aiTurn();
//            printMap();
//            if (checkEndGame(DAT_0)) {
//                break;
//            }
//        }
//    }
//
//    private static boolean checkEndGame(char symbol) {
//        if (isMapFull()) {
//            System.out.println(DRAW_MSG);
//            return true;
//        }
//
//        if (isWin(symbol)) {
//            System.out.println(getWinMessageBy(symbol));
//            return true;
//        }
//        return false;
//    }
//
//    private static String getWinMessageBy(char symbol) {
//        return symbol == DAT_X ? HUMAN_WIN_MSG : AI_WIN_MSG;
//    }
//
//    private static boolean isWin(char symbol) {
//       return  (RowsAndCols(symbol)  || Diagonals(symbol));
//
//            }
//
//
//
////    //check rows
//    private static boolean RowsAndCols(char symbol) {
//
//
//
//        for (int i = 0; i <  SIZE; i++) {
//            int rowCounter = 0;
//            int colCounter = 0;
//            for (int j = 0; j < SIZE; j++) {
//                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
//                colCounter = (map[j][i] == symbol) ? colCounter + 1 : 0;
//                if (rowCounter == DOT_TO_WIN || colCounter == DOT_TO_WIN) {
//                    return true;
//
//                }
//            }
//
//        }
//        return false;
//    }
//    private static boolean Diagonals(char symbol){
//        int mainDiagCounter = 0;
//        int sideDiagCounter = 0;
//        for (int i = 0; i < SIZE; i++) {
//            mainDiagCounter = (map[i][i] == symbol) ? mainDiagCounter +1 : 0;
//            sideDiagCounter = (map[i][map.length - 1 - i] ==symbol) ? sideDiagCounter + 1 : 0;
//            if (mainDiagCounter == DOT_TO_WIN || sideDiagCounter == DOT_TO_WIN) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//
//
//    private static boolean isMapFull() {
//        for (int row = 0; row < SIZE; row++) {
//            for (int col = 0; col < SIZE; col++) {
//                if (isEmptyCell(row, col)) {
//                    return false;
//                }
//
//            }
//
//        }
//        return true;
//    }
//
//    private static void aiTurn() {
//        int row, col;
//        Random random = new Random();
//
//        do {
//            row = random.nextInt(SIZE);
//            col = random.nextInt(SIZE);
//        } while (!isEmptyCell(row, col));
//
//        map[row][col] = DAT_0;
//    }
//
//    private static void HumanTurn() {
//        System.out.println("Введите координаты row и col: ");
//        int row = 0;
//        int col = 0;
//        do {
//            row = readIndex();
//            col = readIndex();
//
//            if (!checkRange(row) || !checkRange(col)) {
//                System.out.println("Координаты должны быть в диапазоне от 1 до " + SIZE);
//                continue;
//            }
//
//            if (isEmptyCell(row - 1, col - 1)) {
//                break;
//            } else {
//
//                System.out.println("Клетка уже занята!");
//            }
//        } while (true);
//
//        map[row - 1][col - 1] = DAT_X;
//    }
//
//
//    private static boolean isEmptyCell(int row, int col) {
//        return map[row][col] == DOT_EMPTY;
//
//
//    }
//
//    private static int readIndex() {
//        while (!scanner.hasNextInt()) {
//            System.out.println("Координаты должны иметь целочисленное значение!");
//            scanner.next();
//
//
//        }
//        return scanner.nextInt();
//    }
//
//    private static boolean checkRange(int index) {
//        return index >= 1 && index <= SIZE;
//
//    }
//
//    private static void initMAp() {
//        map = new char[SIZE][SIZE];
//
//
//        for (int row = 0; row < map.length; row++) {
//            Arrays.fill(map[row], DOT_EMPTY);
//        }
//    }
//
//    private static void printMap() {
//        printMapHeader();
//        printMapState();
//        System.out.println();
//    }
//
//    private static void printMapState() {
//        for (int row = 0; row < SIZE; row++) {
//            printRowNumber(row);
//            printRow(map[row]);
//            System.out.println();
//        }
//    }
//
//    private static void printRow(char[] chars) {
//        for (int col = 0; col < map.length; col++) {
//            System.out.print(chars[col] + " ");
//        }
//    }
//
//    private static void printRowNumber(int rowNumber) {
//        System.out.print((rowNumber + 1) + " ");
//    }
//
//    private static void printMapHeader() {
//        for (int col = 0; col <= SIZE; col++) {
//            System.out.print(col + " ");
//        }
//        System.out.println();
//    }
//}
