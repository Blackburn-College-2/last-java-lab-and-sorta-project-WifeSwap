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
public class MyStack<T> {

    MyList<T> arr = new MyList();

    /**
     * push an element onto the stack
     *
     * @param t the element to add to the stack
     * @return return the stack to allow chaining. i.e. stack.push(1).push(2)...
     */
    public MyStack<T> push(T t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * remove and return the top element from the stack. This method should
     * throw an exception of your own descriptive making when this method is
     * called on an empty stack.
     *
     * @return the top of the stack/removed element
     */
    public T pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * returns the top element on the stack, but does not remove it.
     *
     * @return the top element of the stack
     */
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Answers whether or not the stack contains elements.
     *
     * @return true-contains elements; false otherwise.
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * returns how many elements are in the stack.
     *
     * @return
     */
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Custom toString which prints the stack... as a stack. (See example test
     * case from lab.
     *
     * @return
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
