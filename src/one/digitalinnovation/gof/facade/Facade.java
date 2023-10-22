package one.digitalinnovation.gof.facade;

import systemOne.oab.oabService;
import systemTwo.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		oabService.gravarCliente(nome, cep, estado);
	}
}
