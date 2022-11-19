package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chaveMenu=0, chaveTurma;
        String matricula;
        Cadastro turma1 = new Cadastro();
        Cadastro turma2 = new Cadastro();
        Cadastro turma3 = new Cadastro();
        Cadastro turma4 = new Cadastro();

        do {
            exibirOpcoes();
            chaveTurma = in.nextInt(); in.nextLine();
            switch(chaveTurma) {
                case 1: 
                menuOpcoes();
                chaveMenu = in.nextInt(); in.nextLine();
                switch(chaveMenu) {
                    case 1:
                            System.out.println("Digite o nome do aluno: ");
                            String nome = in.next(); in.nextLine();
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.next(); in.nextLine();
                            Aluno alunoInserir = new Aluno(matricula, nome);
                            turma1.cadastrar(alunoInserir);
                            break;
                    case 2: 
                            turma1.listar();
                            break;
                    case 3:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma1.alterarMediaFinal(matricula);
                        break;
                    case 4:
                            System.out.println("Digite a matrícula: ");
                            matricula = in.nextLine();
                            turma1.alterarFaltas(matricula);
                        break;
                    case 5:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma1.exibirAluno(matricula);
                        break;
                    case 6:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma1.removerAluno(matricula);
                        break;
    
                    case 0: System.out.println("Boa noite!!!");
                            break;
                    default: System.out.println("Opção inválida!!");
    
                }
    
                        break;
                case 2: 
                menuOpcoes();
                chaveMenu = in.nextInt(); in.nextLine();
                switch(chaveMenu) {
                    case 1:
                            System.out.println("Digite o nome do aluno: ");
                            String nome = in.next(); in.nextLine();
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.next(); in.nextLine();
                            Aluno alunoInserir = new Aluno(matricula, nome);
                            turma2.cadastrar(alunoInserir);
                            break;
                    case 2: 
                            turma2.listar();
                            break;
                    case 3:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma2.alterarMediaFinal(matricula);
                        break;
                    case 4:
                            System.out.println("Digite a matrícula: ");
                            matricula = in.nextLine();
                            turma2.alterarFaltas(matricula);
                        break;
                    case 5:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma2.exibirAluno(matricula);
                        break;
                    case 6:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma2.removerAluno(matricula);
                        break;
                    case 0: System.out.println("Boa noite!!!");
                            break;
                    default: System.out.println("Opção inválida!!");
    
                }
                        break;
                    
                case 3:
                menuOpcoes();
                chaveMenu = in.nextInt(); in.nextLine();
                switch(chaveMenu) {
                    case 1:
                            System.out.println("Digite o nome do aluno: ");
                            String nome = in.next(); in.nextLine();
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.next(); in.nextLine();
                            Aluno alunoInserir = new Aluno(matricula, nome);
                            turma3.cadastrar(alunoInserir);
                            break;
                    case 2: 
                            turma3.listar();
                            break;
                    case 3:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma3.alterarMediaFinal(matricula);
                        break;
                    case 4:
                            System.out.println("Digite a matrícula: ");
                            matricula = in.nextLine();
        
                            turma3.alterarFaltas(matricula);
                        break;
                    case 5:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma3.exibirAluno(matricula);
                        break;
                    case 6:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma3.removerAluno(matricula);
                        break;
    
                    case 0: System.out.println("Boa noite!!!");
                            break;
                    default: System.out.println("Opção inválida!!");
    
                }
    

                        break;
                
                case 4:
                menuOpcoes();
                chaveMenu = in.nextInt(); in.nextLine();
                switch(chaveMenu) {
                    case 1:
                            System.out.println("Digite o nome do aluno: ");
                            String nome = in.next(); in.nextLine();
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.next(); in.nextLine();
                            Aluno alunoInserir = new Aluno(matricula, nome);
                            turma4.cadastrar(alunoInserir);
                            break;
                    case 2: 
                            turma4.listar();
                            break;
                    case 3:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma4.alterarMediaFinal(matricula);
                        break;
                    case 4:
                            System.out.println("Digite a matrícula: ");
                            matricula = in.nextLine();
        
                            turma4.alterarFaltas(matricula);
                        break;
                    case 5:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
                            turma4.exibirAluno(matricula);
                        break;
                    case 6:
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = in.nextLine();
        
                            turma4.removerAluno(matricula);
                        break;
    
                    case 0: System.out.println("Boa noite!!!");
                            break;
                    default: System.out.println("Opção inválida!!");
    
                }
    

                        break;
                case 0: System.out.println("Boa noite!!!");
                        break;
                default: System.out.println("Opção inválida!!");

        }
     } while (chaveMenu != 0);
    

    }

    public static void exibirOpcoes() {
        System.out.println("********Bem vindo à cardeneta de Maria********");
        System.out.println("Escolha uma turma!!");
        System.out.println("1 -  Operações da turma 1");
        System.out.println("2 -  Operações da turma 2");
        System.out.println("3 -  Operações da turma 3");
        System.out.println("4 -  Operações da turma 4");
        System.out.println("0 -  Bye byeee!!!!!");
        System.out.print("opção: ");
    }


    public static void menuOpcoes(){
        System.out.println("1 - Inserir aluno");
        System.out.println("2 - Listar turma");
        System.out.println("3 - Alterar a média final de um aluno");
        System.out.println("4 - Alterar a quantidade de faltas de um aluno");
        System.out.println("5 - Exibir dados de aluno");
        System.out.println("6 - Remover aluno cadastrado");
        System.out.println("0 -  Bye byeee!!!!!");
        System.out.print("opção: ");
    }

}
