package clase;

public class Originator {
	
	public Memento saveToMemento(Produse a) {
		return new Memento(a);
	}

	public Produse restoreMemento(Memento mem) {
		return mem.getProduse();
	}

}
