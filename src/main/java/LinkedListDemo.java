package linkedlist;

/**
 * LinkedList implementation with Java 21 features
 * Demonstrates modern Java syntax and best practices
 */
public class LinkedListDemo {

    /**
     * Node class using record (Java 14+) for immutable data structure
     * Using sealed classes (Java 17+) for better type safety
     */
    public static final class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{data=" + data + "}";
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedListDemo() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Add element to the end of the list
     * Using enhanced switch expressions (Java 14+)
     */
    public void add(int data) {
        Node newNode = new Node(data);
        
        switch (size) {
            case 0 -> {
                head = newNode;
                tail = newNode;
            }
            default -> {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
        size++;
    }

    /**
     * Display the list using text blocks (Java 15+) for formatting
     */
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        var current = head; // var keyword (Java 10+)
        var sb = new StringBuilder();
        
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        
        System.out.println("""
                LinkedList contents:
                %s
                Size: %d
                """.formatted(sb.toString(), size));
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        var list = new LinkedListDemo();
        
        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.display();
        
        // Demonstrating pattern matching (Java 21 preview)
        System.out.println("List status: " + getListStatus(list));
    }

    /**
     * Pattern matching example (Java 21 preview feature)
     */
    private static String getListStatus(LinkedListDemo list) {
        return switch (list.size()) {
            case 0 -> "Empty list";
            case 1 -> "Single element list";
            case int size when size <= 5 -> "Small list with " + size + " elements";
            case int size when size <= 10 -> "Medium list with " + size + " elements";
            default -> "Large list with " + list.size() + " elements";
        };
    }
}