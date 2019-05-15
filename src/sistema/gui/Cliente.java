package sistema.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sistema.control.ClienteControl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * A classe Cliente serve para indentificar o Cliente:
 * @author fabri
 *@see java.lang.Math
 *@since 1.0
 */
public class Cliente extends JFrame {

	public JPanel contentPane;
	public JTextField jtfNome;
	public JTextField jtfEmail;
	public JTextField jtfTelefone;
	public JTextField jtfEndereco;
	public JTextField jtfCidade;
	public JTextField jtfEstado;

	ClienteControl CliControl = new ClienteControl();
	/**
	 * Lanca a aplicacao.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Cria o frame.
	 */
	public Cliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de cliente");
		lblNewLabel.setBounds(10, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 86, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(10, 111, 71, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 136, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblNewLabel_3 = new JLabel("Estado:");
		lblNewLabel_3.setBounds(10, 159, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(66, 36, 389, 20);
		contentPane.add(jtfNome);
		jtfNome.setColumns(10);
		
		jtfEmail = new JTextField();
		jtfEmail.setBounds(66, 58, 389, 20);
		contentPane.add(jtfEmail);
		jtfEmail.setColumns(10);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setBounds(66, 86, 200, 20);
		contentPane.add(jtfTelefone);
		jtfTelefone.setColumns(10);
		
		jtfEndereco = new JTextField();
		jtfEndereco.setBounds(66, 108, 389, 20);
		contentPane.add(jtfEndereco);
		jtfEndereco.setColumns(10);
		
		jtfCidade = new JTextField();
		jtfCidade.setBounds(66, 133, 200, 20);
		contentPane.add(jtfCidade);
		jtfCidade.setColumns(10);
		
		jtfEstado = new JTextField();
		jtfEstado.setBounds(66, 156, 46, 20);
		contentPane.add(jtfEstado);
		jtfEstado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = jtfNome.getText();
				String email = jtfEmail.getText();
				String endereco = jtfEndereco.getText();
				String telefone = jtfTelefone.getText();
				String cidade = jtfCidade.getText();
				String estado = jtfEstado.getText();
				
				CliControl.InsereDados(nome,email,telefone,endereco,cidade,estado);
				
			}
			
			
		});
		btnCadastrar.setBounds(10, 184, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfNome.setText("");
				jtfEmail.setText("");
				jtfTelefone.setText("");
				jtfEndereco.setText("");
				jtfCidade.setText("");
				jtfEstado.setText("");
			}
		});
		btnLimpar.setBounds(109, 184, 89, 23);
		contentPane.add(btnLimpar);
	}
}
