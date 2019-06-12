package com.linty.reverselist;

public class MyList {
    private Node head;
    private Node tail;

    private class Node {
        private Node next;
        private int data;
    }

    public boolean addElement(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;

        }
        return true;
    }

    public boolean deleteElement(int data) {
        if (head == null) {
            System.out.println("The list is empty to delete");
            return false;
        }
        if (head == tail) {
            head = null;
            tail = null;
            System.out.printf("The element %d was deleted\n", data);
            return true;
        }
        if (head.data == data) {
            head = head.next;
            System.out.printf("The element %d was deleted\n", data);
            return true;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.data == data) {
                if (tail == node.next) {
                    tail = node;
                }
                node.next = node.next.next;
                System.out.printf("The element %d was deleted\n", data);
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.printf("%d ", node.data);
            node = node.next;
        }
        System.out.println();

    }

    public Node recursReverse(Node prev, Node curr) {
        checkSize();
        if (prev == head)
            prev.next = null;
        if (curr == null) {
            head = prev;
            return head;
        } else {
            Node next = curr.next;
            curr.next = prev;
            recursReverse(curr, next);
        }
        return null;

    }

    public void nonRecursReverse() {
        checkSize();
        Node currNode = head;
        Node preNode = null;
        while (currNode != null) {
            Node next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;

        }
        head = preNode;
    }

    private void checkSize() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head == tail) {
            System.out.println("The size of the list must be bigger than 1\n");
            return;
        }
    }


    public Node getNext() {
        return head.next;
    }

    public Node getHead() throws NullPointerException {
        if (head != null) {
            return head;
        } else
            throw new NullPointerException("The head element is null");
    }


}
