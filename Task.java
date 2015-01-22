package com.scott.code;

public abstract class Task {
	
	public boolean state = false;
	
	public long nextExecutionTime;
	
	abstract boolean execute();
	
	abstract Object getResult();

}
