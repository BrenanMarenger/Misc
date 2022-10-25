package linkedlist;

public class Link {
	private Link next;
	private Link prev;
	private String item;
	
	public Link() {
		this.item = null;
	}
	
	public Link(String item) {
		this.item = item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link getNext() {
		return next;
	}

	public void setPrev(Link prev) {
		this.prev = prev;
	}

	public Link getPrev() {
		return prev;
	}

}
