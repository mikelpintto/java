
public class TestaSacaNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		conta.saca(2000);
		System.out.println(conta.getSaldo());
	}

}
