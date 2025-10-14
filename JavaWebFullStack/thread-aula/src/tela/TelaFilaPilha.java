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
	
	private JButton jbStart = new JButton("Start");
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
		
		
		
		jbStart.setPreferredSize(new Dimension(80, 30));
		grid.gridy ++;
		jPanel.add(jbStart, grid);
		
		jbStop.setPreferredSize(new Dimension(80, 30));
		grid.gridy ++;
		jPanel.add(jbStop, grid);
		
		jbStart.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 1; qtd <= 100; qtd++) {
					objFilaThread filaThread = new objFilaThread();
					filaThread.setEmail("Enviando arquivo para o email");
					if(qtd == 1) {
						filaThread.setNome(qtd + " Arquivo enviado ... ");
					} else {
						filaThread.setNome(qtd + " Arquivos enviados ... ");
					}
					
					
					fila.add(filaThread);
				}
			}
		});
		
		jbStop.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}

}
