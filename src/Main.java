
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Login login = new Login();
        login.acessarLogin();
        Treino treino = new Treino();
        
        String perfil = verificarPerfil();
        
        if(perfil == null) {
            verificarPerfil();
        } else if(perfil.equals("FUNCIONARIO")) {
            Funcionario funcionario = cadastrarFuncionario(login.getLogin(), login.getSenha());
            menuFuncionarios(treino);
        } else {
            Aluno aluno = cadastrarAluno(login.getLogin(), login.getSenha());
            menuAlunos(aluno);
        }
    }
    
    public static void menuFuncionarios(Treino treino) {
        
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1 - Cadastrar Treino\n"
                        + "2 - Mostrar Treino\n"
                        + "3 - Remover Treino\n"
                        + "4 - Editar Treino\n"
                        + "5 - Sair"));
         
        switch(opcao) {
            case 1:
                int modalidade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1 - Natação\n"
                        + "2 - Musculação\n"));
                if (modalidade == 1) {
                    AtividadeFisica atividadeFisica = cadastrarNatacao();
                    treino.setAtividadeFisica(atividadeFisica);
                } else{
                    AtividadeFisica atividadeFisica = cadastrarMusculacao();
                    treino.setAtividadeFisica(atividadeFisica);               
                }
                break;
            case 2: 
                if(treino.getAtividadeFisica() == null) {
                    JOptionPane.showMessageDialog(null, "Ainda não existe atividade física cadastrada");
                } else {
                    treino.getAtividadeFisica().imprimirResumo();
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Treino removido com sucesso!");
                menuFuncionarios(new Treino());
                break;
            case 4:
                menuFuncionarios(new Treino());
                break;
            case 5:
                sair();
            default:
                mostrarOpcaoInvalida();
        }
        
        menuFuncionarios(treino);
    }
    
    public static void menuAlunos(Aluno aluno) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1 - Cálculo IMC\n"
                        + "2 - Mostrar Dados do Aluno\n"
                        + "3 - Sair"));
        
        switch(opcao) {
            case 1:
                aluno.calcularImc();
                break;
            case 2:
                aluno.imprimirDados();
                break;
            case 3:
                sair();
            default:
                mostrarOpcaoInvalida();
        }
        
        menuAlunos(aluno);
    }
    
    public static Funcionario cadastrarFuncionario(String login, String senha){
        String cargo = JOptionPane.showInputDialog(null, "Informe o cargo");
        String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
        String cpf = JOptionPane.showInputDialog(null, "Informe seu cpf");
        String dataNasc = JOptionPane.showInputDialog(null, "Informe sua data de nascimento");
        String registro = JOptionPane.showInputDialog(null, "Informe o número de registro: ");
        return new Funcionario(cargo, registro, nome,cpf,dataNasc, login, senha);
    }
    
    public static Aluno cadastrarAluno(String login, String senha) {
        String matricula = JOptionPane.showInputDialog(null, "Informe o número da matrícula");
        String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
        String cpf = JOptionPane.showInputDialog(null, "Informe seu cpf");
        String dataNasc = JOptionPane.showInputDialog(null, "Informe sua data de nascimento");
        return new Aluno(matricula, nome, cpf, dataNasc, login, senha);
    }
    
    public static Natacao cadastrarNatacao(){
        int series = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de séries:"));
        float metrosPorSerie = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe os metros a ser percorridos por cada série"));
        return new Natacao(series, metrosPorSerie);
    }
    
    public static Musculacao cadastrarMusculacao(){
        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de repetições:"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso sugerido para esse treino:"));
        String exercicio = JOptionPane.showInputDialog(null, "Informe o exercício:");
        return new Musculacao(peso,exercicio,repeticoes);
    }
    public static String verificarPerfil(){
        int perfil = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: \n"
                + "1 - Aluno\n"
                + "2 - Funcionário\n"
                + "3 - Sair"));
        String descPerfil = null;
        
        switch (perfil) {
            case 1:
                descPerfil = "ALUNO";
                break;
            case 2:
                descPerfil = "FUNCIONARIO";
                break;
            case 3:
                sair();
                break;
            default:
                mostrarOpcaoInvalida();
        }
        
        return descPerfil;
    }
    
    public static void mostrarOpcaoInvalida() {
        JOptionPane.showMessageDialog(null, "Opção inválida");
    }
    
    public static void sair() {
        System.exit(0);
    }
}
