package AlgoritmyStructure;

import java.util.Random;

public class SecondLessonMain {
    public static void main(String[] args) {
        int sizeArray = 50;
        ClassAgeMan arr = new ClassAgeMan(sizeArray);
        boolean sorted = false;
        int key = 8;

        initialisationOfArray(sizeArray, arr);
        searchLine(sizeArray, key);
        searchBinary(sizeArray, key);
        sortedArrayPuzirek(sorted);
        sortedChoose(sizeArray, arr);

    }

    private static void sortedChoose(int sizeArray, ClassAgeMan arr) {

        for (int i = 0; i < sizeArray -1; i++) {
            int min = i;
            for (int j = i+1; j < sizeArray; j++) {
                if(ClassAgeMan.getAgeArray()[j] < ClassAgeMan.getAgeArray()[min]) min = j;
            }

            int bufff = ClassAgeMan.getAgeArray()[i];
            ClassAgeMan.getAgeArray()[i] = ClassAgeMan.getAgeArray()[min];
            ClassAgeMan.getAgeArray()[min] = bufff;
        }
        arr.print();
    }



    private static int searchBinary(int sizeArray, int key) {
        int startIndex = 0;
        int finishIndex = sizeArray -1;
        while(startIndex <= finishIndex) {
            int middleIndex = (startIndex + finishIndex)/2;

            if(ClassAgeMan.getAgeArray()[middleIndex] == key) {
                System.out.println(middleIndex);
                return middleIndex;
            }
            else if (ClassAgeMan.getAgeArray()[middleIndex] < key)
                startIndex = middleIndex + 1;
            else if (ClassAgeMan.getAgeArray()[middleIndex] > key)
                finishIndex = middleIndex - 1;
        }
        System.out.println("Элемент не найден");
        return -1;

    }

    private static void searchLine(int sizeArray, int key) {
        for (int i = 0; i < sizeArray; i++) {
            if (ClassAgeMan.getAgeArray()[i] == key) {
                System.out.println("Поиск завершен " + i);
            }
        }
    }

    private static void sortedArrayPuzirek(boolean sorted) {
        int buff;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < ClassAgeMan.getSizeArray() - 1; i++) {
                if (ClassAgeMan.getAgeArray()[i] > ClassAgeMan.getAgeArray()[i + 1]) {
                    sorted = false;
                    buff = ClassAgeMan.getAgeArray()[i];
                    ClassAgeMan.getAgeArray()[i] = ClassAgeMan.getAgeArray()[i + 1];
                    ClassAgeMan.getAgeArray()[i + 1] = buff;
                }

            }
        }
        ClassAgeMan.print();
    }

    private static void initialisationOfArray(int sizeArray, ClassAgeMan arr) {
        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            arr.into(rand.nextInt(15));
        }

        arr.print();
    }
}
