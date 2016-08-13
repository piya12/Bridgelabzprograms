package com.bridgelabz.util;
public class Stack<T>
{
	Object arr[];
	int top,size;
	public Stack(int size)
	{
		this.size = size;
		arr = new Object[size];
		top = -1;
	}
	public void push(T data)
	{
		if(top == size-1)
			System.out.println("Stack overflow!");
		else
		{
			arr[++top] = data;
		}
	}
	public void pop()
	{
		if(top == -1)
			System.out.println("Stack is empty!");
		else
		{
			arr[top--] = null;
		}
	}
	public Object peak()
	{
		return arr[top];
	}
	public void displayStack()
	{
		for(int i=top; i>=0; i--)
		{
			if(i == top)
				System.out.println(arr[i]+" <-top");
			else
				System.out.println(arr[i]);
		}
	}
 	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
}
