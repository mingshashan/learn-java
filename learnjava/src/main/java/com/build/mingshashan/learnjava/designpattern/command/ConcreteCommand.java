package com.build.mingshashan.learnjava.designpattern.command;

public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    protected void execute() {
        this.receiver.action();
    }
}
