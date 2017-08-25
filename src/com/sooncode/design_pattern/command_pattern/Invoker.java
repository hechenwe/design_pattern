package com.sooncode.design_pattern.command_pattern;


/**
 * 命令执行顺序控制
 * @author hechenwe@gmail.com
 *
 */
public class Invoker {
	/**
	 * 调用者持有命令对象
	 */
	private Command command1;
	private Command command2;
	private Command command3;
	private Command command4;

	private int index = 1;

	 
	
	public Invoker(Receiver receiver) {
		Command c1 = new Command1(receiver);
		Command c2 = new Command2(receiver);
		Command c3 = new Command3(receiver);
		Command c4 = new Command4(receiver);
		this.command1 = c1;
		this.command2 = c2;
		this.command3 = c3;
		this.command4 = c4;
		 
	}

	 
	public void command1() {
		if (index == 1) {
			command1.execute();
			index++;
		}else {
			index =0;
		} 
	}

	public void command2() {
		if (index == 2) {
			command2.execute();
			index++;
		}else {
			index =0;
		}
	}

	public void command3() {
		if (index == 3) {
			command3.execute();
			index++;
		}else {
			index =0;
		}
	}

	public void command4() {
		if (index == 4) {
			command4.execute();
			index = 1;
		}else {
			index =0;
		}
	}

}