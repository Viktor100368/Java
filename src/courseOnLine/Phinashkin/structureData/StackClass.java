package courseOnLine.Phinashkin.structureData;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push("aljf");
        System.out.println(stack.empty());
        if(!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.empty());
    }
}
