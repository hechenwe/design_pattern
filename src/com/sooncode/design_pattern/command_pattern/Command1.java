package com.sooncode.design_pattern.command_pattern;

/**
 * 命令
 */
class Command1 implements Command{
    private Receiver receiver;
   
    
    public Command1(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
	
    public void execute() {
        receiver.action1();
    }

    
    
}