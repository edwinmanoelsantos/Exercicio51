

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class Edwin {

	static JPanel painel1 = new JPanel();
	static JPanel painel2 = new JPanel();
	

	static JFrame telainicial = new JFrame();
	static JFrame telacadastro = new JFrame();
	static JFrame telatelefone = new JFrame();
	static JFrame telaconsultar1 = new JFrame();
	static JFrame telaconsultar2 = new JFrame();
	
	static JLabel nome = new JLabel("NOME: ");
	static JLabel rg = new JLabel("RG :");
	static JLabel cpf = new JLabel("CPF:");
	static JLabel nascimento = new JLabel("NASCIMENTO :");
	static JLabel endereco = new JLabel("ENDEREÇO :");
	static JLabel email = new JLabel("E-MAIL :");

	static JLabel telefone_residencial = new JLabel("TELEFONE RESIDENCIAL:");
	static JLabel telefone_celular = new JLabel("TELEFONE CELULAR:");
	static JLabel telefone_comercial = new JLabel("TELEFONE COMERCIAL:");
	static JLabel telefone_de_contato = new JLabel("TELEFONE DE CONTATO:");
	static JLabel mensagem = new JLabel();

	static JTextField c_nome = new JTextField();
	static JTextField c_rg = new JTextField();
	static JTextField c_cpf = new JTextField();
	static JTextField c_nascimento = new JTextField();
	static JTextField c_endereco = new JTextField();
	static JTextField c_email = new JTextField();

	static JTextField c_telefone_residencial = new JTextField();
	static JTextField c_telefone_celular = new JTextField();
	static JTextField c_telefone_comercial = new JTextField();
	static JTextField c_telefone_de_contato = new JTextField();

	static JButton cadastrar = new JButton("CADASTRAR");
	static JButton gravar1 = new JButton("GRAVAR");
	static JButton gravar2 = new JButton("GRAVAR");
	static JButton consultar1 = new JButton("CONSULTAR");
	static JButton consultar2 = new JButton("CONSULTAR TELEFONE");
	static JButton telefone = new JButton("TELEFONE");
	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar0 = new JButton("VOLTAR");
	static JButton voltar1 = new JButton("VOLTAR");
	static JButton sair1 = new JButton("SAIR");

	static JTable tabela1;
	static JTable tabela2;

	static JScrollPane rolagem1 = new JScrollPane(tabela1);
	static JScrollPane rolagem2 = new JScrollPane(tabela2);

	static int n1 = 0;
	static int n2 = 0;
	static int id_cliente1 = 0;
	static int id_cliente2 = 0;

	static String[][] introduzir1 = new String[100][6];
	static String[][] introduzir2 = new String[100][4];
	static String[] tabela12 = new String[] { "NOME", "RG", "CPF", "NASCIMENTO", "ENDEREÇO", "EMAIL"};
	static String[] tabela22 = new String[] { "TELEFONE RESIDENCIAL", "CELULAR", "TELEFONE COMERCIAL", "TELEFONE/CONTATO"};

	static DefaultTableModel tabela13 = new DefaultTableModel(tabela12, 0);
	static DefaultTableModel tabela23 = new DefaultTableModel(tabela22, 0);

	static JMenuBar menu1 = new JMenuBar();
	static JMenuBar menu2 = new JMenuBar();
	static JMenu menu12 = new JMenu("MENU");
	static JMenu menu22 = new JMenu("MENU");
	
	static JMenuItem excluir1 = new JMenuItem("EXCLUIR");
	static JMenuItem excluir2 = new JMenuItem("EXCLUIR");
	static JMenuItem voltar2 = new JMenuItem("VOLTAR");
	static JMenuItem voltar3 = new JMenuItem("VOLTAR");
	static JMenuItem sair = new JMenuItem("SAIR");

	public static void main(String[] args) {
		Tela_Inicial();
		botoes();

	}

	static void Tela_Inicial() {

		telainicial.setTitle("Tela Inicial");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}

	static void Tela_Cadastro() {

		telacadastro.setTitle("Cadastro de Cliente");
		telacadastro.setSize(1365, 400);
		telacadastro.setLayout(null);
		telacadastro.setVisible(true);
		telacadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telacadastro.setResizable(false);

		telacadastro.add(nome).setBounds(10, 70, 50, 20);
		telacadastro.add(c_nome).setBounds(60, 60, 650, 30);
		telacadastro.add(rg).setBounds(25, 120, 50, 20);
		telacadastro.add(c_rg).setBounds(60, 110, 150, 30);
		telacadastro.add(cpf).setBounds(230, 120, 50, 20);
		telacadastro.add(c_cpf).setBounds(270, 110, 150, 30);
		telacadastro.add(nascimento).setBounds(430, 120, 100, 20);
		telacadastro.add(c_nascimento).setBounds(530, 110, 180, 30);
		telacadastro.add(endereco).setBounds(10, 170, 100, 20);
		telacadastro.add(c_endereco).setBounds(90, 160, 620, 30);
		telacadastro.add(email).setBounds(5, 220, 50, 20);
		telacadastro.add(c_email).setBounds(60, 210, 357, 30);

		telacadastro.add(consultar1).setBounds(1000, 100, 200, 40);
		telacadastro.add(telefone).setBounds(1000, 150, 200, 40);
		telacadastro.add(gravar1).setBounds(1000, 200, 200, 40);
		telacadastro.add(voltar).setBounds(1000, 260, 200, 40);

		telacadastro.add(mensagem).setBounds(30, 600, 500, 60);

	}

	static void Tela_Telefone() {
		telatelefone.setTitle("Cadastro de Telefone");
		telatelefone.setSize(1365, 400);
		telatelefone.setLayout(null);
		telatelefone.setVisible(true);
		telatelefone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telatelefone.setResizable(false);

		telatelefone.add(telefone_residencial).setBounds(10, 100, 200, 20);
		telatelefone.add(c_telefone_residencial).setBounds(160, 100, 150, 30);
		telatelefone.add(telefone_celular).setBounds(30, 150, 200, 20);
		telatelefone.add(c_telefone_celular).setBounds(160, 150, 150, 30);
		telatelefone.add(telefone_comercial).setBounds(15, 200, 200, 20);
		telatelefone.add(c_telefone_comercial).setBounds(160, 200, 150, 30);
		telatelefone.add(telefone_de_contato).setBounds(10, 250, 200, 20);
		telatelefone.add(c_telefone_de_contato).setBounds(160, 250, 150, 30);

		telatelefone.add(gravar2).setBounds(1000, 100, 200, 60);
		telatelefone.add(consultar2).setBounds(1000, 200, 200, 60);;
		telatelefone.add(voltar1).setBounds(1000, 300, 200, 60);
	}

	static void botoes() {

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				telainicial.setVisible(false);
				Tela_Cadastro();

			}
		});

		excluir1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				((DefaultTableModel) tabela1.getModel()).removeRow(tabela1.getSelectedRow());
			}
		});
		
		excluir2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				((DefaultTableModel) tabela2.getModel()).removeRow(tabela2.getSelectedRow());
			}
		});

		gravar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (id_cliente1 < 100) {

					c_nome.setEnabled(false);
					c_rg.setEnabled(false);
					c_cpf.setEnabled(false);
					c_nascimento.setEnabled(false);
					c_endereco.setEnabled(false);
					c_email.setEnabled(false);

					int gravar = JOptionPane.showConfirmDialog(null, "DESEJA GRAVAR OS DADOS DO CLIENTE?");
					if (gravar == JOptionPane.YES_OPTION) {
						introduzir1[n1][0] = c_nome.getText();
						introduzir1[n1][1] = c_rg.getText();
						introduzir1[n1][2] = c_cpf.getText();
						introduzir1[n1][3] = c_nascimento.getText();
						introduzir1[n1][4] = c_endereco.getText();
						introduzir1[n1][5] = c_email.getText();
					
						c_nome.setText("");
						c_rg.setText("");
						c_cpf.setText("");
						c_nascimento.setText("");
						c_endereco.setText("");
						c_email.setText("");

						n1++;

						id_cliente1++;

						c_nome.setEnabled(true);
						c_rg.setEnabled(true);
						c_cpf.setEnabled(true);
						c_nascimento.setEnabled(true);
						c_endereco.setEnabled(true);
						c_email.setEnabled(true);

					} else {
						c_nome.setEnabled(true);
						c_rg.setEnabled(true);
						c_cpf.setEnabled(true);
						c_nascimento.setEnabled(true);
						c_endereco.setEnabled(true);
						c_email.setEnabled(true);
					}
				} else {
					c_nome.setEnabled(false);
					c_rg.setEnabled(false);
					c_cpf.setEnabled(false);
					c_nascimento.setEnabled(false);
					c_endereco.setEnabled(false);
					c_email.setEnabled(false);
					JOptionPane.showMessageDialog(null, "O LIMITE DE CLIENTES JÁ FOI ATINGIDO!!!");
				}

			}
		});

		gravar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (id_cliente2 < 100) {
					c_telefone_residencial.setEnabled(false);
					c_telefone_celular.setEnabled(false);
					c_telefone_comercial.setEnabled(false);
					c_telefone_de_contato.setEnabled(false);

					int gravar1 = JOptionPane.showConfirmDialog(null, "DESEJA GRAVAR OS DADOS DO CLIENTE?");
					if (gravar1 == JOptionPane.YES_OPTION) {
						introduzir2[n2][0] = c_telefone_residencial.getText();
						introduzir2[n2][1] = c_telefone_celular.getText();
						introduzir2[n2][2] = c_telefone_comercial.getText();
						introduzir2[n2][3] = c_telefone_de_contato.getText();

						c_telefone_residencial.setText("");
						c_telefone_celular.setText("");
						c_telefone_comercial.setText("");
						c_telefone_de_contato.setText("");

						n2++;
						
						id_cliente2++;
						
						c_telefone_residencial.setEnabled(true);
						c_telefone_celular.setEnabled(true);
						c_telefone_comercial.setEnabled(true);
						c_telefone_de_contato.setEnabled(true);

						JOptionPane.showMessageDialog(null, "DADOS GRAVADOS COM SUCESSO !!!");
					} else {
						
						c_telefone_residencial.setEnabled(true);
						c_telefone_celular.setEnabled(true);
						c_telefone_comercial.setEnabled(true);
						c_telefone_de_contato.setEnabled(true);
						
					}
				} else {

					c_telefone_residencial.setEnabled(false);
					c_telefone_celular.setEnabled(false);
					c_telefone_comercial.setEnabled(false);
					c_telefone_de_contato.setEnabled(false);
					JOptionPane.showMessageDialog(null, "O LIMITE DE CLIENTES JÁ FOI ATINGIDO!!!");
				}

			}
		});

		consultar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				telaconsultar1.setTitle("TELA DE CADASTRO DE CLIENTES");
				telaconsultar1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				telaconsultar1.setSize(1400, 700);
				telaconsultar1.setLayout(null);
				telaconsultar1.getContentPane().setBackground(Color.white);
				telaconsultar1.setResizable(false);
				telaconsultar1.setVisible(true);
				telaconsultar1.add(painel1);

				painel1.setSize(1340, 650);
				painel1.setLocation(10, 10);
				painel1.setLayout(null);
				painel1.setBackground(Color.WHITE);

				tabela1 = new JTable() {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}

				};
				painel1.add(tabela1);
				painel1.add(rolagem1);
				painel1.add(menu1);

				menu1.setSize(45, 30);
				menu1.setLocation(0, 0);

				menu1.add(menu12);
				menu12.add(excluir1);
				menu12.add(voltar2);
				menu12.add(sair);

				tabela1.setModel(tabela13);
				tabela1.getColumnModel().getColumn(0).setPreferredWidth(200);
				tabela1.getColumnModel().getColumn(1).setPreferredWidth(120);
				tabela1.getColumnModel().getColumn(2).setPreferredWidth(130);
				tabela1.getColumnModel().getColumn(3).setPreferredWidth(100);
				tabela1.getColumnModel().getColumn(4).setPreferredWidth(300);
				tabela1.getColumnModel().getColumn(5).setPreferredWidth(250);

				rolagem1.setBounds(0, 30, 1340, 700);
				rolagem1.setViewportView(tabela1);

				String[] dados = new String[6];

				for (int n = 0; n < id_cliente1; n++) {

					for (int f = 0; f < 6; f++) {

						dados[f] = introduzir1[n][f];

					}
					tabela13.addRow(dados);

				}

				JOptionPane.showMessageDialog(null,
						"PARA EXCLUIR O CADASTRO, SELECIONE O REGISTRO, CLIQUE EM MENU, E NO BOTÃO EXCLUIR!!!");

			}
		});
		
		telefone.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Tela_Telefone();
			}

		});
		
		consultar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				telaconsultar2.setTitle("TELA DE CADASTRO DE CLIENTES");
				telaconsultar2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				telaconsultar2.setSize(1400, 700);
				telaconsultar2.setLayout(null);
				telaconsultar2.getContentPane().setBackground(Color.white);
				telaconsultar2.setResizable(false);
				telaconsultar2.setVisible(true);
				telaconsultar2.add(painel2);

				painel2.setSize(1340, 650);
				painel2.setLocation(10, 10);
				painel2.setLayout(null);
				painel2.setBackground(Color.WHITE);

				tabela2 = new JTable() {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}

				};
				painel2.add(tabela2);
				painel2.add(rolagem2);
				painel2.add(menu2);

				menu2.setSize(45, 30);
				menu2.setLocation(0, 0);

				menu2.add(menu22);
				menu22.add(excluir2);
				menu22.add(voltar3);
				menu22.add(sair);

				tabela2.setModel(tabela23);
				tabela2.getColumnModel().getColumn(0).setPreferredWidth(200);
				tabela2.getColumnModel().getColumn(1).setPreferredWidth(120);
				tabela2.getColumnModel().getColumn(2).setPreferredWidth(130);
				tabela2.getColumnModel().getColumn(3).setPreferredWidth(100);

				rolagem2.setBounds(0, 30, 1340, 700);
				rolagem2.setViewportView(tabela2);

				String[] dados = new String[4];

				for (int n = 0; n < id_cliente2; n++) {

					for (int m = 0; m < 4; m++) {

						dados[m] = introduzir2[n][m];

					}
					tabela23.addRow(dados);

				}

				JOptionPane.showMessageDialog(null,
						"PARA EXCLUIR O CADASTRO, SELECIONE O REGISTRO, CLIQUE EM MENU, E NO BOTÃO EXCLUIR!!!");

			}
		});
		

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				telacadastro.setVisible(false);
				Tela_Inicial();
			}

		});

		voltar1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				telatelefone.setVisible(false);
				Tela_Cadastro();
			}

		});

		voltar2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaconsultar1.setVisible(false);
				limparTable(tabela1);
				Tela_Cadastro();
			}

		});
		
		voltar3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaconsultar2.setVisible(false);
				limparTable(tabela2);
				Tela_Telefone();
			}

		});

		sair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		sair1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

	}
	
	static void limparTable(JTable table) {
		while (table.getModel().getRowCount() > 0) {
			((DefaultTableModel) table.getModel()).removeRow(0);
		}
	}

}
