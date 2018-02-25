package queueandstack;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class QueueByStack {
	private Stack<Integer> stack;
	private Stack<Integer> help;
	public QueueByStack(){
		stack=new Stack<>();
		help=new Stack<>();
	}
	
	public int Poll(){
		if(stack.isEmpty())
			throw new RuntimeException("empty");
		while(stack.size()>1){
			help.push(stack.pop());
		}
		int re=stack.pop();
		swap();
		
	}
	public int Peek(){
		
	}
	public void offer(Integer integer){
		stack.push(integer);
	}

}
