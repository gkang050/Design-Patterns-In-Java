

public class GarbageDoorOnCommand implements Command{
	public Garbage garbage;
	public GarbageDoorOnCommand(Garbage garbage){
		this.garbage = garbage;
	}
	public void execute() {
		garbage.on();
		
	}
}
