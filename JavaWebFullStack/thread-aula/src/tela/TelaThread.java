package tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel lbNFCe = new JLabel("Enviando NFC-e...");
	private JTextField tfNFCe = new JTextField();
	
	private JLabel lbEmail = new JLabel("Enviando Email...");
	private JTextField tfEmail = new JTextField();
	
	private JButton jbStart = new JButton("START");
	private JButton jbStop = new JButton("STOP");
	
	private Thread exeNFCe;
	private Thread exeEmail;

	public TelaThread() {
		
		setTitle("Aula Thread com Time");
		setSize(new Dimension(240,240));
		setResizable(false);
		setLocationRelativeTo(null);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		grid.gridwidth = 2;
		grid.insets = new Insets(5, 10, 5, 5);
		grid.anchor = GridBagConstraints.WEST;
		
		lbNFCe.setPreferredSize(new Dimension(200,25));
		jPanel.add(lbNFCe, grid);		
		
		tfNFCe.setPreferredSize(new Dimension(200, 25));
		tfNFCe.setEditable(false);
		grid.gridy ++;
		jPanel.add(tfNFCe, grid);
		
		lbEmail.setPreferredSize(new Dimension(200,25));
		grid.gridy ++;
		jPanel.add(lbEmail, grid);		
		
		tfEmail.setPreferredSize(new Dimension(200, 25));
		tfEmail.setEditable(false);
		grid.gridy ++;
		jPanel.add(tfEmail, grid);
		
		grid.gridwidth = 1;
		
		jbStart.setPreferredSize(new Dimension(80, 30));
		grid.gridy ++;
		jPanel.add(jbStart, grid);
		
		jbStop.setPreferredSize(new Dimension(80, 30));
		grid.gridx ++;
		jbStop.setEnabled(false);
		jPanel.add(jbStop, grid);
		
		jbStart.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				exeNFCe = new Thread(nfce);
				exeNFCe.start();
				
				exeEmail = new Thread(email);
				exeEmail.start();
				
				jbStart.setEnabled(false);
				jbStop.setEnabled(true);
			}
		});
		
		jbStop.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				exeNFCe.stop();
				exeEmail.stop();
				
				jbStart.setEnabled(true);
				jbStop.setEnabled(false);
			}
		});
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
	private Runnable nfce = new Runnable() {	
		@Override
		public void run() {
			while(true) {
				tfNFCe.setText(
					new SimpleDateFormat("dd/MM/yy hh:mm:ss").format(Calendar.getInstance().getTime())
				);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	
	private Runnable email = new Runnable() {		
		@Override
		public void run() {
			while(true) {
				tfEmail.setText(
					new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime())
				);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

}