package fourth_task.stream_42.generics;

public class MyLinkedListGen<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();

    public void printAll() {
        Node<T> currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;

        if (first.next == null) {
            newNode.prev = first;
            newNode.next = last;
            first.next = newNode;
            last.prev = newNode;
        } else {
            Node<T> lastNode = last.prev;
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = last;
            last.prev = newNode;
        }
    }

    public T get(int index) {
        Node<T> node = first.next;
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
        Node<T> node = first.next;
        int counter = 0;

        while (node != null && node != last) {
            if (counter == index) {
                Node<T> prevNode = node.prev;
                Node<T> nextNode = node.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                return;
            }
            node = node.next;
            counter++;
        }
    }

    public void addAll(MyLinkedListGen<T> myLinkedList) {
        Node<T> current = myLinkedList.first.next;

        while (current != null && current != myLinkedList.last) {
            this.add(current.value);
            current = current.next;
        }
    }

    public static class Node<T> {
        private Node<T> prev;
        private T value;
        private Node<T> next;
    }
}
