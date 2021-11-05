
import javax.swing.JOptionPane;


public class Musculacao extends AtividadeFisica{
    private float peso;
    private String exercicio;
    private int repeticoes;

    public Musculacao(float peso, String exercicio, int repeticoes) {
        this.descricao = "Treino de musculação";
        this.peso = peso;
        this.exercicio = exercicio;
        this.repeticoes = repeticoes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    @Override
    public void imprimirResumo() {
         JOptionPane.showMessageDialog(null,"Resumo da atividade: "+ "\nDescrição:"+ 
                descricao + "\nQuantidade de repetições: "+ repeticoes + 
                "\nExercicios: " + exercicio + "\nPeso indicado: " + peso + "\n\n");
    }
    
    
}
