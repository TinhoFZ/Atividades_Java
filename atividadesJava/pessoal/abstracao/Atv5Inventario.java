package abstracao;

//1. Create an abstract class Item:
//    Field: String name
//    Constructor that sets the name
//    Method: describe() (abstract)
//2. Create an interface Usable:
//    Method: void use()
//3. Create three classes:
//    Potion – extends Item, implements Usable
//        describe() should print: "Potion: [name] - restores health"
//        use() should print: "You drink the potion and feel better!"
//    Sword – extends Item, implements Usable
//        describe() should print: "Sword: [name] - sharp and deadly"
//        use() should print: "You swing the sword mightily!"
//    Scroll – extends Item, does not implement Usable
//        describe() should print: "Scroll: [name] - contains ancient wisdom"
//4. In main, do the following:
//    Create a List<Item> and add at least one of each item type
//    Loop through the list:
//        Call describe() for all items
//        If the item is Usable, cast and call use()
        
abstract class Atv5Itens {
	String nome;
	
	public Atv5Itens(String nome) {
		this.nome = nome;
	}
	
	abstract public void descrever();
}

interface Usavel {
	public void usar();
}

class Pocao extends Atv5Itens implements Usavel {
	
	public Pocao (String nome) {
		super(nome);
	}
	
	public void descrever() {
		System.out.println(nome + " vai recupera sua vida");
	}
	
	public void usar() {
		System.out.println("Você bebe a poção mas não sente nada...");
	}
}

class Espada extends Atv5Itens implements Usavel {
	
	public Espada(String nome) {
		super(nome);
	}
	
	public void descrever() {
		System.out.println(nome + " parece algo bem afiado");
	}
	
	public void usar() {
		System.out.println("Você ataca com " + nome + "!");
	}
}

class Pergaminho extends Atv5Itens {
	
	public Pergaminho(String nome) {
		super(nome);
	}
	
	public void descrever() {
		System.out.println(nome + " parece conter algum tipo de conhecimento");
	}
}