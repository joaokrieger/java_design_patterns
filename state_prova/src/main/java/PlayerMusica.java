

public class PlayerMusica {

    private int tocando; // 0-stop 1-tocando 2-pause
    private Disco disco;
    private boolean ligado;
    public EstadoPlayerMusica estadoPlayerMusica;

    public void setEstado(EstadoPlayerMusica estado) {
        this.estadoPlayerMusica = estado;
    }
    
    public PlayerMusica(Disco disco) {
        this.disco = disco;
        this.tocando = 0;
        this.estadoPlayerMusica = new EstadoPlayerMusicaDesligado(this);
    }

    public void play()  {
        this.estadoPlayerMusica.play();
    }

    public void stop()  {
        this.estadoPlayerMusica.stop();
    }

    public void next() {
        this.estadoPlayerMusica.next();

    }

    public void prev() {
        this.estadoPlayerMusica.prev();
    }

    public void ligar() {
        this.estadoPlayerMusica.ligar();
    }

    public void desligar() {
        this.estadoPlayerMusica.desligar();
    }

    public String getStatus() {
        return this.estadoPlayerMusica.toString();
    }

    public Disco getDisco() {
        return disco;
    }

    public int getTocando() {
        return tocando;
    }
    
    public boolean getLigado() {
        return ligado;
    }

    void setTocando(int i) {
        this.tocando = i;
    }

    void setLigado(boolean b) {
        this.ligado = false;
    }
}
