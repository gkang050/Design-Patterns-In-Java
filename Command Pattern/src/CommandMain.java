
public class CommandMain {

	public static void main(String[] args) {
		RemoteControl r = new RemoteControl(2);
		Light light = new Light();
		Garbage g = new Garbage();
		GarbageDoorOffCommand garbageOf = new GarbageDoorOffCommand(g);
		GarbageDoorOnCommand garbageOn = new GarbageDoorOnCommand(g);
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOf = new LightOffCommand(light);
		r.setSlot(0,lightOn, lightOf);
		r.OnbuttonPressed(0);
		r.OfbuttonPressed(0);
		r.setSlot(1,garbageOn, garbageOf);
		r.OnbuttonPressed(1);
		r.OfbuttonPressed(1);
	}

}
