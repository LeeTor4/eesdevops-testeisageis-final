package com.agiletesting.app;

import com.agiletesting.model.CartaoDeViagem;
import com.agiletesting.model.ContaBancaria;
import com.agiletesting.model.Estacao;
import com.agiletesting.model.InterfaceZona;
import com.agiletesting.model.Usuario;
import com.agiletesting.model.SISTEMA_DE_TREM;
import com.agiletesting.model.ZONA_A;

public class Main {

	public static void main(String[] args) {
		
		CartaoDeViagem cartaoDeViagem = new CartaoDeViagem("123");
		ContaBancaria contaBancaria = new ContaBancaria(50.0);
		Usuario usu = new Usuario("Jose", cartaoDeViagem , contaBancaria);
		
		Estacao estacao =  new Estacao("123");
		
		System.out.println(estacao.entrar(usu));
		
		Double saldo = 500.0;
//		for(ZONA_A z : ZONA_A.values()){
//			//System.out.println(z + " => " + z.getValor() );
//			 System.out.println(z +" => " + Enum.valueOf(ZONA_A.class, z.toString()).getValor());
//		}
//		
//		saldo -= Enum.valueOf(ZONA_A.class, "TF_UNICA").getValor();
//        System.out.println("Saldo final " + saldo);
		
		InterfaceZona zona = SISTEMA_DE_TREM.ZONA_A;
		//estacao.calcularTarifaDaViagemZona(zona, "TF_UNICA", usu);
		System.out.println("Saldo : " + estacao.calcularTarifaDaViagemZona(zona, "TF_DIARIA", usu));

	}

}
