package com.sooncode.design_pattern.command_pattern;

/**
 * 命令
 */
 class Command2 implements Command{
    private Receiver receiver;
   
    
    public Command2(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }

    
    
}