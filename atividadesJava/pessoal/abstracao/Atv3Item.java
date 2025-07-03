package abstracao;

//Goal: Practice abstraction with real-world categories.
//Task:
//    Create abstract class StoreItem with:
//        Fields: String name, double price
//        Abstract method double applyDiscount()
//    Create Book, Clothing, and Electronics subclasses, each implementing discounts differently
//    Add a method to display the final price after discount
//Reuses:
//    Abstract methods and fields
//    Applying behavior through overridden logic

abstract class Atv3Item {
	protected String nome;
	protected double preco;
	
	public Atv3Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	abstract public double aplicarDesconto();
	
	public void mostrarPreco() {
		double precoDesconto = aplicarDesconto();
		System.out.println("O preco do produto " + nome + " com desconto é: R$" + precoDesconto);
	}
}

class Livro extends Atv3Item {
	
	public Livro(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public double aplicarDesconto() {
		return preco * 0.67;
	}
}

class Roupa extends Atv3Item {
	
	public Roupa(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public double aplicarDesconto() {
		return preco * 0.67;
	}
}

class Eletronico extends Atv3Item {
	
	public Eletronico(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public double aplicarDesconto() {
		return preco * 0.67;
	}
}