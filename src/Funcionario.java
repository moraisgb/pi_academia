public class Funcionario extends Pessoa {
    private String cargo;
    private String registro;

    public Funcionario(String cargo, String registro, String nome,String cpf, String dataNasc, String login, String senha) {
        this.cargo = cargo;
        this.registro = registro;
        super.nome = nome;
        super.cpf = cpf;
        super.dataNasc = dataNasc;
        super.login = login;
        super.senha = senha;
    }
   
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
 
    public void mostrarFuncionario(){    
    }
}
