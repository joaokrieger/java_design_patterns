package observer3.dispositivos;

import javax.swing.JFrame;
import javax.swing.JLabel;

import observer3.observer.Observador;

public class DispositivoWindow extends JFrame implements Observador{

	private static final long serialVersionUID = 1L;

	private JLabel jlTemp;
	private JLabel jlUmidade;

	public DispositivoWindow(){
	
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jlTemp = new JLabel("Temp:");
		getContentPane().add(jlTemp, "North");
		
		jlUmidade = new JLabel("Umidade:");
		getContentPane().add(jlUmidade, "South");
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void atualizandoTemperatura(double temperatura) {
		this.jlTemp.setText(temperatura+"");
		
	}

	@Override
	public void atualizandoUmidade(double umidade) {
		this.jlUmidade.setText(umidade+"");
	}

}
