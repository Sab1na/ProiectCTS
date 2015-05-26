package clase;

import java.util.ArrayList;

public class CareTaker {
	public ArrayList<Memento> memento = new ArrayList<Memento>();

	public void adaugaMemento(Memento m) {
		memento.add(m);
	}

	public Memento getMemento(int i) {
		return memento.get(i);
	}

}
