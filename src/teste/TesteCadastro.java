package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sistema.gui.Cliente;;

class TesteCadastro {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testeSomar() {
		Cliente c = new Cliente();
		c.jtfNome.setText("Pedro");
		c.jtfEmail.setText("pedroperrera@gmail.com");
		c.jtfEndereco.setText("Rua antonio alberto");
		c.jtfTelefone.setText("43996086363");
		c.jtfCidade.setText("Jaguapita");
		c.jtfEstado.setText("PR");
		
	}
	
}