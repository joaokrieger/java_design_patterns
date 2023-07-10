/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11749965950
 */
public class EstadoPlayerMusicaTocando extends EstadoPlayerMusica {

    public EstadoPlayerMusicaTocando(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void desligar() {
        playerMusica.setLigado(false);
        playerMusica.setEstado(new EstadoPlayerMusicaDesligado(playerMusica));
    }

    @Override
    public void stop() {
        playerMusica.setTocando(0);
        playerMusica.getDisco().getFaixa().parar();
        playerMusica.setEstado(new EstadoPlayerMusicaParado(playerMusica));
    }

    
    @Override
    public void play() {
        playerMusica.setTocando(2);
        playerMusica.getDisco().getFaixa().pause();
        playerMusica.setEstado(new EstadoPlayerMusicaPausado(playerMusica));
    }

    @Override
    public void next() {
        playerMusica.getDisco().getFaixa().praFrente();
    }

    @Override
    public void prev() {
        playerMusica.getDisco().getFaixa().praTras();
    }
    
    @Override
    public String toString() {
        return "Tocando "+playerMusica.getDisco().getFaixa();
    }    
}
