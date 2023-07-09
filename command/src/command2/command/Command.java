package command2.command;

public interface Command {
	
	void execute();
	
	void undo();
	
	void redo();

}
