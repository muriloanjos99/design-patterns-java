package systemOne.oab;

public class oabService {

	private oabService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String estado) {
		System.out.println("Cliente salvo no sistema da OAB:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(estado);
	}
}
