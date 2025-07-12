package abstracao;

//Goal: Introduce interfaces with abstract classes.
//Task:
//    Create an abstract class GameUnit with:
//        Abstract method void attack()
//    Create an interface Healable with:
//        Method void heal(int amount)
//    Create two classes:
//        Warrior (extends GameUnit)
//        Priest (extends GameUnit, implements Healable)
//    Demonstrate how some objects can be both GameUnit and Healable
//New Concept – Interface:
//An interface defines a contract. A class can implement multiple interfaces, unlike inheritance.

abstract class Atv4Personagem {
	String nome;
	
	public Atv4Personagem(String nome) {
		this.nome = nome;
	}
	
	abstract void atacar();	
}

/* Interface é como uma classe abstrata, mas uma classe pode implementar várias interfaces, diferente de uma classe
abstrata que so suporta uma */
interface Cura {
	default void curar(int quantidade) {
		System.out.println("Curandeiro curou " + quantidade);
	}
}

class Guerreiro extends Atv4Personagem {
	public Guerreiro (String nome) {
		super(nome);
	}
	
	@Override
	public void atacar() {
		System.out.println(nome + " ataca");
	}
}

class Curandeiro extends Atv4Personagem implements Cura {
	public Curandeiro(String nome) {
		super(nome);
	}
	
	@Override
	public void atacar() {
		System.out.println(nome + " ataca");
	}
}