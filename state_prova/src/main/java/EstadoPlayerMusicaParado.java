/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11749965950
 */
public class EstadoPlayerMusicaParado extends EstadoPlayerMusica {

    public EstadoPlayerMusicaParado(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void play() {
        playerMusica.setTocando(1);
        playerMusica.getDisco().getFaixa().tocar();
        playerMusica.setEstado(new EstadoPlayerMusicaTocando(playerMusica));
    }

    @Override
    public void desligar() {
        playerMusica.setLigado(false);
        playerMusica.setEstado(new EstadoPlayerMusicaDesligado(playerMusica));
    }

    @Override
    public void next() {
        playerMusica.getDisco().proxFaixa();
    }

    @Override
    public void prev() {
        playerMusica.getDisco().voltarFaixa();
    }
    
    @Override
    public String toString() {
        return "Parado";
    }
    
    
}
