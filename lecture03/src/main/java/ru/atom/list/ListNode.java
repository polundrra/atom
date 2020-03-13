package ru.atom.list;

/**
 * Contains ref to next node, prev node and value
 */
public class ListNode<E> {
    private E payload;
    private ListNode<E> next;

    public ListNode(E payload, ListNode<E> next) {
        this.payload = payload;
        this.next = next;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public E getPayload() {
        return payload;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }
}
