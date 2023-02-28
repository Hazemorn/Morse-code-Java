import java.util.Scanner;

class main{
    static final char[] english_letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                                ',', '.', '?' };

    static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
    public static void main (String [] args){
            System.out.println("   Welcome to Morse Coder/Decoder\nPlease enter what you like translate");
            System.out.println("====================================");

            Scanner input = new Scanner(System.in);
            String input_conv = input.nextLine();
            input.close();
            System.out.println();

            char [] input_chars =input_conv.toCharArray();
            if (input_chars[0] == '.' || input_chars[0] =='-'){
                System.out.println(MorseToEng(input_conv));
            }else{
                System.out.println(engToMorse(input_conv));
            }
            

    }
    public static String engToMorse(String s){
        s = s.toLowerCase();
        char [] input_chars =s.toCharArray();
        String result_morse = "";
        for(int i = 0; i< input_chars.length; i++){
            for(int j =0; j< english_letter.length; j++){
                if (english_letter[j] == input_chars[i]){
                    result_morse = result_morse + morse[j]+ " ";
                    break; 
                }
            }

        }
        return result_morse;
    }

    public static String MorseToEng(String s){
        String [] letters = s.split(" ");
        String result_eng ="";
        for(int i = 0; i< letters.length; i++){
            for(int j = 0; j< morse.length; j++){
                if(morse[j].equals(letters[i])){
                    result_eng = result_eng + english_letter[j];
                    break;
                }
            }
        }
        return result_eng;
    }

}