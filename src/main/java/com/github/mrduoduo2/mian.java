package com.github.mrduoduo2;

import com.github.mrduoduo2.Factory.CommandFactory;
import com.github.mrduoduo2.Invoke.Invoke;
import com.github.mrduoduo2.Receiver.Receiver;
import com.github.mrduoduo2.command.Command;
import com.github.mrduoduo2.command.RunCommand;


public class mian {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandFactory().create(args,receiver);
        Invoke invoke = new Invoke(command);
    }
}
