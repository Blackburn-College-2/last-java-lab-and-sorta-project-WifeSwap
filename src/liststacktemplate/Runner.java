
import liststacktemplate.MyList;
import liststacktemplate.MyStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack stack = new MyStack<Integer>();
        stack.push(50);
        stack.push(3);
        stack.push(40000);
        stack.push(233);
        System.out.println("My stack:");
        System.out.println(stack);
        MyStack stack2 = new MyStack<String>();
        stack2.push("hi").push("hello").push("last pushed");
        System.out.println(stack2);

    }

}
