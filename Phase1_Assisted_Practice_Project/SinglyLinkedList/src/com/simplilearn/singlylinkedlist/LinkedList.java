package com.simplilearn.singlylinkedlist;

public class LinkedList {
	Node head;

	static class Node {
		int data; // store data
		Node next; // store next node or pointer

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert nodes in linked list
	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
			// Go to next node
			currNode = currNode.next;
		}
		System.out.println();
	}

	// Method to delete a node in the LinkedList by KEY
	public static LinkedList deleteByKey(LinkedList list, int key) {
		// Store head node
		Node currNode = list.head, prev = null;
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head
			System.out.println(key + " found and deleted");
			return list;
		}
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();
		// Insert the values
		list = insert(list, 703);
		list = insert(list, 876);
		list = insert(list, 199);
		list = insert(list, 987);
		list = insert(list, 426);
		list = insert(list, 561);
		list = insert(list, 234);
		list = insert(list, 799);
		// Print the LinkedList
		printList(list);
		// Delete node with value 1
		deleteByKey(list, 1);
		// Print the LinkedList
		printList(list);
		// Delete node with value 4
		deleteByKey(list, 234);
		// Print the LinkedList
		printList(list);
		// Delete node with value 10
		deleteByKey(list, 703);
		// Print the LinkedList
		printList(list);
	}

}
