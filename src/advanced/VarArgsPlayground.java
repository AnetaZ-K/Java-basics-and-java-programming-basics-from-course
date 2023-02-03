package advanced;

public class VarArgsPlayground {
    public static void main(String[] args) {
        print("Ala", "ma", "kota");

        String [] wordsToPrint = new String[5];
        wordsToPrint[0]="Ala";
        wordsToPrint[1]="ma";
        wordsToPrint[2]="kota";
        wordsToPrint[3]="kot";
        wordsToPrint[4]="ma";
        printArray(wordsToPrint);
        System.out.println("=========");

        String[] wordsExtended = new String[6]; // copy all elements from array wordsToPrint to array wordsExtended
        for (int i = 0; i < wordsToPrint.length; i++) {
            wordsExtended[i] = wordsToPrint[i];
        }
        wordsExtended[5]="Alę"; //adding last element
        printArray(wordsExtended);
        System.out.println("=======");
    }
    public static void  print (String... words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        //System.out.println(words.length);
        System.out.println("=============");
    }

    public static void  printArray(String[] words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
