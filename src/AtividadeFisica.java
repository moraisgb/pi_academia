
public abstract class AtividadeFisica {
    protected String descricao;
    
    public abstract void imprimirResumo();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
