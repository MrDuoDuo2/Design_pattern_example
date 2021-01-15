package com.github.mrduoduo2.Invoke;

import com.github.mrduoduo2.command.Command;

public class Invoke {

        Command _cmd;

        public Invoke(Command command) {
            this._cmd = command;
            command.excute();
        }
}
