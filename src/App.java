import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("testando JDK java no vscode xD");
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("João", "123.456.789-00", 20));
        listaAlunos.add(new Aluno("Maria", "987.654.321-00", 21));
        listaAlunos.add(new Aluno("José", "654.321.987-00", 22));
        Aluno aluno1 = new Aluno("Willian", "321.987.654-00", 23);

        listaAlunos.add(aluno1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        for (Aluno buscaAluno : listaAlunos) {
            String aux = buscaAluno.buscaCpfPorNome(nome);
            if ( aux != null) {
                System.out.println("CPF: " + aux);
            }
                

            }

        System.out.println(listaAlunos.isEmpty()); 
        System.out.println(listaAlunos.indexOf(aluno1));
      //  System.out.println(listaAlunos.get(3));
        System.out.println(listaAlunos.size());
        System.out.println(listaAlunos.contains(aluno1));
      //  listaAlunos.remove(0);
      // listaAlunos.iterator(); (Perguntar para Leandro)    
    
     
    
    
    }
}
