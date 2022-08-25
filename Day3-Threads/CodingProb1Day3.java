package com.learn;

public class CodingProb1Day3 {

	class LinkedList {
		Node head;
		Node tail;
		int size;

		class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}
		}

		public void addFirst(int val) {
			Node node = new Node(val);
			node.next = head;
			head = node;
			size++;
		}

		public void addLast(int val) {
			Node temp = new Node(val);
			temp.next = null;

			if (size == 0) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		public int size() {
			return size++;
		}

		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.print("NULL");
			System.out.println();
		}
	}

	private static int addLinkedListElements(LinkedList.Node list1Node, int list1PlaceVal, LinkedList.Node list2Node,
			int list2PlaceVal, LinkedList resultList) {
		if (list1Node == null && list2Node == null) {
			return 0;
		}

		int data = 0;
		if (list1PlaceVal > list2PlaceVal) {
			int oldCarry = addLinkedListElements(list1Node.next, list1PlaceVal - 1, list2Node, list2PlaceVal,
					resultList);
			data = list1Node.data + oldCarry;
		} else if (list1PlaceVal < list2PlaceVal) {
			int oldCarry = addLinkedListElements(list1Node, list1PlaceVal, list2Node.next, list2PlaceVal - 1,
					resultList);
			data = list2Node.data + oldCarry;
		} else {
			int oldCarry = addLinkedListElements(list1Node.next, list1PlaceVal - 1, list2Node.next, list2PlaceVal - 1,
					resultList);
			data = list1Node.data + list2Node.data + oldCarry;
		}
		int newdata = data % 10;
		int newCarry = data / 10;

		resultList.addFirst(newdata);
		return newCarry;
	}

	private static LinkedList addLinkedLists(LinkedList list1, LinkedList list2) {
		CodingProb1Day3 add = new CodingProb1Day3();
		CodingProb1Day3.LinkedList result = add.new LinkedList();

		int oldcarry = addLinkedListElements(list1.head, list1.size(), list2.head, list2.size(), result);

		if (oldcarry > 0) {
			result.addFirst(oldcarry);
		}

		return result;

	}

	public static void main(String[] args) {
		CodingProb1Day3 add = new CodingProb1Day3();
		CodingProb1Day3.LinkedList list1 = add.new LinkedList();

		list1.addLast(2);
		list1.addLast(3);
		list1.addLast(5);
		list1.addLast(7);
		list1.display();

		CodingProb1Day3 add2 = new CodingProb1Day3();
		CodingProb1Day3.LinkedList list2 = add2.new LinkedList();

		list2.addLast(8);
		list2.addLast(2);
		list2.addLast(7);
		list2.display();

		LinkedList resultantList = addLinkedLists(list1, list2);
		resultantList.display();

	}

}
