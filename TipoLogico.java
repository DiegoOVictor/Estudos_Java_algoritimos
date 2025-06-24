import java.util.Scanner;

public class TipoLogico {

    public static void main(String[] args) {
        Boolean VApassou = true;
        System.out.println("Variavel verdadeira: " + VApassou);
        
        Boolean VAnaopassou = false;
        System.out.println("Variavel falsa: " + VAnaopassou);
        
        System.out.println("--------------------------------------------");
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        
        int nota = scanner.nextInt();
        
        Boolean passouNaMateria = nota >= 70;
        
        if (passouNaMateria) {
            System.out.println("O(A) aluno(a) passou na matéria.");
        } else {
            System.out.println("O(A) aluno(a) não passou na matéria.");
        }
        
        scanner.close();
    }
}
