package defaultPackage;
//Package à importer afin d'utiliser l'objet File
import java.io.File;

import org.hyperic.sigar.cmd.CpuInfo;
import org.hyperic.sigar.cmd.Df;
import org.hyperic.sigar.cmd.NetInfo;
import org.hyperic.sigar.cmd.Ps;
import org.hyperic.sigar.cmd.ServiceStatus;
import org.hyperic.sigar.cmd.ShowEnv;
import org.hyperic.sigar.cmd.SysInfo;

	public class DisplayUserInfos {
		
	  public static void main(String[] args) throws Exception {
		  
		  //JVM Informations
		  Infos jvmInfosFile1 = new Infos("test.txt");
		  System.out.println(jvmInfosFile1.printInfos());
		  //CPU Informations
		  new CpuInfo().processCommand(args);
		  //Disks Informations
		  new Df().processCommand(args);
		  //Netstat
		  new NetInfo().processCommand(args);
		  //Running Process
		  new Ps().processCommand(args);
		  //Running services
		  new ServiceStatus().returnServiceStatus(args);
		  //Show Environment
		  new ShowEnv().processCommand(args);
		  //Sys Infos
		  new SysInfo().processCommand(args);
	        
	  }
	}
