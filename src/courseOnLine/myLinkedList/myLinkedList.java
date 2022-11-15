package courseOnLine.myLinkedList;

public class myLinkedList {
    private Node first;
    private int size;
    private Node last;

    public void add(String str) {
        if (size == 0) {
            Node node = new Node(null, str, null);
            first = node;
            last = node;
        } else {
            Node secondNode = last;
            last = new Node(secondNode, str, null);
            secondNode.next = last;
        }
        size++;
    }

    public void add(String str, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(str);
            return;
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, str, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
    }

    public Node getNode(int index) {
        Node node = first;
        for (int i = 0; i < index; i++)
            node = node.next;
        return node;
    }

    public int size() {
        return size;
    }

    private static class Node {
        private Node previous;
        private String value;
        private Node next;

        public Node(Node previous, String value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}
