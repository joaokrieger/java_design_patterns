import java.util.ArrayList;
import java.util.List;

public class Disco {

    private List<Musica> musicas = new ArrayList<>();

    private int faixa = 0;

    public Disco(Musica musica) {
        this.musicas.add(musica);
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public Musica getFaixa() {
        return this.musicas.get(faixa);
    }

    public void proxFaixa() {
        faixa = (faixa + 1) % musicas.size();
    }

    public void voltarFaixa() {
        faixa = (faixa - 1 < 0?musicas.size()-1:faixa-1);
    }
}
