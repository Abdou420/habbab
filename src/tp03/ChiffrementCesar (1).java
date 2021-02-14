import java.util.Scanner;

public class ChiffrementCesar {

    private static short codeMajuscule = 65;
    private static short codeMinuscule = 97;
    private static short tailleAlph = 26;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la chaine a crypter");
        String phrase = sc.next();
        System.out.println("entrer votre cle");
        int c = sc.nextInt();
        System.out.println("la phrase chiffré " + chiffrement(phrase, c));
        System.out.println("Entrer la chaine a decrypter");
        phrase = sc.next();
        System.out.println("entrer votre cle");
        c = sc.nextInt();
        System.out.println("la phrase dechiffré " + dechiffrement(phrase, c));
    }

    private static String chiffrement(String ch, int n) {

        String chDecripte = "";

        for (int i = 0; i < ch.length(); i++) {
            if (ch.codePointAt(i) >= codeMajuscule &&
                    ch.codePointAt(i) <= (codeMajuscule + tailleAlph)) {

                chDecripte += (char) ((ch.codePointAt(i) - codeMajuscule + n) % tailleAlph + codeMajuscule);

            } else if (ch.codePointAt(i) >= codeMinuscule &&
                    ch.codePointAt(i) <= (codeMinuscule + tailleAlph)) {

                chDecripte += (char) ((ch.codePointAt(i) - codeMinuscule + n) % tailleAlph + codeMinuscule);
            } else {
                chDecripte += ch.charAt(i);
            }
        }
        return chDecripte;
    }
    private static String dechiffrement(String ch, int n) {

        String chDecripte = "";

        for (int i = 0; i < ch.length(); i++) {
            if (ch.codePointAt(i) >= codeMajuscule &&
                    ch.codePointAt(i) <= (codeMajuscule + tailleAlph)) {

                chDecripte += (char) ((ch.codePointAt(i) - codeMajuscule - n) % tailleAlph + codeMajuscule);

            } else if (ch.codePointAt(i) >= codeMinuscule &&
                    ch.codePointAt(i) <= (codeMinuscule + tailleAlph)) {

                chDecripte += (char) ((ch.codePointAt(i) - codeMinuscule - n) % tailleAlph + codeMinuscule);
            } else {
                chDecripte += ch.charAt(i);
            }
        }
        return chDecripte;
    }
}
