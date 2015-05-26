package clase;

public class Memento {
	
	private Produse produs;

	public Memento(Produse a) {
		produs = new Produse(a.getDenumire(), a.getId(), a.getCategorie(),
				a.getPret(), a.getStatusStoc(), a.getCodBare());
	}

	public Produse getProduse() {
		return produs;
	}
}
