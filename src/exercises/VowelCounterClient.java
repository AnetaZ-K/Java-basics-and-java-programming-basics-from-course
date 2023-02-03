package exercises;

public class VowelCounterClient {
    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter("Ala ma kota");
        int result = counter.calculateVowels();
        System.out.println("result = " + result);
    }
}
