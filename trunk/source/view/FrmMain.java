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

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import model.*;
import controller.ControllerReservarCarro;
import controller.ControllerCadastrarCliente;

public class FrmMain extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar jJMenuBar = null;

	private JMenu jMenu = null;

	private JMenu jMenu1 = null;

	private JMenu jMenu2 = null;

	private JPanel jContentPanel = null;

    private JMenuItem ucReservarCarro;

    private JMenuItem Cliente;

    private JMenuItem Filial;

    private JMenuItem Carro;

    private JMenuItem Modelo;

    private JMenuItem Blacklist;

    private JMenuItem Grupo;

    private JMenuItem Reserva;

    private JMenuItem Locacoes;

    private JMenuItem Funcionario;

    private Ctrlmaintenance maintenance = new Ctrlmaintenance();


	/**
	 * Este método inicializa o jJMenuBar
	 *
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar
					.setLayout(new BoxLayout(getJJMenuBar(), BoxLayout.X_AXIS));
			jJMenuBar
					.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * Este método inicializa o jMenu
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Funções");
            jMenu.add(getJMenuItemUcReservarCarro());
		}
		return jMenu;
	}

	/**
	 * Este método inicializa o jMenu1
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Mantendo");
            jMenu1.add(getJMenuItemCliente());
            jMenu1.add(getJMenuItemFilial());
            jMenu1.add(getJMenuItemCarro());
            jMenu1.add(getJMenuItemModelo());
            jMenu1.add(getJMenuItemBlacklist());
            jMenu1.add(getJMenuItemGrupo());
            jMenu1.add(getJMenuItemReserva());
            jMenu1.add(getJMenuItemLocacoes());
            jMenu1.add(getJMenuItemFuncionario());
		}
		return jMenu1;
	}

	/**
	 * Este método inicializa o jMenu2
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Sobre");
			jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					new FrmAbout().setVisible(true);
				}
			});
		}
		return jMenu2;
	}

	/**
	 * This method initializes jContentPanel
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPanel() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
		}
		return jContentPanel;
	}


    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso ReservarCarro
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemUcReservarCarro() {
        if (ucReservarCarro == null) {
            ucReservarCarro = new JMenuItem();
            ucReservarCarro.setText("ReservarCarro");
            ucReservarCarro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerReservarCarro controllerReservarCarro = new ControllerReservarCarro();
                    controllerReservarCarro.beginCase();
                }
            });
        }
        return ucReservarCarro;
    }

    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Cliente
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemCliente() {
        if (Cliente == null) {
            Cliente = new JMenuItem();
            Cliente.setText("Cliente");
            Cliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCliente());
                }
            });
        }
        return Cliente;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Filial
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemFilial() {
        if (Filial == null) {
            Filial = new JMenuItem();
            Filial.setText("Filial");
            Filial.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFilial());
                }
            });
        }
        return Filial;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Carro
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemCarro() {
        if (Carro == null) {
            Carro = new JMenuItem();
            Carro.setText("Carro");
            Carro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCarro());
                }
            });
        }
        return Carro;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Modelo
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemModelo() {
        if (Modelo == null) {
            Modelo = new JMenuItem();
            Modelo.setText("Modelo");
            Modelo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelo());
                }
            });
        }
        return Modelo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Blacklist
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemBlacklist() {
        if (Blacklist == null) {
            Blacklist = new JMenuItem();
            Blacklist.setText("Blacklist");
            Blacklist.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umBlacklist());
                }
            });
        }
        return Blacklist;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Grupo
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemGrupo() {
        if (Grupo == null) {
            Grupo = new JMenuItem();
            Grupo.setText("Grupo");
            Grupo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umGrupo());
                }
            });
        }
        return Grupo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Reserva
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemReserva() {
        if (Reserva == null) {
            Reserva = new JMenuItem();
            Reserva.setText("Reserva");
            Reserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umReserva());
                }
            });
        }
        return Reserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Locacoes
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemLocacoes() {
        if (Locacoes == null) {
            Locacoes = new JMenuItem();
            Locacoes.setText("Locacoes");
            Locacoes.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umLocacoes());
                }
            });
        }
        return Locacoes;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Funcionario
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemFuncionario() {
        if (Funcionario == null) {
            Funcionario = new JMenuItem();
            Funcionario.setText("Funcionario");
            Funcionario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFuncionario());
                }
            });
        }
        return Funcionario;
    }

	/**
	 * This is the default constructor
	 */
	public FrmMain() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.setSize(580, 350);
		this.setContentPane(getJContentPanel());
		this.setJMenuBar(getJJMenuBar());
        this.setTitle("");
	}

}
