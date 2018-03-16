import java.util.Stack;

public class CommandRecorder {
	
	private Stack<?> secundaerStack;
	private Stack<?> mainStack; 
	
	public void undoSchritt() {
		
	}
	
	public void redoSchritt() {
		
	}
	
	public void voidausfuehren() {
		
	}

	public Stack<?> getSecundaerStack() {
		return secundaerStack;
	}

	public void setSecundaerStack(Stack<?> secundaerStack) {
		this.secundaerStack = secundaerStack;
	}

	public Stack<?> getMainStack() {
		return mainStack;
	}

	public void setMainStack(Stack<?> mainStack) {
		this.mainStack = mainStack;
	}
	
}