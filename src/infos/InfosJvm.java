package infos;

public class InfosJvm {
	
	private String freeMemoryJvm;
	private String totalMemoryJvm;
	private String usedMemoryJvm;
	private String maxMemoryJvm;
	
	public InfosJvm(){
		
		this.freeMemoryJvm = String.valueOf(Runtime.getRuntime().freeMemory());
		this.totalMemoryJvm = String.valueOf(Runtime.getRuntime().totalMemory());
		this.usedMemoryJvm = String.valueOf(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
		this.maxMemoryJvm = String.valueOf(Runtime.getRuntime().maxMemory());
		
	}
	
	public String toString(){
		
		return(
				"*********[JVM infos]*********\n" + 
				 "Free memory of the JVM: " + this.freeMemoryJvm + "\n" +
				 "Total memory of the JVM: " + this.totalMemoryJvm + "\n" +
				 "Used memory of the JVM: " + this.usedMemoryJvm + "\n" +
				 "Max memory that will be used by the JVM: " + this.maxMemoryJvm + "\n\n");
	}			
	
}
