/* Represent a list of stuff, where all the "list" work is delegated
 * to a naked recursive data structure. */

public class SList<Item> implements List61B<Item>{
	public class Node {
		public Item item;     /* Equivalent of first */
		public Node next; /* Equivalent of rest */

		public Node(Item i, Node h) {
			item = i;
			next = h;		
		}
	} 

	private Node sentinel;
	private int size; 

	/** Creates an empty list. */
	public SList() {
		size = 0;
		sentinel = new Node(null, null);
	}

	public SList(Item x) {
		size = 1;
		sentinel = new Node(null, null);
		sentinel.next = new Node(x, null);
	}

	/** Adds an item of the front. */
	@Override
	public void insertFront(Item x) {
		Node oldFrontNode = sentinel.next;
		Node newNode = new Node(x, oldFrontNode);
		sentinel.next = newNode;
		size += 1;
	}

	/** Gets the front item of the list. */
	@Override
	public Item getFront() {
		return sentinel.next.item;
	}

	/** Puts an item at the back of the list. */
	@Override
    public void insertBack(Item x) {
		size += 1;

		Node p = sentinel;

		/* Move p until it reaches the end. */
		while (p.next != null) {
			p = p.next;
		}

		p.next = new Node(x, null);
	}

	/** Returns the back node of our list. */
	private Node getBackNode() {
		Node p = sentinel;

		/* Move p until it reaches the end. */
		while (p.next != null) {
			p = p.next;
		}
		return p;
	}

	/** Returns last item */
	@Override
    public Item getBack() {
		Node back = getBackNode();
		return back.item;
	}

	/** Deletes and returns last item. */
	@Override
    public Item deleteBack() {
		Node back = getBackNode();
		if (back == sentinel) {
			return null;
		}

		Node p = sentinel;

		while (p.next != back) {
			p = p.next;
		}
		p.next = null;
		return back.item;
	}

	@Override
    public int size() {
		return size;
	}

	/** Gets the positionth item of the list. */
	@Override
    public Item get(int position) {
		if (position == 0) {
			return getFront();
		}
		Node currentNode = sentinel.next.next;
		while (position > 1 && currentNode.next != null) {
			position -= 1;
			currentNode = currentNode.next;
		}

		return currentNode.item;
	}

    /** Inserts item into given position.
      * Code from discussion #3 */
	@Override
    public void insert(Item item, int position) {
		if (sentinel.next == null || position == 0) {
			insertFront(item);
			return;
		}

		Node currentNode = sentinel.next.next;
		while (position > 1 && currentNode.next != null) {
			position -= 1;
			currentNode = currentNode.next;
		}

		Node newNode = new Node(item, currentNode.next);
		currentNode.next = newNode;
	}	

	@Override
	public void print() {
		for (Node p = sentinel.next; p != null; p = p.next) {
			System.out.print(p.item +  " ");
		}
		System.out.println();
	}

} 