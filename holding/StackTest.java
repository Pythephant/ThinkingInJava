package holding;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(String s: "My dog is fleas.".split(" "))
			stack.push(s);
		while(!stack.isEmpyt())
			System.out.print(stack.pop()+" ");
	}
}
