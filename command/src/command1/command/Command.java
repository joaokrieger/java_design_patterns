package command1.command;

public interface Command {
	void execute();
	void undo();
	void redo();
}
