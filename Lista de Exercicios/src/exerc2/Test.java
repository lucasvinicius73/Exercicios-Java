package exerc2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        Aluno[] lista = new Aluno[entrada.nextInt()];
        entrada.nextLine();
        
        System.out.println("Cadastre os alunos: ");
        for(i = 0 ; i < lista.length; i++){
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("Nota: ");
            double nota = entrada.nextDouble();
            entrada.nextLine();
            
            lista[i] = new Aluno(nome,nota);
        }
      for( Aluno aux : lista ) {
	System.out.println(aux);
      }
    }

}
