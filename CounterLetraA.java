// 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, 
// além de informar a quantidade de vezes em que ela ocorre. 

// IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente 
// definida no código; 

import java.util.Scanner;

public class CounterLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInsira string:");
        String userText = scanner.nextLine();
        counterOfLetterA(userText);

        scanner.close();
    }

    public static void counterOfLetterA(String text) {
        int counter = 0;
        boolean exists = false;

        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'A') {
                counter++;
                exists = true;
            }
        }

        if (exists) {
            System.out.println("A letra 'a' aparece " + counter + " vezes na string.");
        } else {
            System.out.println("Não exists a letra 'a' na string.");
        }
    }
}