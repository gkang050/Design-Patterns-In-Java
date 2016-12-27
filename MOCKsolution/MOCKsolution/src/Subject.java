// This interface handles adding, deleting and updating all observers 

public interface Subject {
	
	public void register(String o);
	public void unregister(String o);
	public void notifyObserver();
	
}