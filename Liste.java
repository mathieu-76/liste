public class Liste<E> {

	private Maillon<E> tete;
	private Maillon<E> queue;
	private int        nbMaillon;

	public boolean ajouter(E elt) {
		if (elt != null) {
			Maillon m = new Maillon(elt);

			if (tete == null && queue == null) {
				tete  = m;
				queue = m;
			}

			else {
				tete.setSvt(m);
				m.setPrc   (m);
				tete = m;
			}

			nbMaillon++;
			return true;
		}

		return false;
	}

	public E get(int index) throws ListeException {
		if (index >= 0 && index <= nbMaillon) {
			Maillon<E> m = queue;

			for (int i = 0; i < index; i++) {
				m = m.getSvt();
			}

			return m.getElt();
		}

		else
			throw new ListeException("Index en dehors de la liste");
	}

	public boolean estVide() {
		if (tete == null && queue == null)
			return true;

		return false;
	}

	public int getTaille() { return nbMaillon; }

}