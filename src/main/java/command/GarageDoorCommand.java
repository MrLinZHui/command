package command;

public class GarageDoorCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.open();
    }
}
