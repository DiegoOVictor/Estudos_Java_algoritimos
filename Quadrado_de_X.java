import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu numero: ");
        
        double numero = scanner.nextDouble();
        
        double quadrado = (numero * numero);
        
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        
        scanner.close();
    }
}
