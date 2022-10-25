package linkedlist;

public interface List<E> {
	boolean isEmpty();
	int size();
	E get(int index);
	void addFirst(E anItem);
	void addLast(E anItem);
	E removeFirst();
	E removeLast();
	E getFirst();
	E getLast();

}
