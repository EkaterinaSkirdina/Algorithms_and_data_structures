public class Linkedlist {
    private Node head;

private class Node {
    private int value;
    private Node nextNode;
}

public void print(){
    if (head == null){
        System.out.println("Список пуст");
        return;
    }
    Node node = head;
    while (node != null){
        System.out.print(node.value + " -> ");
        node = node.nextNode;
    }
}


public void addLast(int value){
    Node node = new Node();
    node.value = value;
    if (head == null){
        head = node;
    }
    else{
        Node last = head;
        while (last.nextNode != null){
            last = last.nextNode;
        }
        last.nextNode = node;
    }
}


// Метод разворота односвязного списка
public void reverse(){
    if (head == null){
        System.out.println("Невозможно развернуть, пустой список.");
    } else if (head.nextNode == null) {
        System.out.println("Невозможно развернуть, в списке один элемент.");
    }else {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}


}