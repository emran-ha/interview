package asd.command;

import java.util.Stack;

class PushCommand implements Command{
    Stack<Integer> stack;
    Integer i;
    PushCommand(Stack<Integer> stack, Integer i){
        this.stack = stack;
        this.i = i;
    }
    @Override
    public void execute() {
        stack.push(i);
    }

    @Override
    public void unExecute() {
        stack.pop();
    }
}
