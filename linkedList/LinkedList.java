package linkedList;


public class LinkedList<E>{
	Link<E> firstLink;
	Link<E> lastLink;
	
	public LinkedList() {

	}

	public int size() {
		int count = 0;
		Link<E> aLink = this.firstLink;
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

	E getFirst() {
		if (firstLink == null) {
			return null;
		}
		return firstLink.getItem();
	}

	E getLast() {
		if (lastLink == null) {
			return null;
		}
		return lastLink.getItem();
	}

	public void addFirst(E anItem) {
		if (isEmpty()) {
			Link<E> aLink = new Link<E>(anItem);
			firstLink = aLink;
			lastLink = aLink;
		} else {
			Link<E> aLink = new Link<E>(anItem);
			aLink.setNext(firstLink);
			firstLink.setPrev(aLink);
			firstLink = aLink;
		}
	}

	public void addLast(E anItem) {

		if (isEmpty()) {
			addFirst(anItem);
		} else {
			Link<E> aLink = new Link<E>(anItem);
			aLink.setPrev(lastLink);
			lastLink.setNext(aLink);
			lastLink = aLink;
		}
	}

	E get(int index) {
		if (index < 0) {
			return null;
		}
		int count = 0;
		Link<E> current = firstLink;
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

	E removeFirst() {

		E returnItem = null;

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

	E removeLast() {

		E returnItem = null;

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
