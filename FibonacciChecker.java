// 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
//         ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

// IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();
        
        if (isInFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean isInFibonacci(int number) {
        if (number < 0) {
            return false;
        }
        
        int a = 0;
        int b = 1;
        
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == number;
    }
}