package command3.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

	private List<Command> todos = new ArrayList<>();
	
	private List<Command> undo = new ArrayList<>();
	
	public void execute(Command comm) {
	
		comm.execute();
		todos.add(comm);
	}

	public void undo() {
		
		if (todos.size() > 0) {
			Command comm = todos.remove(todos.size()-1);
			comm.undo();
			undo.add(comm);
		}
		
	}
	
	
	public void redo() {
		
		if (undo.size() > 0) {
			Command comm = undo.remove(undo.size()-1);
			comm.redo();
			todos.add(comm);
		}
		
	}

}

