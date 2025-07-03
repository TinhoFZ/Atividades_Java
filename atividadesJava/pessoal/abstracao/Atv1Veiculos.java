package abstracao;

//Goal: Understand basic inheritance and method overriding.
//Task:
//    Create a base class Vehicle with:
//        A String name field
//        A move() method that prints "Vehicle is moving"
//    Create two subclasses:
//        Car, which overrides move() to print "Car is driving"
//        Bicycle, which overrides move() to print "Bicycle is pedaling"
//    In a main method, create a List<Vehicle> with both types, and call move() on each.
//Concept:
//This introduces inheritance and polymorphism.

abstract public class Atv1Veiculos {
	
	String nome;
	
	public abstract void mover();
}

class Carro extends Atv1Veiculos {

	@Override
	public void mover() {
		System.out.println("O carro está se movendo!");
		
	}

}

class Bicicleta extends Atv1Veiculos{

	@Override
	public void mover() {
		System.out.println("A bicicleta está se movendo!");
	}
}