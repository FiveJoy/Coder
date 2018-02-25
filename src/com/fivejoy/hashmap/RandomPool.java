package com.fivejoy.hashmap;

import java.util.HashMap;

public class RandomPool {
	
	public class Pool<T>{
		private HashMap<T, Integer> KeyIndexMap;
		private HashMap<Integer, T> IndexKeyMap;
		private int index;
		public Pool(){
			KeyIndexMap=new HashMap<>();
			IndexKeyMap=new HashMap<>();
			index=0;
		}
		public void Insert(T key){
			if(!this.KeyIndexMap.containsKey(key)){
				this.KeyIndexMap.put(key, this.index);
				this.IndexKeyMap.put(this.index++, key);
			}
		}
		public void Delete(T key){
			
		}
	}

}
