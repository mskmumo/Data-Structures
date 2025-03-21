public class SinglyLinkedList {
    // Node class to represent each node in the linked list
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head; // Head of the linked list
    
    // Constructor
    public SinglyLinkedList() {
        head = null;
    }
    
    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        // If the list is empty, make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Insert the new node at the end
        current.next = newNode;
    }
    
    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        // If list is empty, return
        if (head == null) {
            return;
        }
        
        // Move head to the next node
        head = head.next;
    }
    
    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Main method to test the implementation
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Test insertAtBeginning
        System.out.println("Inserting at beginning:");
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display();
        
        // Test insertAtEnd
        System.out.println("\nInserting at end:");
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display();
        
        // Test deleteFromBeginning
        System.out.println("\nDeleting from beginning:");
        list.deleteFromBeginning();
        list.display();
    }
} 