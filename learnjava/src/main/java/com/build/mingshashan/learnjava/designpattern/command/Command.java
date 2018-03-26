package com.build.mingshashan.learnjava.designpattern.command;

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    protected abstract void execute();
}
