package controllingexecution;

import java.util.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) + 'a';
            System.out.print((char) c + " , " + c + " ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowels,是元音呢!");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel,有时候也是个元音!");
                    break;
                default:
                    System.out.println("consonant，辅音");
            }
        }
    }
}
