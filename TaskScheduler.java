package com.scott.code;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {

	private Task task;
	private long delay;
	private long period;
	private long exMaxTimes;
	
	
	public static void main(String[] args) {
	}
	
	public TaskScheduler(Task task, long delay, long period, int exMaxTimes){
		this.task = task;
		this.delay = delay ;
		this.period = period;
		this.exMaxTimes = exMaxTimes;
	}
	
	
	public void execute(){
		int counter = 0;
		while (counter++<exMaxTimes){
			if (delay !=0){
				try{
					TimeUnit.MILLISECONDS.sleep(delay);
					delay = 0;
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			 }
				
			if (task.execute()){
			    task.state = true;
			    break;
			}else{
				task.nextExecutionTime=System.currentTimeMillis()+period;
				long now = System.currentTimeMillis();
				while (task.nextExecutionTime>now){
					try{
						TimeUnit.MILLISECONDS.sleep(task.nextExecutionTime-now);
					}catch(InterruptedException e){
						e.printStackTrace();
					}finally{
						now = System.currentTimeMillis();	
					}
				}
				
			}
		}
	}

}
