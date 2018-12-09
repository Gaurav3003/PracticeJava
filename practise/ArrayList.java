package com.practise;

public class ArrayList<T> {
	
	private Object[] array = new Object[16];
	private int currentSize = -1;
	
	public void add(T t) {
		if(currentSize > (0.75*array.length)) {
			Object[] tempArr = new Object[(int) (array.length*1.5)];
			for (int i=0;i<=currentSize;i++) {
				tempArr[i] = array[i];
			}
			array = tempArr;
		}
		array[currentSize+1] = t;
		currentSize++;
	}
	
	public T get(int i) {
		return (T) array[i];
	}
	
	public Object remove(int i) {
		Object t = array[i];
		for (int j = i;j<currentSize;j++) {
			array[j] = array[j+1];
		}
		return t;
	}

}
