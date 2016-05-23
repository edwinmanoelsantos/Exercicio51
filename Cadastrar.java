package novo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastrar {

	static JFrame tela = new JFrame();
	static JFrame tela_cadastro = new JFrame();
	static JFrame tela_atualizar = new JFrame();
	
	static JButton botao1 = new JButton("Cadastro");
	static JButton botao2 = new JButton("Consultar");
	static JButton botao3 = new JButton("Excluir");
	static JButton botao4 = new JButton("Atualizar");
	static JButton botao5 = new JButton("Sair");
	static JButton botao6 = new JButton("Voltar");
	static JButton botao7 = new JButton("Gravar");

	static JLabel nome = new JLabel("NOME :");
	static JLabel rg = new JLabel("RG :");
	static JLabel cpf = new JLabel("CPF :");
	static JLabel nascimento = new JLabel("NASCIMENTO :");
	static JLabel sexo = new JLabel("SEXO :");
	static JLabel email = new JLabel("E-MAIL :");
	static JLabel telefone = new JLabel("TELEFONE :");
	static JLabel celular = new JLabel("CELULAR :");
	static JLabel cep = new JLabel("CEP :");
	static JLabel endereco = new JLabel("ENDEREÇO :");
	static JLabel numero = new JLabel("NUMERO :");
	static JLabel complemento = new JLabel("COMPLEMENTO :");
	static JLabel bairro = new JLabel("BAIRRO :");
	static JLabel cidade = new JLabel("CIDADE :");
	static JLabel estado = new JLabel("ESTADO :");
	static JLabel pais = new JLabel("PAIS :");

	static JTextField c_nome = new JTextField();
	static JTextField c_rg = new JTextField();
	static JTextField c_cpf = new JTextField();
	static JTextField c_nascimento = new JTextField();
	static JTextField c_sexo = new JTextField();
	static JTextField c_email = new JTextField();
	static JTextField c_telefone = new JTextField();
	static JTextField c_celular = new JTextField();
	static JTextField c_cep = new JTextField();
	static JTextField c_endereco = new JTextField();
	static JTextField c_numero = new JTextField();
	static JTextField c_complemento = new JTextField();
	static JTextField c_bairro = new JTextField();
	static JTextField c_cidade = new JTextField();
	static JTextField c_estado = new JTextField();
	static JTextField c_pais = new JTextField();
	
	static int numero1 = 0;
	static int e = 0;
	static String introduzir [][] = new String[100][16];

	static JLabel fundo = new JLabel(new ImageIcon("imagem\\fundo.jpg"));

	static void Tela_Inicial() {
		tela.setTitle("Tela Inicial");
		tela.setSize(1300, 800);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.add(botao1);
		botao1.setBounds(50, 50, 500, 90);
		botao1.setForeground(Color.DARK_GRAY);
		botao1.setBackground(Color.LIGHT_GRAY);
		tela.add(botao2);
		botao2.setBounds(720, 50, 500, 90);
		botao2.setForeground(Color.DARK_GRAY);
		botao2.setBackground(Color.LIGHT_GRAY);
		tela.add(botao3);
		botao3.setBounds(720, 300, 500, 90);
		botao3.setForeground(Color.DARK_GRAY);
		botao3.setBackground(Color.LIGHT_GRAY);
		tela.add(botao4);
		botao4.setBounds(50, 300, 500, 90);
		botao4.setForeground(Color.DARK_GRAY);
		botao4.setBackground(Color.LIGHT_GRAY);
		tela.add(botao5);
		botao5.setBounds(400, 500, 500, 90);
		botao5.setForeground(Color.DARK_GRAY);
		botao5.setBackground(Color.LIGHT_GRAY);
		tela.add(fundo);
		fundo.setBounds(10, 800, 110, 110);
		tela.setResizable(false);
		tela.setVisible(true);
		tela.setLayout(null);

		Botoes();
	}

	static void Tela_Cadastro() {
		tela_cadastro.setTitle("Tela de Cadastro");
		tela_cadastro.setSize(1300, 800);
		tela_cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tela_cadastro.add(nome);
		nome.setBounds(10, 70, 50, 20);
		nome.setForeground(Color.RED);
		tela_cadastro.add(rg);
		rg.setBounds(25, 120, 50, 20);
		rg.setForeground(Color.RED);
		tela_cadastro.add(cpf);
		cpf.setBounds(230, 120, 50, 20);
		cpf.setForeground(Color.RED);
		tela_cadastro.add(nascimento);
		nascimento.setBounds(430, 120, 100, 20);
		nascimento.setForeground(Color.RED);
		tela_cadastro.add(sexo);
		sexo.setBounds(10, 170, 50, 20);
		sexo.setForeground(Color.RED);
		tela_cadastro.add(email);
		email.setBounds(215, 170, 50, 20);
		email.setForeground(Color.RED);
		tela_cadastro.add(telefone);
		telefone.setBounds(10, 220, 100, 20);
		telefone.setForeground(Color.RED);
		tela_cadastro.add(celular);
		celular.setBounds(300, 220, 100, 20);
		celular.setForeground(Color.RED);
		tela_cadastro.add(cep);
		cep.setBounds(10, 270, 50, 20);
		cep.setForeground(Color.RED);
		tela_cadastro.add(endereco);
		endereco.setBounds(10, 320, 100, 20);
		endereco.setForeground(Color.RED);
		tela_cadastro.add(numero);
		numero.setBounds(420, 320, 100, 20);
		numero.setForeground(Color.RED);
		tela_cadastro.add(complemento);
		complemento.setBounds(10, 370, 120, 20);
		complemento.setForeground(Color.RED);
		tela_cadastro.add(bairro);
		bairro.setBounds(10, 420, 50, 20);
		bairro.setForeground(Color.RED);
		tela_cadastro.add(cidade);
		cidade.setBounds(250, 420, 60, 20);
		cidade.setForeground(Color.RED);
		tela_cadastro.add(estado);
		estado.setBounds(10, 470, 60, 20);
		estado.setForeground(Color.RED);
		tela_cadastro.add(pais);
		pais.setBounds(260, 470, 60, 20);
		pais.setForeground(Color.RED);
		

		tela_cadastro.add(c_nome);
		c_nome.setBounds(60, 60, 650, 30);
		tela_cadastro.add(c_rg);
		c_rg.setBounds(60, 110, 150, 30);
		tela_cadastro.add(c_cpf);
		c_cpf.setBounds(270, 110, 150, 30);
		tela_cadastro.add(c_nascimento);
		c_nascimento.setBounds(530, 110, 180, 30);
		tela_cadastro.add(c_sexo);
		c_sexo.setBounds(60, 160, 150, 30);
		tela_cadastro.add(c_email);
		c_email.setBounds(270, 160, 200, 30);
		tela_cadastro.add(c_telefone);
		c_telefone.setBounds(90, 210, 200, 30);
		tela_cadastro.add(c_celular);
		c_celular.setBounds(380, 210, 200, 30);
		tela_cadastro.add(c_cep);
		c_cep.setBounds(60, 260, 150, 30);
		tela_cadastro.add(c_endereco).setBounds(90, 310, 320, 30);
		tela_cadastro.add(c_numero).setBounds(480, 310, 90, 30);
		tela_cadastro.add(c_complemento).setBounds(120, 360, 450, 30);
		tela_cadastro.add(c_bairro).setBounds(70, 410, 150, 30);
		tela_cadastro.add(c_cidade).setBounds(310, 410, 150, 30);
		tela_cadastro.add(c_estado).setBounds(70, 460, 150, 30);
		tela_cadastro.add(c_pais).setBounds(310, 460, 150, 30);

		tela_cadastro.add(botao2).setBounds(1000, 100, 200, 60);
		botao2.setForeground(Color.RED);
		botao2.setBackground(Color.BLACK);
		tela_cadastro.add(botao3).setBounds(1000, 200, 200, 60);
		botao3.setForeground(Color.RED);
		botao3.setBackground(Color.BLACK);
		tela_cadastro.add(botao4).setBounds(1000, 300, 200, 60);
		botao4.setForeground(Color.RED);
		botao4.setBackground(Color.BLACK);
		tela_cadastro.add(botao6).setBounds(1000, 600, 200, 60);
		botao6.setForeground(Color.RED);
		botao6.setBackground(Color.BLACK);
		tela_cadastro.add(botao7).setBounds(1000, 400, 200, 60);
		botao7.setForeground(Color.RED);
		botao7.setBackground(Color.BLACK);
		tela_cadastro.setResizable(false);
		

		tela_cadastro.setLayout(null);
		tela_cadastro.setVisible(true);
	}

	static void Tela_Atualizar() {
		tela_atualizar.setTitle("Tela de Atualização");
		tela_atualizar.setSize(1300, 800);
		tela_atualizar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tela_atualizar.add(nome);
		nome.setBounds(10, 70, 50, 20);
		nome.setForeground(Color.RED);
		tela_atualizar.add(rg);
		rg.setBounds(25, 120, 50, 20);
		rg.setForeground(Color.RED);
		tela_atualizar.add(cpf);
		cpf.setBounds(230, 120, 50, 20);
		cpf.setForeground(Color.RED);
		tela_atualizar.add(nascimento);
		nascimento.setBounds(430, 120, 100, 20);
		nascimento.setForeground(Color.RED);
		tela_atualizar.add(sexo);
		sexo.setBounds(10, 170, 50, 20);
		sexo.setForeground(Color.RED);
		tela_atualizar.add(email);
		email.setBounds(215, 170, 50, 20);
		email.setForeground(Color.RED);
		tela_atualizar.add(telefone);
		telefone.setBounds(10, 220, 100, 20);
		telefone.setForeground(Color.RED);
		tela_atualizar.add(celular);
		celular.setBounds(300, 220, 100, 20);
		celular.setForeground(Color.RED);
		tela_atualizar.add(cep);
		cep.setBounds(10, 270, 50, 20);
		cep.setForeground(Color.RED);
		tela_atualizar.add(endereco);
		endereco.setBounds(10, 320, 100, 20);
		endereco.setForeground(Color.RED);
		tela_atualizar.add(numero);
		numero.setBounds(420, 320, 100, 20);
		numero.setForeground(Color.RED);
		tela_atualizar.add(complemento);
		complemento.setBounds(10, 370, 120, 20);
		complemento.setForeground(Color.RED);
		tela_atualizar.add(bairro);
		bairro.setBounds(10, 420, 50, 20);
		bairro.setForeground(Color.RED);
		tela_atualizar.add(cidade);
		cidade.setBounds(250, 420, 60, 20);
		cidade.setForeground(Color.RED);
		tela_atualizar.add(estado);
		estado.setBounds(10, 470, 60, 20);
		estado.setForeground(Color.RED);
		tela_atualizar.add(pais);
		pais.setBounds(260, 470, 60, 20);
		pais.setForeground(Color.RED);
		

		tela_atualizar.add(c_nome);
		c_nome.setBounds(60, 60, 650, 30);
		tela_atualizar.add(c_rg);
		c_rg.setBounds(60, 110, 150, 30);
		tela_atualizar.add(c_cpf);
		c_cpf.setBounds(270, 110, 150, 30);
		tela_atualizar.add(c_nascimento);
		c_nascimento.setBounds(530, 110, 180, 30);
		tela_atualizar.add(c_sexo);
		c_sexo.setBounds(60, 160, 150, 30);
		tela_atualizar.add(c_email);
		c_email.setBounds(270, 160, 200, 30);
		tela_atualizar.add(c_telefone);
		c_telefone.setBounds(90, 210, 200, 30);
		tela_atualizar.add(c_celular);
		c_celular.setBounds(380, 210, 200, 30);
		tela_atualizar.add(c_cep);
		c_cep.setBounds(60, 260, 150, 30);
		tela_atualizar.add(c_endereco).setBounds(90, 310, 320, 30);
		tela_atualizar.add(c_numero).setBounds(480, 310, 90, 30);
		tela_atualizar.add(c_complemento).setBounds(120, 360, 450, 30);
		tela_atualizar.add(c_bairro).setBounds(70, 410, 150, 30);
		tela_atualizar.add(c_cidade).setBounds(310, 410, 150, 30);
		tela_atualizar.add(c_estado).setBounds(70, 460, 150, 30);
		tela_atualizar.add(c_pais).setBounds(310, 460, 150, 30);

		tela_atualizar.add(botao6).setBounds(1000, 600, 200, 60);
		botao6.setForeground(Color.RED);
		botao6.setBackground(Color.BLACK);
		tela_atualizar.add(botao7).setBounds(1000, 400, 200, 60);
		botao7.setForeground(Color.RED);
		botao7.setBackground(Color.BLACK);
		tela_atualizar.setResizable(false);
		

		tela_atualizar.setLayout(null);
		tela_atualizar.setVisible(true);
	}
	static void Botoes() {
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tela.setVisible(false);
				Tela_Cadastro();
				Gravar();

			}

		});
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tela.setVisible(false);
				Tela_Atualizar();
				Gravar();

			}

		});


		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				;

			}

		});
	
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tela_cadastro.setVisible(false);
				Tela_Inicial();

			}
		});
	
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gravar();
				Tela_Cadastro();

			}
		});
	}
	
	static void Gravar(){
		introduzir[numero1][e] = c_nome.getText();
		introduzir[numero1][e + 1] = c_rg.getText();
		introduzir[numero1][e + 2] = c_cpf.getText();
		introduzir[numero1][e + 3] = c_nascimento.getText();
		introduzir[numero1][e + 4] = c_sexo.getText();
		introduzir[numero1][e + 5] = c_email.getText();
		introduzir[numero1][e + 6] = c_telefone.getText();
		introduzir[numero1][e + 7] = c_celular.getText();
		introduzir[numero1][e + 8] = c_cep.getText();
		introduzir[numero1][e + 9] = c_endereco.getText();
		introduzir[numero1][e + 10] = c_numero.getText();
		introduzir[numero1][e + 11] = c_complemento.getText();
		introduzir[numero1][e + 12] = c_bairro.getText();
		introduzir[numero1][e + 13] = c_cidade.getText();
		introduzir[numero1][e + 14] = c_estado.getText();
		introduzir[numero1][e + 15] = c_pais.getText();
		
		numero1++;
		
	}

	public static void main(String[] args) {
		Tela_Inicial();

	}

}
