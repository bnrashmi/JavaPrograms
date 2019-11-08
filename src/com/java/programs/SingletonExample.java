package com.java.programs;

 class SingletonExampleTest {

	public static volatile SingletonExampleTest singletonExample;
	
	private SingletonExampleTest() {
		
	}
	
	public static SingletonExampleTest getInstance() {
		
		if(singletonExample == null) {
			synchronized (SingletonExampleTest.class) {
				if(singletonExample == null) {
					singletonExample = new SingletonExampleTest();
				}
			}
		}
		return singletonExample;
	}
}

 public class SingletonExample  {
	 
	 public static void main(String[] args) {
		System.out.println(SingletonExampleTest.getInstance());
		System.out.println(SingletonExampleTest.singletonExample);
	}
 }