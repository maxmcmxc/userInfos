package defaultPackage;
import java.io.File;

import org.hyperic.sigar.cmd.CpuInfo;

import infos.InfosFileSystem;
import infos.InfosJvm;

public class Infos {

	private File f;
	
	private InfosJvm infosJvm;
	private InfosFileSystem infosFileSystem;
	private CpuInfo cpuInfos;
	
	//Constructor
	 Infos(String filepath) {
		 this.f = new File(filepath);
		 
		 this.infosJvm = new InfosJvm();
		 this.infosFileSystem = new InfosFileSystem(this.f);
	 }
	 
	 //Method to return all infos
	 public String printInfos(){
		 
		 return this.infosJvm.toString() +
				 this.infosFileSystem.toString();
		
	 }
	 
}
