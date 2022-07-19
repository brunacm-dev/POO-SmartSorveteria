public abstract class Conta {
		protected double saldo;
		protected int agencia;
		protected int numero;
		protected Cliente titular;
		

		public void imprimeConta() {
			System.out.println("---------Conta:----------");
			System.out.println("Cliente: " + this.titular.getNome());
			System.out.println("Saldo: " + this.saldo);
			System.out.println("Agencia: " + this.agencia);
			System.out.println("Numero: " + this.numero);
		}

		public void imprimeTransfSim() {
			System.out.println("-------------------");
			System.out.println("Pagamento realizado");
		}

		public void imprimeTransfNao() {
			System.out.println("-------------------");
			System.out.println("Pagamento nao realizado");
		}

		public void recebe(double valor) {
			this.saldo += valor;
		}
		
		// nao tem na sorveteria

		public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.recebe(valor);
				imprimeTransfSim();
				return true;
			} else {
				imprimeTransfNao();
				return false;
			}
		}

		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

	}



