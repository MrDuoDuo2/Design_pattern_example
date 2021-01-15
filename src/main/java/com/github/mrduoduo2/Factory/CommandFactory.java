package com.github.mrduoduo2.Factory;

import com.github.mrduoduo2.Receiver.Receiver;
import com.github.mrduoduo2.command.Command;
import com.github.mrduoduo2.command.HelpCommand;
import com.github.mrduoduo2.command.RunCommand;
import com.github.mrduoduo2.command.StopCommand;

import java.util.HashMap;

public class CommandFactory  {
    Receiver receiver;
    String Color;
    HashMap<String, Command> cmd = new HashMap<String, Command>();
    public CommandFactory() {
    }

    public Command create(String[] args, Receiver receiver) {
        this.receiver = receiver;

        cmd.put("run",new RunCommand(receiver,args));
        cmd.put("stop",new StopCommand(receiver));
        cmd.put("help",new HelpCommand(receiver));
        Command command = cmd.get(args[1]);

        if(command ==null) {
            command = cmd.get("help");
        }

        return command;
    }
}
