/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Paul
 */
public class ListNode<T> {
private T value;
private ListNode next;
    /**
     * Create a new ListNode given a value.
     *
     * @param v
     */
    ListNode(T v) {
        value = v;
    }
    
    public void setNext(ListNode t){
        next = t;
    }
    
    public ListNode getNext(){
        return next;
    }
    
    /**
     * return the value being held by this Node.
     *
     * @return
     */
    public T getValue() {
        return value;
    }
}
