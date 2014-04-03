public class Maillon<E> {

	private Maillon<E> prc;
	private Maillon<E> svt;
	private E          elt;

	public Maillon(E elt) {
		this.elt = elt;
	}

	public boolean setPrc(Maillon<E> elt) {
		if (elt != null) {
			prc = elt;
			return true;
		}

		return false;
	}


	public boolean setSvt(Maillon<E> elt) {
		if (elt != null) {
			svt = elt;
			return true;
		}

		return false;
	}

	public Maillon<E> getSvt() { return svt; }
	public Maillon<E> getPrc() { return prc; }
	public E          getElt() { return elt; }

}
