/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 06/05/2008
 * Hora da geração 09:54 AM
 * 
 * Nome Nome do Programa
 * E-mail Seu Email
 * Autor Nome do Autor
 * Versão Versão do Programa
 */
package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmAbout extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	private JLabel jLabel3 = null;

	private JLabel jLbName = null;

	private JLabel jLbAuthor = null;

	private JLabel jLbEmail = null;

	private JLabel jLbVersion = null;

	/**
	 * This is the default constructor
	 */
	public FrmAbout() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.setSize(200, 300);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {

			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.gridwidth = 3;
			gridBagConstraints6.anchor = GridBagConstraints.CENTER;
			gridBagConstraints6.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints6.gridheight = 1;
			gridBagConstraints6.ipadx = 0;
			gridBagConstraints6.insets = new Insets(6, 0, 13, 0);
			gridBagConstraints6.gridy = 0;
			jLbName = new JLabel();
            jLbName.setText("Nome do Programa");

			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 2;
			gridBagConstraints5.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints5.gridy = 4;
			jLbEmail = new JLabel();
            jLbEmail.setText("Seu Email");

			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 2;
			gridBagConstraints4.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints4.gridy = 3;
			jLbAuthor = new JLabel();
            jLbAuthor.setText("Nome do Autor");

			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.anchor = GridBagConstraints.WEST;
			gridBagConstraints3.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints3.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.gridy = 4;
			jLabel3 = new JLabel();
			jLabel3.setText("E-mail:");

			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.anchor = GridBagConstraints.WEST;
			gridBagConstraints2.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints2.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.gridy = 3;
			jLabel2 = new JLabel();
			jLabel2.setText("Autor:");

			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 2;
			gridBagConstraints1.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints1.gridy = 1;
			jLbVersion = new JLabel();
            jLbVersion.setText("Versão do Programa");

			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			gridBagConstraints.insets = new Insets(4, 7, 3, 3);
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = 1;
			jLabel1 = new JLabel();
			jLabel1.setText("Versão:");

			jContentPane = new JPanel();

			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(jLabel1, gridBagConstraints);
			jContentPane.add(jLbVersion, gridBagConstraints1);
			jContentPane.add(jLabel2, gridBagConstraints2);
			jContentPane.add(jLabel3, gridBagConstraints3);
			jContentPane.add(jLbAuthor, gridBagConstraints4);
			jContentPane.add(jLbEmail, gridBagConstraints5);
			jContentPane.add(jLbName, gridBagConstraints6);
		}
		return jContentPane;
	}

}
