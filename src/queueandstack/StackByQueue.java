package queueandstack;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
	private LinkedList<Integer> queue;
	private LinkedList<Integer> help;

	public StackByQueue() {
		queue = new LinkedList<Integer>();
		help = new LinkedList<Integer>();
	}
	
	// ¡Ì
	public void Push(Integer integer){
		queue.push(integer);
		
	}
	public int Pop(){
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		
		while(queue.size()>1){
			help.offer(queue.poll());
		}
		swap();
		return help.poll();
	}
	public int Peek(){
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		while(queue.size()>1){
			help.push(queue.poll());
		}
		Integer re=queue.poll();
		help.offer(re);
		swap();
		return re;
	}
	public void swap(){
		LinkedList<Integer> temp=queue;
		queue=help;
		help=temp;
	}

}
