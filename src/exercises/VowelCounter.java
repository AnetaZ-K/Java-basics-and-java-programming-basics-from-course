package exercises;

public class VowelCounter {
    private String text;
    public VowelCounter (String text){
        this.text = text;
    }
    public int calculateVowels(){


        int counter = 0;
        String lowerCase = text.toLowerCase();
       char[]chars = lowerCase.toCharArray();
        for (char input : chars) {
            if (input=='a'|| input=='e'|| input=='i'||input=='o'||input=='u'||input=='y'){
                counter++;
            }

        }
        return counter;
    }

}
