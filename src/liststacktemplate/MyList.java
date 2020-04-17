/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Paul
 * @param <T>
 */
public class MyList<T> {

    private ListNode head;

    /**
     * get the ith element stored in the list. Note that this does not return
     * the containing node, but the stored element in the node. Null if D.N.E.
     *
     * @param i
     * @return
     */
    public T get(int i) {
        ListNode currentNode = head;
        for (int a = 0; a < i; a++) {
            if (currentNode != null) {
                currentNode = currentNode.getNext();
            }
        }
        if (currentNode == null) {
            return null;
        } else {
            return (T) currentNode.getValue();
        }
    }

    /**
     * Add an element to the end of the list.
     *
     * @param v the element to insert.
     * @return the modified list object
     */
    public MyList<T> add(T v) {
        if (isEmpty()) {
            head = new ListNode(v);
            return this;
        }
        
        ListNode currentNode = head;
        int size = size();
        for (int i = 0; i < size - 1; i++) {
            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
        }
        currentNode.setNext(new ListNode(v));
        return this;
    }

    /**
     * removes an element (node) at the index specified.
     *
     * @param i
     * @return the element which was removed. null if invalid index.
     */
    public T removeAtIndex(int i) {
        /*
        Be careful here! think about edge cases. If you choose to keep a
        'last' pointer, what if the element being removed is last?
         */
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            T value = (T) head.getValue();
            head = head.getNext();
            return value;
        }
        
        ListNode currentNode = head;
        ListNode tempNode = head;
        T value = get(i + 1);
        if (i == (size() - 1)) {
            for (int a = 0; a < i - 1; a++) {
                if (currentNode != null) {
                    currentNode = currentNode.getNext();
                }
            }
            currentNode.setNext(null);
        } else {
            for (int a = 0; a < i - 1; a++) {
                if (currentNode != null) {
                    currentNode = currentNode.getNext();
                }
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        return value;
    }

    /**
     * returns the index of the element given. -1 if not found.
     *
     * @param v The element to look for.
     * @return the index or -1 if not found.
     */
    public int indexOf(T v) {
        int size = size();
        int position = -1;
        //System.out.println("size is " + size);
        for (int i = 0; i < size; i++) {
//            if (get(i + 1) == v) {
//                position = i+1;
//                break;
//            }
            if (get(i) == v) {
                position = i;
                break;
            }
        }
        //System.out.println(v + " is at " + position);
        return position;
    }

    /**
     * removes the first occurrence of given element. Does nothing if the
     * element is not present in the list.
     *
     * @param v the element to remove
     * @return the modified list to allow chaining i.e.
     * ls.remove(3).remove(4)...
     */
    public MyList<T> remove(T v) {
        //System.out.println("removing " + v);
        removeAtIndex(indexOf(v));
        return this;
    }

    /**
     * calculates and returns the size/length of the list.
     *
     * @return the length/size.
     */
    public int size() {
        if (isEmpty()) {
            return 0;
        }        
        ListNode currentNode = head;
        boolean checkingSize = true;
        int i = 0;
        while (checkingSize) {
            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                i++;
                //System.out.println(currentNode.getValue());
            } else {
                checkingSize = false;
            }
        }
        return i + 1;
    }

    /**
     * Answers if there are any elements in the list.
     *
     * @return true if list contains at least 1 element, false otherwise.
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A pretty toString for lists.
     *
     * @return MyList: [elem1, elem2, elem3...]
     */
    @Override
    public String toString() {
        String currentString = "";
        int size = size();
        for (int i = 0; i < 1; i++) {
            currentString = currentString + get(i);
        }
        for (int i = 1; i < size; i++) {
            currentString = currentString + ", " + get(i);
        }
        return "MyList: [" + currentString + "]";
    }

}
