package ru.atom.list;

import java.util.Objects;

/**
 * Contains ref to next node, prev node and value
 */
public class ListNode<E> {
    private E value;
    private ListNode<E> next;
    private ListNode<E> prev;

    public ListNode(E value, ListNode<E> next, ListNode<E> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public ListNode<E> getPrev() {
        return prev;
    }

    public E getValue() {
        return value;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode<?> listNode = (ListNode<?>) o;
        return value.equals(listNode.value);
    }

}
