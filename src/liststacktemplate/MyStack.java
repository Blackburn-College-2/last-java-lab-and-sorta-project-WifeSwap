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
        arr.add(t);
        return this;
    }

    /**
     * remove and return the top element from the stack. This method should
     * throw an exception of your own descriptive making when this method is
     * called on an empty stack.
     *
     * @return the top of the stack/removed element
     */
    public T pop() {
        if(isEmpty()){
        throw new UnsupportedOperationException("Stack empty.");    
        }else{
        T value =arr.get(arr.size()-1);
        arr.remove(value);
        return value;
        }
    }

    /**
     * returns the top element on the stack, but does not remove it.
     *
     * @return the top element of the stack
     */
    public T peek() {
        return arr.get(arr.size()-1);
    }

    /**
     * Answers whether or not the stack contains elements.
     *
     * @return true-contains elements; false otherwise.
     */
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    /**
     * returns how many elements are in the stack.
     *
     * @return
     */
    public int size() {
        return arr.size();
    }

    /**
     * Custom toString which prints the stack... as a stack. (See example test
     * case from lab.
     *
     * @return
     */
    @Override
    public String toString() {
                
        String currentString = "";
        int size = size();
        for (int i = 0; i < size; i++) {
            currentString = "| " + arr.get(i) + " |\n"+currentString;
        }
        return currentString;
    }
}
