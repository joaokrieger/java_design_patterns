/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11749965950
 */
public class EstadoPlayerMusicaPausado extends EstadoPlayerMusica {

    public EstadoPlayerMusicaPausado(PlayerMusica playerMusica) {
        super(playerMusica);
    }

    @Override
    public void stop() {
        playerMusica.setTocando(0);
        playerMusica.getDisco().getFaixa().parar();
        this.playerMusica.setEstado(new EstadoPlayerMusicaParado(playerMusica));
    }

    @Override
    public void play() {
        playerMusica.setTocando(1);
        playerMusica.getDisco().getFaixa().tocar();
        this.playerMusica.setEstado(new EstadoPlayerMusicaTocando(playerMusica));
    }
    
    @Override
    public void desligar() {
        this.playerMusica.setEstado(new EstadoPlayerMusicaDesligado(playerMusica));
    } 

    @Override
    public String toString() {
        return "Pausado "+playerMusica.getDisco().getFaixa();
    }
   
}
