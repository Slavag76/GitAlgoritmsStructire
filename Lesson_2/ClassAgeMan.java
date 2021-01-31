package AlgoritmyStructure;

public class ClassAgeMan {
    private static int sizeArray;
    private static int[] ageArray;



    public ClassAgeMan(int sizeArray) {
        ageArray = new int[sizeArray];
        sizeArray = 0;
    }

    public void into(int value) {
        ageArray[sizeArray] = value;
        sizeArray++;
    }


    public static void print() {
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(ageArray[i] + " ");
        }
        System.out.println("\n");
    }

    public static int getSizeArray() {
        return sizeArray;
    }

    public static int[] getAgeArray() {
        return ageArray;
    }
}
