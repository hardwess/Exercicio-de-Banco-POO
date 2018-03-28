import java.util.Date;

public class Conta {

	private double saldo;
	private String numero;
	private String senha;
	private Transacao[] historico = new Transacao[10];

	public boolean efetuarSaque(double valor) {
		// to do
		boolean i = true;

		return i;
	}

	public boolean efetuarDeposito(double valor) {
		// to do
		boolean i = true;

		return i;
	}

	public boolean efetuarPagamento(String boleto, double valor) {
		// to do
		boolean i = true;

		return i;
	}

	public Transacao[] extrato(Date inicio, Date fina){
		// to do
		Transacao[] extrato = new Transacao[20];
		
		return extrato;
	}
	
	
}
