/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11749965950
 */
public abstract class EstadoPlayerMusica {
    
    protected PlayerMusica playerMusica;

    public EstadoPlayerMusica(PlayerMusica playerMusic) {
        this.playerMusica = playerMusic; 
    }
    
    public void play(){}
    public void stop(){}
    public void next(){}
    public void prev(){}
    public void ligar(){}
    public void desligar(){}
    
}
