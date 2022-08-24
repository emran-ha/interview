package asd.command;

import java.util.Stack;

class Application {
    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();
        CommandHistory commandHistory =  new CommandHistory();
        Command pushCommand =  new PushCommand(stack, 200);
        pushCommand.execute();
        commandHistory.addCommand(pushCommand);
        pushCommand = new PushCommand(stack, 210);
        pushCommand.execute();
        commandHistory.addCommand(pushCommand);
        pushCommand = new PushCommand(stack, 220);
        pushCommand.execute();
        commandHistory.addCommand(pushCommand);
        System.out.println(stack);
        Command popCommand = new PopCommand(stack);
        popCommand.execute();
        System.out.println(stack);
        popCommand.unExecute();
        System.out.println(stack);
        commandHistory.undo();
        commandHistory.undo();
        System.out.println(stack);
        commandHistory.redo();
        commandHistory.redo();
        System.out.println(stack);
    }
}
