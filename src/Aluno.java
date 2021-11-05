
import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String matricula;
    private float imc;
    private float peso;
    private float altura;
   
    Aluno (String matricula, String nome, String cpf,String dataNasc, String login, String senha){
        this.matricula = matricula;
        super.nome = nome;
        super.cpf = cpf;
        super.dataNasc = dataNasc;
        super.login = login;
        super.senha = senha;
    }

    public void calcularImc(){
        this.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o peso:")));
        this.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a altura:")));
        this.setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
        JOptionPane.showMessageDialog(null, "O valor do imc é " + this.getImc());
    }
    
    public void imprimirDados(){
        JOptionPane.showMessageDialog(null,"Matricula: " + this.getMatricula() +
        "\nNome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNasc);
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the imc
     */
    public float getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(float imc) {
        this.imc = imc;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }   
}