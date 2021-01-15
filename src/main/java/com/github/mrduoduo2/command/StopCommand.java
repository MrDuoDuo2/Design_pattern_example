package com.github.mrduoduo2.command;

import com.github.mrduoduo2.Receiver.Receiver;

public class StopCommand extends Command{
    private final Receiver receiver;

    @Override
    public void excute() {
        receiver.stop();
    }

    public StopCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
