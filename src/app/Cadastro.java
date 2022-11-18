package app;

import java.util.Scanner;

public class Cadastro {
    private LDECircular<Aluno> listaAlunos;

    public Cadastro(){
        this.listaAlunos = new LDECircular<>();
    }

    public void cadastrar(Aluno alunoNovo){
        listaAlunos.inserirOrdenado(alunoNovo);
    }

    public void listar(){
        listaAlunos.exibirInfoTodos();
    }

    public Aluno consultar(String rg){
        Aluno alunoConsultar = new Aluno(rg);
        Aluno retorno = listaAlunos.busca(alunoConsultar).getInfo();
        return retorno;
    }

    public void alterarMediaFinal(String rg){
        Scanner in = new Scanner(System.in);
        Aluno consultado = this.consultar(rg);

        if(consultado != null){
            System.out.println("A média final antiga do aluno é "+consultado.getMedia());
            System.out.println(" ");
            System.out.println("Digite a nova média do aluno");
            double novaMedia = in.nextDouble(); in.nextLine();
            consultado.setMedia(novaMedia);
        }else{
            System.out.println("A matrícula procurada não existe");
        }
    }

    public void alterarFaltas(String rg){
        Scanner in = new Scanner(System.in);
        Aluno consultado = this.consultar(rg);

        if(consultado != null){
            System.out.println("O número de faltas antigo do aluno é "+consultado.getFaltas());
            System.out.println(" ");
            System.out.println("Digite o novo número de faltas");
            int novaFalta = in.nextInt(); in.nextLine();
            consultado.setFaltas(novaFalta);
        }else{
            System.out.println("A matrícula procurada não existe");
        }
    }
    public void removerAluno(String rg){
        Aluno alunoRemover = new Aluno(rg);
        listaAlunos.remover(alunoRemover);
    }

    public void exibir(String rg){
        Aluno alunoExibir = new Aluno(rg);
        listaAlunos.exibirInfo(alunoExibir);
    }

    

    
}
