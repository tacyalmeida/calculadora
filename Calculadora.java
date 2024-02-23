package variaveis;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, resultado;
        char operador;

        System.out.println("Calculadora Simples em Java");
        System.out.println("------------------------------");
        
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        
        System.out.print("Escolha a operação (+, -, *, /): ");
        operador = scanner.next().charAt(0);
        
        switch(operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if(num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        scanner.close();
    }
}
