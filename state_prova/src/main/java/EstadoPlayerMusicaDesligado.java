/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11749965950
 */
public class EstadoPlayerMusicaDesligado extends EstadoPlayerMusica {

    public EstadoPlayerMusicaDesligado(PlayerMusica playerMusic) {
        super(playerMusic);
    }

    @Override
    public void ligar() {
        playerMusica.setLigado(true);
        playerMusica.setTocando(0);
        this.playerMusica.setEstado(new EstadoPlayerMusicaParado(playerMusica));
    }    

    @Override
    public String toString() {
        return "Desligado";
    }
    
    
}
