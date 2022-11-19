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
        listaAlunos.exibir();
    }

    public Aluno consultar(String rg){
        Aluno procurado = new Aluno(rg);
        return listaAlunos.busca(procurado).getInfo();

    }

    public void alterarMediaFinal(String rg){
        Scanner in = new Scanner(System.in);
        Aluno procurado = this.consultar(rg);

        if(procurado == null){
            System.out.println("A matrícula não existe no cadastro.");
        }else{
            System.out.println(procurado);
            System.out.println("Informe a nova media: ");
            double novaMedia = in.nextDouble(); in.nextLine();
            procurado.setMediaFinal(novaMedia);
        }
    }

    public void alterarFaltas(String rg){
        Scanner in = new Scanner(System.in);
        int chave;
        double faltas, novasFaltas;
        Aluno procurado = this.consultar(rg);

        if(procurado == null){
            System.out.println("A matrícula não existe no cadastro.");
        }else{
            System.out.println(procurado);
            System.out.println("Escolha abaixo o que voce deseja fazer com as faltas do aluno: ");
            System.out.println("1 - Para acrescentar faltas;");
            System.out.println("2 - Para abonar faltas.");
            System.out.println("");
            System.out.print("Escolha: ");
            chave = in.nextInt(); in.nextLine();
            novasFaltas = procurado.getQuantidadeFaltas();

            while(chave != 0){
                switch (chave) {
                    case 1:
                        System.out.println("Informe a quantidade de faltas a serem acrescidas: ");
                        faltas = in.nextDouble(); in.nextLine();
                        novasFaltas += faltas;
                        procurado.setMediaFinal(novasFaltas);
                        chave = 0;
                        break;
                    case 2:
                        System.out.println("Informe a quantidade de faltas a serem abonadas: ");
                        faltas = in.nextDouble(); in.nextLine();
                        novasFaltas -= faltas;
                        if(novasFaltas>=0){
                            procurado.setMediaFinal(novasFaltas);
                            chave = 0;
                        }else{
                            System.out.println("Um aluno não deveria ter uma quantidade de faltas negativas");
                            System.out.println("Tente novamente.");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }


    public void removerAluno(String rg){
        Aluno procurado = this.consultar(rg);

        if(procurado == null){
            System.out.println("Matrícula não existe no cadastro.");
        }else{
            Aluno alunoRemover = new Aluno(rg);
            listaAlunos.remover(alunoRemover);
        }

    }

    public void exibirAluno(String rg){
        Aluno procurado = this.consultar(rg);

        if(procurado == null){
            System.out.println("Matrícula não existe no cadastro.");
        }else{
            System.out.println(procurado);
        }
    }

    

    
}
