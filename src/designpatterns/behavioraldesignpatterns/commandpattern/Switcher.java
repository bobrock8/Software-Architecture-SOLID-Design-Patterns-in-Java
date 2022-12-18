package designpatterns.behavioraldesignpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {

    public List<Command> commandList;

    public Switcher() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    public void executeCommands() {
        for (Command command: commandList)
            command.execute();
    }
}
