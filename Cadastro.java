
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

	static JPanel painel = new JPanel();

	static JFrame tela_inicial = new JFrame("Tela Inicial");
	static JFrame tela_cadastro = new JFrame("Cadastro de Cliente");
	static JFrame tela_consultar = new JFrame("Consulta de Cliente");

	static JLabel nome = new JLabel("NOME: ");
	static JLabel rg = new JLabel("RG :");
	static JLabel cpf = new JLabel("CPF :");
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
	static JButton atualizar = new JButton("ATUALIZAR");
	static JButton gravar = new JButton("GRAVAR");
	static JButton consultar = new JButton("CONSULTAR");
	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar2 = new JButton("VOLTAR");
	static JButton limpar = new JButton("LIMPAR");
	static JButton sair1 = new JButton("SAIR");

	static JTable tabela;

	static JScrollPane rolagem2 = new JScrollPane(tabela);

	static int n = 0;
	static int id_cliente = 0;

	static String[][] introduzir = new String[100][10];
	static String[] tabela1 = new String[] { "Nome", "RG", "CPF", "NASC", "ENDEREÇO", "EMAIL", "RESIDENCIAL", "CELULAR",
			"TEL COMERCIAL", "TEL DE CONTATO" };

	static DefaultTableModel tabela2 = new DefaultTableModel(tabela1, 0);

	static JMenuBar menu = new JMenuBar();

	static JMenu menu1 = new JMenu("MENU");

	static JMenuItem excluir = new JMenuItem("EXCLUIR");
	static JMenuItem cadastrar1 = new JMenuItem("CADASTRAR");
	static JMenuItem ajuda = new JMenuItem("AJUDA");
	static JMenuItem sair = new JMenuItem("SAIR");
	

	public static void main(String[] args) {
		Tela_Inicial();
		botoes();

	}

	static void Tela_Inicial() {

		tela_inicial.setTitle("Tela Inicial");
		tela_inicial.setSize(1365, 700);
		tela_inicial.setLayout(null);
		tela_inicial.setVisible(true);
		tela_inicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela_inicial.setResizable(false);
		tela_inicial.add(cadastrar).setBounds(300, 300, 300, 100);
		tela_inicial.add(sair1).setBounds(700, 300, 300, 100);

		tela_inicial.getContentPane().setBackground(Color.BLACK);
		cadastrar.setForeground(Color.BLACK);
		sair.setForeground(Color.BLACK);

	}

	static void Tela_Cadastro() {

		tela_cadastro.setTitle("Cadastro de Cliente");
		tela_cadastro.setSize(1365, 700);
		tela_cadastro.setLayout(null);
		tela_cadastro.setVisible(true);
		tela_cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela_cadastro.setResizable(false);

		tela_cadastro.add(nome).setBounds(10, 70, 50, 20);
		tela_cadastro.add(c_nome).setBounds(60, 60, 650, 30);
		nome.setForeground(Color.RED);
		tela_cadastro.add(rg).setBounds(25, 120, 50, 20);
		tela_cadastro.add(c_rg).setBounds(60, 110, 150, 30);
		rg.setForeground(Color.RED);
		tela_cadastro.add(cpf).setBounds(230, 120, 50, 20);
		tela_cadastro.add(c_cpf).setBounds(270, 110, 150, 30);
		cpf.setForeground(Color.RED);
		tela_cadastro.add(nascimento).setBounds(430, 120, 100, 20);
		tela_cadastro.add(c_nascimento).setBounds(530, 110, 180, 30);
		nascimento.setForeground(Color.RED);
		tela_cadastro.add(endereco).setBounds(10, 170, 100, 20);
		tela_cadastro.add(c_endereco).setBounds(90, 160, 620, 30);
		endereco.setForeground(Color.RED);
		tela_cadastro.add(email).setBounds(5, 220, 50, 20);
		tela_cadastro.add(c_email).setBounds(60, 210, 357, 30);
		email.setForeground(Color.RED);
		tela_cadastro.add(telefone_residencial).setBounds(10, 270, 200, 20);
		tela_cadastro.add(c_telefone_residencial).setBounds(160, 260, 150, 30);
		telefone_residencial.setForeground(Color.RED);
		tela_cadastro.add(telefone_celular).setBounds(30, 320, 200, 20);
		tela_cadastro.add(c_telefone_celular).setBounds(160, 310, 150, 30);
		telefone_comercial.setForeground(Color.RED);
		tela_cadastro.add(telefone_comercial).setBounds(15, 370, 200, 20);
		tela_cadastro.add(c_telefone_comercial).setBounds(160, 360, 150, 30);
		telefone_celular.setForeground(Color.RED);
		tela_cadastro.add(telefone_de_contato).setBounds(10, 420, 200, 20);
		tela_cadastro.add(c_telefone_de_contato).setBounds(160, 410, 150, 30);
		telefone_de_contato.setForeground(Color.RED);

		tela_cadastro.add(consultar).setBounds(1000, 100, 200, 60);
		tela_cadastro.add(atualizar).setBounds(1000, 250, 200, 60);
		tela_cadastro.add(gravar).setBounds(1000, 400, 200, 60);
		tela_cadastro.add(limpar).setBounds(1000, 500, 200, 60);
		tela_cadastro.add(voltar).setBounds(1000, 600, 200, 60);

		tela_cadastro.add(mensagem).setBounds(30, 600, 500, 60);
		tela_cadastro.getContentPane().setBackground(Color.black);

	}

	static void Gravar() {

		introduzir[n][0] = c_nome.getText();
		introduzir[n][1] = c_rg.getText();
		introduzir[n][2] = c_cpf.getText();
		introduzir[n][3] = c_nascimento.getText();
		introduzir[n][4] = c_endereco.getText();
		introduzir[n][5] = c_email.getText();
		introduzir[n][6] = c_telefone_residencial.getText();
		introduzir[n][7] = c_telefone_celular.getText();
		introduzir[n][8] = c_telefone_comercial.getText();
		introduzir[n][9] = c_telefone_de_contato.getText();

		n++;
	}

	static void exibirRegistros() {

		String[] dados = new String[10];

		for (int n = 0; n < id_cliente; n++) {

			for (int e = 0; e < 10; e++) {

				dados[e] = introduzir[n][e];

			}
			tabela2.addRow(dados);

		}
	}

	static void botoes() {

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				tela_inicial.setVisible(false);
				Tela_Cadastro();

			}
		});
		
		cadastrar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				tela_consultar.setVisible(false);
				Tela_Cadastro();

			}
		});

		excluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				((DefaultTableModel) tabela.getModel()).removeRow(tabela.getSelectedRow());
			}
		});

		gravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (id_cliente < 100) {
					Gravar();
					
					c_nome.setEnabled(false);
					c_rg.setEnabled(false);
					c_cpf.setEnabled(false);
					c_nascimento.setEnabled(false);
					c_endereco.setEnabled(false);
					c_email.setEnabled(false);
					c_telefone_residencial.setEnabled(false);
					c_telefone_celular.setEnabled(false);
					c_telefone_comercial.setEnabled(false);
					c_telefone_de_contato.setEnabled(false);
					
					JOptionPane.showMessageDialog(null,
							"DADOS GRAVADOS COM SUCESSO, PARA EFETUAR A CONSULTA, É NECESSARIO LIMPAR OS CAMPOS CLICANDO NO BOTÃO LIMPAR!!!");
				}

			}
		});

		ajuda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,
						"PARA EXCLUIR O CADASTRO, SELECIONE O REGISTRO, CLIQUE EM MENU, E NO BOTÃO EXCLUIR!!!");

			}
		});

		atualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				c_nome.setEnabled(true);
				c_rg.setEnabled(true);
				c_cpf.setEnabled(true);
				c_nascimento.setEnabled(true);
				c_endereco.setEnabled(true);
				c_email.setEnabled(true);
				c_telefone_residencial.setEnabled(true);
				c_telefone_celular.setEnabled(true);
				c_telefone_comercial.setEnabled(true);
				c_telefone_de_contato.setEnabled(true);

			}
		});

		limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				id_cliente++;
				mensagem.setText("Numero de Registros:" + id_cliente);

				c_nome.setEnabled(true);
				c_rg.setEnabled(true);
				c_cpf.setEnabled(true);
				c_nascimento.setEnabled(true);
				c_endereco.setEnabled(true);
				c_email.setEnabled(true);
				c_telefone_residencial.setEnabled(true);
				c_telefone_celular.setEnabled(true);
				c_telefone_comercial.setEnabled(true);
				c_telefone_de_contato.setEnabled(true);

				c_nome.setText("");
				c_rg.setText("");
				c_cpf.setText("");
				c_nascimento.setText("");
				c_endereco.setText("");
				c_email.setText("");

				c_telefone_residencial.setText("");
				c_telefone_celular.setText("");
				c_telefone_comercial.setText("");
				c_telefone_de_contato.setText("");

				JOptionPane.showMessageDialog(null, "CAMPOS LIMPOS!!! ");

			}
		});

		consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				tela_consultar.setTitle("TELA DE CADASTRO DE CLIENTES");
				tela_consultar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				tela_consultar.setSize(1400, 700);
				tela_consultar.setLayout(null);
				tela_consultar.getContentPane().setBackground(Color.white);
				tela_consultar.setResizable(false);
				tela_consultar.setVisible(true);
				tela_consultar.add(painel);

				painel.setSize(1340, 650);
				painel.setLocation(10, 10);
				painel.setLayout(null);
				painel.setBackground(Color.WHITE);

				tabela = new JTable() {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}

				};
				painel.add(tabela);
				painel.add(rolagem2);
				painel.add(menu);

				menu.setSize(45, 30);
				menu.setLocation(0, 0);

				menu.add(menu1);
				menu1.add(excluir);
				menu1.add(cadastrar1);
				menu1.add(ajuda);
				menu1.add(sair);

				tabela.setModel(tabela2);
				tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
				tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
				tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
				tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
				tabela.getColumnModel().getColumn(4).setPreferredWidth(300);
				tabela.getColumnModel().getColumn(5).setPreferredWidth(250);
				tabela.getColumnModel().getColumn(6).setPreferredWidth(150);
				tabela.getColumnModel().getColumn(7).setPreferredWidth(50);

				rolagem2.setBounds(0, 30, 1340, 700);
				rolagem2.setViewportView(tabela);

				exibirRegistros();
				
				JOptionPane.showMessageDialog(null, "PARA EXCLUIR O CADASTRO, SELECIONE O REGISTRO, CLIQUE EM MENU, E NO BOTÃO EXCLUIR!!!");

			}
		});

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tela_cadastro.setVisible(false);
				Tela_Inicial();
			}

		});

		voltar2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tela_consultar.setVisible(false);
				Tela_Cadastro();
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

}
