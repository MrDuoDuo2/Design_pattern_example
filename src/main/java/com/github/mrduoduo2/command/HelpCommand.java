package com.github.mrduoduo2.command;

import com.github.mrduoduo2.Receiver.Receiver;

public class HelpCommand extends Command{
    Receiver receiver;

    @Override
    public void excute() {
        receiver.help();
    }

    public HelpCommand(Receiver receiver){
        this.receiver = receiver;
    }
}
