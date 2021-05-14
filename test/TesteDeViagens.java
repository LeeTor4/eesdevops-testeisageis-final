
import static org.junit.Assert.*;

import org.junit.Test;

import com.agiletesting.model.CartaoDeViagem;
import com.agiletesting.model.ContaBancaria;
import com.agiletesting.model.Estacao;
import com.agiletesting.model.InterfaceZona;
import com.agiletesting.model.SISTEMA_DE_TREM;
import com.agiletesting.model.Usuario;

public class TesteDeViagens {
	
	@Test
	public void testaAcessoEstacao() {
		
		CartaoDeViagem cartaoDeViagem = new CartaoDeViagem("123");
		ContaBancaria contaBancaria = new ContaBancaria(50.0);
		Usuario usu = new Usuario("Jose", cartaoDeViagem , contaBancaria);
		
		Estacao estacao =  new Estacao("123");
		
		
		InterfaceZona zona = SISTEMA_DE_TREM.ZONA_A;
		
		if(estacao.entrar(usu)) {
		   assertEquals(20.0, estacao.calcularTarifaDaViagemZona(zona, "TF_SEMANAL", usu), 0.0001);
		}
		
	}

}
