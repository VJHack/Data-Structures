/* Author: Vinesh Janarthanan
 * Date: January 6th 2020
 * Project: Stack implementation with arrays
 */
public class StackImplementation<T> {
	public static final int MAX = 50;
	public int top;
	public T[] array = (T[])new Object[MAX];
	
	/*	push: adds an item to the stack. If the stack is full, it is said to be an Overflow condition
		pop: removes an item from the stack. The items are popped in the reverse order in which they 
		were pushed. If the stack is empty, it is said to be in an underflow condition
		peek or top: returns the top element of the stack
		isEmpty returns true if the stack is empty
	*/
	StackImplementation() {
		top = -1;
	}

	public boolean push(T data) {
		if(top < MAX) {
			top++;
			array[top] = data;
			return true;
		}
		else {
			System.out.print("There has been an Overflow condition");
			return false;
		}
	}
	public T pop() {
		if(top > -1) {
			T data = array[top--];
			return data;
		}
		else {
			System.out.println("There has been an Underflow condition");
			return null;
		}
	}
	public T peek() {
		if(!isEmpty()) {
			return array[top];
		}
		else {
			System.out.println("There is nothing in the stack");
			return null;
		}
	}
	public boolean isEmpty() {
		if(top < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
