package com.fivejoy.byarray;

public class RightArrayQueue {
	private Integer[] arr;
	private Integer size;
	private Integer first;
	private Integer last;

	public RightArrayQueue(int initSize) {
		if (initSize < 0) {
			throw new IllegalArgumentException("The init size is less than 0");
		}
		arr = new Integer[initSize];
		size = 0;
		first = 0;
		last = 0;
	}

	public Integer peek() {
		if (size == 0) {
			return null;
		}
		return arr[first];
	}

	public void push(int obj) {
		if (size == arr.length) {
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		size++;
		arr[last] = obj;
		last = last == arr.length - 1 ? 0 : last + 1;
	}

	public Integer poll() {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException("The queue is empty");
		}
		size--;
		int tmp = first;
		first = first == arr.length - 1 ? 0 : first + 1;
		return arr[tmp];
	}
}
