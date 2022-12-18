package designpatterns.behavioraldesignpatterns.commandpattern;

public class CommandPattern {
    public CommandPattern() {
        Switcher switcher = new Switcher();
        Light light = new Light();

        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);

        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);

        switcher.executeCommands();
    }
}
