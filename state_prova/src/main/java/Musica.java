
public class Musica {

    private int tempo = 0;
    private int total;
    private String nome;

    public Musica(String nome, int total) {
        this.total = total;
        this.nome = nome;
    }

    public void tocar() {
        tempo = (tempo + 1 > total?0:tempo+1);
    }

    public void parar() {
        tempo = 0;
    }

    public void pause() {
    }

    public void praFrente() {
        tempo = (tempo + 10>total?0:tempo + 10);
    }

    public void praTras() {
        tempo = (tempo - 10<0?0:tempo - 10);
    }

    @Override
    public String toString() {
        return nome + " > " + tempo;
    }

}
