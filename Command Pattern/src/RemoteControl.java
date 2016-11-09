public class RemoteControl {
Command[] onCommands;
Command[] ofCommands;
public RemoteControl(int size){
	onCommands = new Command[size];
	ofCommands = new Command[size];
	/*Command noCommand = new NoCommand();
	for(int i = 0; i < size; i++){
		onCommands[i] = noCommand;
		ofCommands[i] = noCommand;
	}*/
}
//Initialize commands
public void setSlot(int slot, Command onCommand, Command offCommand){
	onCommands[slot] = onCommand;
	ofCommands[slot] = offCommand;
}
public void OnbuttonPressed(int slot){
	//slot.execute();
	onCommands[slot].execute();
}
public void OfbuttonPressed(int slot){
	//slot.execute();
	ofCommands[slot].execute();
}
}
