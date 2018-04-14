package cornhack.util;

public class Queue<T> {

	private Node<T> head;
	private Node<T> tail;

	public void push(T elem) {
		tail.attachNext(new Node<T>(elem));
	}

	public T peek() {
		return head.getData();
	}

	public T next() {
		Node<T> result = head;
		head.detatch();
		return result.getData();
	}
}

class Node<T> {
	private Node<T> prev;
	private Node<T> next;
	private T data;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void detatch() {
		prev = null;
		next = null;
	}

	public Node<T> attachPrev(Node<T> prev) {
		Node<T> curr = this.prev;
		this.prev = prev;
		if (prev != null && prev.next != this)
			prev.attachNext(this);
		return curr;
	}

	public Node<T> attachNext(Node<T> next) {
		Node<T> curr = this.next;
		this.next = next;
		if (next != null && next.prev != this)
			next.attachPrev(this);
		return curr;
	}
}