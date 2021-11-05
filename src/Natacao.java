
import javax.swing.JOptionPane;


public class Natacao extends AtividadeFisica {
   private int series;
   private float distancia;
   private float metrosPorSerie;

    public Natacao(int series, float metrosPorSerie) {
        this.descricao = "Treino de natação";
        this.series = series;
        this.metrosPorSerie = metrosPorSerie;
        this.distancia = calcularDistancia();
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public float getDistancia() {
        return distancia;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
   
    public float getMetrosPorSerie() {
        return metrosPorSerie;
    }

    public void setMetrosPorSerie(float metrosPorSerie) {
        this.metrosPorSerie = metrosPorSerie;
    }
    
    @Override
    public void imprimirResumo() {
        JOptionPane.showMessageDialog(null,"Resumo da atividade: "+ "\nDescrição:"+ 
                descricao + "\nQuantidade de séries: "+ series + 
                "\nDistancia: " + distancia + "\n\n");
    }
    
    public float calcularDistancia(){
        return this.series*this.metrosPorSerie;
    }    
}
