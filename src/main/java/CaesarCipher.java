import java.util.Scanner;

public class CaesarCipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxwz";
    public static String encoding(String text, int key) {
        text = text.toLowerCase();
        String cText = "";
        for (int i = 0; i<text.length(); i++){
            int charIndex = alphabet.indexOf(text.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText = cText + cipherChar;
        }
        return cText;
    }
    public static  String decoding(String cText, int key) {
        cText = cText.toLowerCase();
        String text = "" ;
        for (int i = 0 ; i<cText.length(); i++){
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndex - key) % 26;
            if (newIndex < 0){
                newIndex = alphabet.length() + newIndex;

            }
            char plainChar = alphabet.charAt(newIndex);
            text = text + plainChar;
        }


        return text;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your text:");
        String plain = scan.nextLine();

        System.out.println("Enter your key:");
        int key = scan.nextInt();
        String cipherText = encoding(plain, key);
        System.out.println("The encoded text is ==> " + cipherText);

        System.out.println("The decoded message ==> " + decoding(cipherText, key));


    }

}
