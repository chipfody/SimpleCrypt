import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private Integer key;

    ROT13(Character cs, Character cf) {
        this.key = cf - cs;
    }

    ROT13() {
        this.key = 0;
    }

    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder crypto = new StringBuilder (  );
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (s >='a' && s <= 'm') {
                s += 13;
            } else if (s >= 'n' && s <= 'z') {
                s -= 13;
            } else if (s >= 'A' && s <= 'M') {
                s += 13;
            } else if ( s >= 'N' && s <= 'Z') {
                s -= 13;
            }
            crypto.append ( s );
        }
        return crypto.toString ();
    }

    public String encrypt(String text) {
        String result = crypt ( text );
        return result;
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        Integer rotateOn = s.indexOf ( c );

        return s.substring ( rotateOn ) + s.substring ( 0, rotateOn );
    }

}
