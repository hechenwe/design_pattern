package com.sooncode.design_pattern.command_pattern;

/**
 * 命令
 */
 class Command4 implements Command{
    private Receiver receiver;
   
    
    public Command4(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action4();
    }

    
    
}