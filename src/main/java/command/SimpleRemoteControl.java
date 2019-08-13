package command;

public class SimpleRemoteControl {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public String onButtonWasPressed() {
        return command.execute();
    }

    public String offButtonWasPressed(){
        return command.execute();
    }
}
