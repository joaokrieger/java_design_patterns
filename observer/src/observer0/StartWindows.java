package observer0;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class StartWindows extends JDialog {

	private static Random sorteio = new Random();
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	

	class JDInc extends JDialog implements Observador{

		private JLabel jl;
 		
		@Override
		public void pack() {
			setResizable(false);
			int x = sorteio.nextInt(screenSize.width -100);
			int y = sorteio.nextInt(screenSize.height-100);
			setLocation(x, y);
			
			final Incrementar inc = Incrementar.getInstancia();
			inc.anexar(this);
			
			jl = new JLabel(inc.getConta()+"");
			JButton jb = new JButton("Add");
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					inc.inc();
					jl.setText(inc.getConta()+"");
					
				}
				
			});
			

			getContentPane().add(jl, "North");
			getContentPane().add(jb, "South");
			
			super.pack();
			setVisible(true);
		}

		@Override
		public void atualizarValor(int valorA) {
			jl.setText(valorA+"");
		}
	};

	public StartWindows() {
		setResizable(false);
		setTitle("Teste");
		addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent evt) {
	                System.exit(0);
	            }
	     });
		
		JButton jb = new JButton("Abrir");
		
		ActionListener action = new ActionListener() {

			public void actionPerformed(ActionEvent arg) {

				JDInc jinc = new JDInc();
				jinc.pack();
				//new JDInc2().pack();
			}
		};
		
		jb.addActionListener(action);
		
		getContentPane().add(jb);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new StartWindows(); 
	}

	
	class JDInc2 extends JDialog {

		private JTextArea campo;

		@Override
		public void pack() {
			setPreferredSize(new Dimension(50, 300));
			setResizable(false);
			
			int x = sorteio.nextInt(screenSize.width -50);
			int y = sorteio.nextInt(screenSize.height-300);
			setLocation(x, y);

			campo = new JTextArea();
			campo.setEditable(false);
			JScrollPane scroll = new JScrollPane(campo);
			getContentPane().add(scroll);
			super.pack();
			setVisible(true);
		}
	}
}
