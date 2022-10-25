package linkedList;

public class Link<E> {
	private Link<E> next;
	private Link<E> prev;
	private E item;

	public Link(E anItem) {
		item = anItem;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public E getItem() {
		return item;
	}

	public void setNext(Link<E> next) {
		this.next = next;
	}

	public Link<E> getNext() {
		return next;
	}

	public void setPrev(Link<E> prev) {
		this.prev = prev;
	}

	public Link<E> getPrev() {
		return prev;
	}

}
