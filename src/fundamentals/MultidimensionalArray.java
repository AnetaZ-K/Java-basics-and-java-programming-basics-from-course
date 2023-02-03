package fundamentals;

public class MultidimensionalArray {
    public static void main(String[] args) {
        String[][] strings = new String[2][];
        strings[0] = new String[]{"Ala"};
        strings[1] = new String[]{"ma","kota"};

        String value = strings [1][0];
        System.out.println(value);

        System.out.println(strings [1][0]);

        System.out.println("====================");

        for (int i = 0; i < strings.length; i++) {
            String[] innerArray = strings [i];
            for (int j = 0; j < innerArray.length; j++) {
                String item = innerArray[j];
                System.out.println(item);
            }
        }
        System.out.println("==========================");

        for (String[]innerArray: strings){
            for (String item: innerArray){
                System.out.println(item);
            }
        }

    }
}
