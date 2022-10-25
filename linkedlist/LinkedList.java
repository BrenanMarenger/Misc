package linkedlist;

public class LinkedList {
	private Link firstLink;
	private Link lastLink;

	public LinkedList() {

	}

	public int size() {
		int count = 0;
		Link aLink = this.firstLink;
		if (aLink == null) {
			return count;
		}
		count++;
		while (true) {
			if (aLink.getNext() != null) {
				aLink = aLink.getNext();
				++count;
			} else {
				break;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		if (firstLink == null && lastLink == null) {
			return true;
		} else {
			return false;
		}
	}

	String getFirst() {
		if (firstLink == null) {
			return null;
		}
		return firstLink.getItem();
	}

	String getLast() {
		if (lastLink == null) {
			return null;
		}
		return lastLink.getItem();
	}

	public void addFirst(String anItem) {
		if (isEmpty()) {
			Link aLink = new Link(anItem);
			firstLink = aLink;
			lastLink = aLink;
		} else {
			Link aLink = new Link(anItem);
			aLink.setNext(firstLink);
			firstLink.setPrev(aLink);
			firstLink = aLink;
		}
	}

	public void addLast(String anItem) {

		if (isEmpty()) {
			addFirst(anItem);
		} else {
			Link aLink = new Link(anItem);
			aLink.setPrev(lastLink);
			lastLink.setNext(aLink);
			lastLink = aLink;
		}
	}

	String get(int index) {
		if (index < 0) {
			return null;
		}
		int count = 0;
		Link current = firstLink;
		while (count < index && current != null) {
			++count;
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		if (current == null) {
			return null;
		}
		return current.getItem();
	}

	String removeFirst() {

		String returnItem = null;

		if (isEmpty()) {
			return null;
		}
		if (size() == 1) {
			returnItem = firstLink.getItem();
			firstLink = firstLink.getNext();
			lastLink = null;
			return returnItem;

		}
		returnItem = firstLink.getItem();
		firstLink = firstLink.getNext();
		firstLink.setPrev(null);
		return returnItem;
	}

	String removeLast() {

		String returnItem = null;

		if (isEmpty()) {
			return null;
		}
		if (size() == 1) {
			returnItem = lastLink.getItem();
			lastLink = lastLink.getPrev();
			firstLink = null;
			return returnItem;
		}
		returnItem = lastLink.getItem();
		lastLink = lastLink.getPrev();
		lastLink.setNext(null);
		return returnItem;

	}

}
