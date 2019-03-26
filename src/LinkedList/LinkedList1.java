package LinkedList;

class Node {
	private int data;
	private Node node;

	public Node() {
	}

	public Node(int data, Node next) {
		this.data = data;
		this.node = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}

class LinkedListClass {
	private Node head;

	public void addData(int data) {
		Node n = new Node();
		n.setData(data);
		n.setNode(null);
		if (head == null) {
			head = n;
		} else {
			Node n1 = head;
			while (n1.getNode() != null) {
				n1 = n1.getNode();
			}
			n1.setNode(n);
		}
	}

	public void showData() {
		Node n = head;
		while (n.getNode() != null) {
			System.out.print(n.getData() + "--->");
			n = n.getNode();
		}
		System.out.print(n.getData() + "--->NULL");
	}

	public void addAtStart(int data) {
		Node n = new Node();
		n.setData(data);
		n.setNode(null);
		n.setNode(head);
		head = n;
	}

	public void insetAt(int index, int data) {
		Node n = new Node();
		n.setData(data);
		n.setNode(null);
		if (index == 0) { // to check weather it is 0 position or other
			addAtStart(data);
		} else {
			Node n1 = head;
			for (int i = 0; i < index - 1; i++) {// remember index-1
				n1 = n1.getNode();
			}
			n.setNode(n1.getNode());
			n1.setNode(n);
		}
	}

	public void delete(int index) {
		if (index == 0) {
			head = head.getNode();
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNode();
			}
			Node n1 = n.getNode();
			n.setNode(n1.getNode());
		}
	}

}

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedListClass linkedlist = new LinkedListClass();
		linkedlist.addData(10);
		linkedlist.addData(20);
		linkedlist.addData(30);
		linkedlist.showData();
		System.out.println();
		linkedlist.addAtStart(40);
		linkedlist.insetAt(1, 100);
		linkedlist.delete(1);
		linkedlist.showData();
	}
}
