import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ExercicioLista {
    public static void main(String[] args) {
        Boolean processo = true;
        List<String> listaM = new ArrayList<String>();
        List<String> listaF = new ArrayList<String>();

        while (processo) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Adicione um Aluno à lista.");
            System.out.println("Informe o nome do aluno.");
            String nome = scanner.nextLine();
            System.out.println("Informe o gênero do aluno. (M para masculino e F para feminino)");
            String sexo = scanner.nextLine();
            System.out.println("Informe o curso desejado.");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno();

            if (sexo.equalsIgnoreCase("m")) {
                listaM.add(aluno.valores(nome, sexo, curso));
            }

            else if (sexo.equalsIgnoreCase("f")) {
                listaF.add(aluno.valores(nome, sexo, curso));
            }

            System.out.println(
                    "Aluno adicionado com sucesso! Para finalizar os cadastros, digite '0'. Caso queira continuar, digite '1'");
            int prosseguir = scanner.nextInt();
            if (prosseguir == 0) {
                processo = false;
            }

            Collections.sort(listaM);
            System.out.println(listaM);
            Collections.sort(listaF);
            System.out.println(listaF);

        }
    }
}