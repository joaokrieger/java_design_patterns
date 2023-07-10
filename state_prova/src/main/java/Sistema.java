
public class Sistema {

    public static void main(String[] args) {

        Disco d = new Disco(new Musica("TOCTOC", 15));
        d.addMusica(new Musica("Foi amor", 20));
        d.addMusica(new Musica("Louco de raiva", 10));

        PlayerMusica pm = new PlayerMusica(d);

        System.out.println(pm.getStatus());  // Desligado

        pm.play();
        System.out.println(pm.getStatus());  // Desligado

        pm.ligar();
        System.out.println(pm.getStatus());  // Parado

        pm.play();
        System.out.println(pm.getStatus());  // Tocando TOCTOC > 1

        pm.next();
        System.out.println(pm.getStatus());  // Tocando TOCTOC > 11

        pm.next();
        System.out.println(pm.getStatus());  // Tocando TOCTOC > 0

        pm.stop();
        pm.next();
        pm.play();
        System.out.println(pm.getStatus());  // Tocando Foi amor > 1

        pm.next();
        pm.prev();
        System.out.println(pm.getStatus());  // Tocando Foi amor > 1

        pm.next();
        pm.play();
        System.out.println(pm.getStatus());  // Pause Foi amor > 11

        pm.next();
        pm.play();
        System.out.println(pm.getStatus());  // Tocando Foi amor > 12

        pm.stop();
        System.out.println(pm.getStatus());  // Parado

        pm.desligar();

        pm.next();
        System.out.println(pm.getStatus()); // Desligado

        pm.stop();
        System.out.println(pm.getStatus()); // Desligado
    }

}
