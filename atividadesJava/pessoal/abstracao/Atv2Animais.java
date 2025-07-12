package abstracao;

//Goal: Learn about protected access and constructor chaining.
//Task:
//    Create a base class Animal with:
//        Protected field String name
//        Constructor that sets the name
//        Method speak() that prints "Some animal sound"
//    Create subclasses like Dog, Cat, Bird, each overriding speak()
//    Add a constructor to each subclass that uses super(name)
//New Concept – Protected:
//protected allows subclasses to access fields from the parent class, but not unrelated classes.

abstract class Atv2Animais {
	protected String nome;
	
	// O nome do animal deve ser dado ao chamar o método
	public Atv2Animais(String nome) {
		this.nome = nome;
	}
	
	abstract public void falar();
}

class Cachorro extends Atv2Animais {
	
	public Cachorro(String nome) {
		super(nome);
	}
	@Override
	public void falar() {
		System.out.println(nome + " faz Au Au");
	}
}

class Gato extends Atv2Animais {
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void falar() {
		System.out.println(nome + " faz Miau");
	}
}