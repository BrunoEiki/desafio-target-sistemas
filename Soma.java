// 3) Observe o trecho de código abaixo: 
//     int INDICE = 12, SOMA = 0, K = 1; 
//     enquanto K < INDICE faça 
//     { 
//         K = K + 1; 
//         SOMA = SOMA + K; 
//     } 
//     imprimir(SOMA); 

// Ao final do processamento, qual será o valor da variável SOMA? 

public class Soma {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("Resultado de Soma: " + soma);
    }
}