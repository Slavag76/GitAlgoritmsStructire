package HashMapHome;

import java.util.*;

public class mainHashMap {
    public static void main(String[] args) {

        ProductStorage product1 = new ProductStorage("Бритва", "Phillips", 4);
        ProductStorage product2 = new ProductStorage("Пылесос", "Рубин", 7);
        ProductStorage product3 = new ProductStorage("Утюг", "Rowenta", 3);
        ProductStorage product4 = new ProductStorage("Телевизор", "Samsung", 8);
        ProductStorage product5 = new ProductStorage("Фен", "Bosch", 2);
        ProductStorage product6 = new ProductStorage("Кофемашина", "Bork", 6);
        ProductStorage product7 = new ProductStorage("Сковорода", "Tefal", 2);
        ProductStorage product8 = new ProductStorage("Принтер", "LG", 9);
        ProductStorage product9 = new ProductStorage("Наушники", "JBL", 5);
        ProductStorage product10 = new ProductStorage("Телефон", "Oppo", 10);

        HashMap<Integer, ProductStorage> storageHashMap1 = new HashMap<>();

        storageHashMap1.put(1111, product1);
        storageHashMap1.put(2222, product2);
        storageHashMap1.put(3333, product3);
        storageHashMap1.put(4444, product4);
        storageHashMap1.put(5555, product5);
        storageHashMap1.put(6666, product6);
        storageHashMap1.put(7777, product7);
        storageHashMap1.put(8888, product8);
        storageHashMap1.put(9999, product9);
        storageHashMap1.put(1212, product10);

        Set<Map.Entry<Integer, ProductStorage>> entries = storageHashMap1.entrySet();
        Iterator<Map.Entry<Integer, ProductStorage>> iterator = entries.iterator();

        int[] arrayKey = new int[] {2222, 4444, 7777};

        System.out.println("Исходная мапа \n" + storageHashMap1 + "\n" + "------------------");

        printBigger5(iterator);
        changeNumber10(storageHashMap1, arrayKey);
    }

    private static void printBigger5(Iterator<Map.Entry<Integer, ProductStorage>> iterator) {
        while (iterator.hasNext()) {
            Map.Entry<Integer, ProductStorage> next = iterator.next();
            if (next.getValue().number > 5) System.out.println(next.getKey() + " " + next.getValue().name +
                    " " + next.getValue().number);
        }
        System.out.println("--------------------");
    }

    private static void changeNumber10(HashMap<Integer, ProductStorage> hashMap, int[] arrayKey) {
        for (int i = 0; i < arrayKey.length; i++) {
            if (hashMap.containsKey(arrayKey[i]))
                hashMap.get(arrayKey[i]).number += 10;
        }
        System.out.println(hashMap);
    }

    static class ProductStorage {
        String name;
        String manufacturer;
        int number;

        public ProductStorage(String name, String manufacturer, int number) {
            this.name = name;
            this.manufacturer = manufacturer;
            this.number = number;
        }

        @Override
        public String toString() {
            return name + " " + manufacturer + " " + number + "\n";
        }
    }
}