public class DoublyLinkedList {
    private Node head;
    private Node tail;

    class Node {
        private int value;
        private Node previous;
        private Node next;

        private Node(){}

        private Node(int value){
            this.value = value;
        }
    }

public void print2(){
    if (head == null){
        System.out.println("Список пуст");
        return;
    }
    Node node = head;
    while (node != null){
        System.out.print(node.value + " -> ");
        node = node.next;
    }
}

// Добавление в начало списка
public void addFirst (int value){
    Node node = new Node();
    node.value = value;
    if (head != null){
        head.previous = node;
        node.next = head;

    }    
    head = node;
    tail = node;
    
}

//Удаление первого элемента
public void removeFirst(){
    if ( head == null){
        System.out.println("Невозможно удалить, список пуст.");
    }
    else {
        head = head.next;
        head.previous = null;
    }
}

// Добавление в конец списка
public void addLast (int value){
    Node node = new Node();
    node.value = value;
    if (head != null){
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        // tail.next = node;
        // node.previous = tail;
        // tail = node;
        tail.next = node;
        node.previous = tail;

    }
    else{
        head = node;
        tail = node;
    }
    
}

//Удаление последнего элемента
public void removeLast() {   
    if (tail == null) {        
        System.out.println("Невозможно удалить, список пуст.");
    }    
    else {
        tail = tail.previous;
        tail.next = null;   
    }
}


public void removeLast2(){
    if(tail == null){
        System.out.println("Список пуст!");
    } else if (tail.previous == null) {
        head = null;
        tail = null;
    } else{
        tail.previous.next = null;
        tail = tail.previous;
    }
}

// Разворот двусвязного списка
public void reverse() {
    if (head.next != null) {
        tail = head;
        Node node = head.next;
        head.next = null;
        while (node != null) {
            Node next = node.next;
            node.next = head;
            head = node;
            node = next;
        }
    }
}
}
