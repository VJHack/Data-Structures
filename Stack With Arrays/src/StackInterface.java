/* Author: Vinesh Janarthanan
 * Date: January 6th 2020
 * Project: Stack implementation with arrays
 */

public class StackInterface {
	public static void main(String args[]) {
		StackImplementation<Integer> stack1 = new StackImplementation<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		for(int i = 5; i <= 10; i++) {
			stack1.push(i);
		}
		for(int i = stack1.top; i >= 0; i--) {
			System.out.println(stack1.pop());
		}
		
		StackImplementation<String> stack2 = new StackImplementation<>();
		System.out.println("Is stack2 empty: " + stack2.isEmpty());
		stack2.push("Bob");
		stack2.push("Brian");
		stack2.push("Bill");
		stack2.push("Bennet");
		stack2.push("Bean");
		stack2.pop();
		System.out.println(stack2.peek());
		
	}
}
