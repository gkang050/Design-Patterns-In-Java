
public class LightOnCommand implements Command{

	public Light light;
	public LightOnCommand(Light light){
		this.light = light;
	}
	public void execute() {
		light.on();
		
	}

}
