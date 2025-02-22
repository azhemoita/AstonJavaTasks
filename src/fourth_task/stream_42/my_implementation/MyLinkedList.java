package fourth_task.stream_42.my_implementation;

public class MyLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        if (first.next == null) {
            newNode.prev = first;
            newNode.next = last;
            first.next = newNode;
            last.prev = newNode;
        } else {
            Node lastNode = last.prev;
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = last;
            last.prev = newNode;
        }
    }

    public String get(int index) {
        Node node = first.next;
        int counter = 0;

        while (node != null && node != last) {
            if (counter == index) {
                return node.value;
            }

            node = node.next;
            counter++;
        }

        return null;
    }

    public void remove(int index) {
        Node node = first.next;
        int counter = 0;

        while (node != null && node != last) {
            if (counter == index) {
                Node prevNode = node.prev;
                Node nextNode = node.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                return;
            }
            node = node.next;
            counter++;
        }
    }

    public void addAll(MyLinkedList myLinkedList) {
        Node current = myLinkedList.first.next;

        while (current != null && current != myLinkedList.last) {
            this.add(current.value);
            current = current.next;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
