
import javax.swing.JOptionPane;


public class Pessoa {
   protected String nome;
   protected String dataNasc;
   private String endereco;
   private String telefone;
   protected String cpf;
   protected String senha;
   protected String login;
   
   Pessoa(){
   }
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return dataNasc;
    }

    public void setDatanasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getSenha() {
        return senha;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
