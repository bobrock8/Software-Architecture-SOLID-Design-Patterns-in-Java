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


        final Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                algorithm.produce();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                algorithm.consume();
            }
        });

        t1.start();
        t2.start();
    }
}
