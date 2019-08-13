package command;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {
    @Test
    public void should_return_Light_is_on_when_given_ligh_on_command(){
        //given
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);
        //when
        remoteControl.setCommand(command);
        String str = remoteControl.onButtonWasPressed();
        remoteControl.setCommand(offCommand);
        String str1 = remoteControl.offButtonWasPressed();
        //then
        Assert.assertEquals("Light is on", str);
        Assert.assertEquals("Light is off", str1);
    }

    @Test
    public void should_return_GarageDoor_is_open_when_given_garageDoor_on_command(){
        //given
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorCommand command = new GarageDoorCommand(garageDoor);
        GarageDoorCloseCommand closeCommand = new GarageDoorCloseCommand(garageDoor);
        //when
        remoteControl.setCommand(command);
        String str = remoteControl.onButtonWasPressed();
        remoteControl.setCommand(closeCommand);
        String str1 = remoteControl.offButtonWasPressed();
        //then
        Assert.assertEquals("GarageDoor is open", str);
        Assert.assertEquals("GarageDoor is close", str1);
    }
}