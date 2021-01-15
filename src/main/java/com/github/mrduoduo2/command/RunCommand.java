package com.github.mrduoduo2.command;

import com.github.mrduoduo2.Receiver.Receiver;

public class RunCommand extends Command {
    Receiver receiver;
    String color;

    @Override
    public void excute() {
        receiver.run(color);
    }

    public RunCommand(Receiver receiver,String[] cmd) {
        this.receiver = receiver;
        try {
            this.color = cmd[2];
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("");
        }


    }
}
