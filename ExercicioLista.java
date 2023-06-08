import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ExercicioLista {
    public static void main(String[] args) {
        Boolean processo = true;
        List<String> lista = new ArrayList<String>();

        while (processo) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Adicione um Aluno à lista.");
            System.out.println("Informe o nome do aluno.");
            String nome = scanner.nextLine();
            System.out.println("Informe o gênero do aluno.");
            String sexo = scanner.nextLine();
            System.out.println("Informe o curso desejado.");

            String curso = scanner.nextLine();
            Aluno aluno = new Aluno();
            lista.add(aluno.valores(nome, sexo, curso));

            System.out.println(
                    "Aluno adicionado com sucesso! Para finalizar os cadastros, digite '0'. Caso queira continuar, digite '1'");
            int prosseguir = scanner.nextInt();
            if (prosseguir == 0) {
                processo = false;
            }
            scanner.close();
            Collections.sort(lista);
            System.out.println(lista);
        }
    }
}