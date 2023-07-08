package singleton3;

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

@SuppressWarnings("serial")
public class StartWindows extends JDialog {

	private static Random sorteio = new Random();
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
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

				JDialog jinc = new JDialog() {
					
					@Override
					public void pack() {
						setResizable(false);
						int x = sorteio.nextInt(screenSize.width -100);
						int y = sorteio.nextInt(screenSize.height-100);
						setLocation(x, y);
						
						final Incrementar inc = Incrementar.getInstance();
						final JLabel jl = new JLabel(inc.getConta()+"");
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
				};
				jinc.pack();
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
}
