/*Implementation of stack in java */

import java.util.*;

import javax.swing.Popup;

public class stack
{
    public static void main(String args[])
    {
        // Declairation of Stack:-

        Stack<Integer> st = new Stack<>();

        // Push operation in Stack:-

        st.push(55);
        System.out.println(st);

        st.push(60);

        // to print stack:-

        System.out.println(st);

        // to print top of Stack:-

        System.out.println(st.peek());

        // to print size of stack:-

        System.out.println(st.size());

        st.push(90);
        st.push(4);
        st.push(15);
        st.push(9);
        System.out.println(st + " , " + st.peek() + " , " + st.size());

        // Deletion or Pop operation:-

        st.pop();
        System.out.println(st + " , "+ st.size()+ " , " + st.peek());

        // To print element at specific place or index:-
        System.out.println("Element at index number 4 is :-" + st.elementAt(4));
    }
}
