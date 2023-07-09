package command5.command;

import command5.observer.Observer;

public abstract class Command {

	protected Observer observer;

	public Command(Observer observer) {
		this.observer = observer;
	}
	
	public abstract void execute();
	public abstract void undo();
	public abstract void redo();
}
