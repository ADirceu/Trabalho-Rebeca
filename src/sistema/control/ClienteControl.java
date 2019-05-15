package sistema.control;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import sistema.conexao.conexao;

public class ClienteControl {

	public void InsereDados(String nome,String email,String endereco,String telefone,String cidade,String estado){
		conexao banco = new conexao();
		String retorno = "erro";
		try{
			
			Connection ExConn = (Connection) banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "INSERT INTO banco.cliente VALUES(null,'"+nome+"','"+telefone+"','"+email+"','"+endereco+"','"+cidade+"','"+estado+"');";
			System.out.println(sSQL);
			boolean res = stmt.execute(sSQL);
			
			JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso!":"" + "Os dados não puderam ser inseridos...");
			stmt.close();
			banco.fecharBDConn();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos...");
		}
	
	}
	
}