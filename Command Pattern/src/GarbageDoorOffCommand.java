

public class GarbageDoorOffCommand implements Command{
	public Garbage garbage;
	public GarbageDoorOffCommand(Garbage garbage){
		this.garbage = garbage;
	}
	public void execute() {
		garbage.off();
		
	}
}
