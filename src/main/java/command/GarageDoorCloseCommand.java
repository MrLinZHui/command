package command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor  = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.close();
    }
}
