package tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFilaPilha extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
		
	private JLabel jLabel1 = new JLabel("E-MAIL");
	private JTextField jText1 = new JTextField();
	
	private JLabel jLabel2 = new JLabel("NOME");
	private JTextField jText2 = new JTextField();
	
	private JButton jbAdd = new JButton("Add");
	private JButton jbStop = new JButton("STOP");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaFilaPilha() {
		
		setTitle("Aula Fila & Pilha");
		setSize(new Dimension(240,240));
		setResizable(false);
		setLocationRelativeTo(null);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		grid.gridwidth = 2;
		grid.insets = new Insets(5, 10, 5, 5);
		grid.anchor = GridBagConstraints.WEST;
		
		jLabel1.setPreferredSize(new Dimension(200,25));
		jPanel.add(jLabel1, grid);		
		
		jText1.setPreferredSize(new Dimension(200, 25));
		grid.gridy ++;
		jPanel.add(jText1, grid);
		
		jLabel2.setPreferredSize(new Dimension(200,25));
		grid.gridy ++;
		jPanel.add(jLabel2, grid);		
		
		jText2.setPreferredSize(new Dimension(200, 25));
		grid.gridy ++;
		jPanel.add(jText2, grid);
		
		grid.gridwidth = 1;
		
		jbAdd.setPreferredSize(new Dimension(80, 30));
		grid.gridy ++;
		jPanel.add(jbAdd, grid);
		
		jbStop.setPreferredSize(new Dimension(80, 30));
		grid.gridx ++;
		jPanel.add(jbStop, grid);
		
		jbAdd.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				objFilaThread filaThread = new objFilaThread();
				filaThread.setEmail(jText1.getText());
				filaThread.setNome(jText2.getText());
				
				fila.add(filaThread);
			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}

}
