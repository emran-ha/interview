package asd.command;

import java.util.Stack;

class PopCommand implements Command{
    Stack<Integer> stack;
    Integer i;
    PopCommand(Stack<Integer> stack){
        this.stack = stack;
    }
    @Override
    public void execute() {
        i = stack.pop();
    }

    @Override
    public void unExecute() {
        stack.push(i);
    }
}
