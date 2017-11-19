package me.ho3.CL.until;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

//import sun.jvmstat.monitor.MonitorException;
//import sun.jvmstat.monitor.MonitoredHost;
//import sun.jvmstat.monitor.MonitoredVm;
//import sun.jvmstat.monitor.MonitoredVmUtil;
//import sun.jvmstat.monitor.VmIdentifier;

public class NetEaseControl {
 
	private static final String Lname = "WPFLauncher.exe";
	
	
	public static void CheckStart() throws Exception{
		if(!isRunning(Lname))
		 Runtime.getRuntime().exec("C:\\Program Files (x86)\\Netease\\MCLauncher\\"+Lname);			
	}
	
	public static void Kill() throws Exception{	
	//	Runtime.getRuntime().exec("cmd.exe /c taskkill /pid "+getProcess(net.minecraft.client.main.Main.class)+" -t -f");		
	}
	
	

	
	public static boolean isRunning(String processName)
    {
       
        BufferedReader bufferedReader = null;
        try
        {
            Process proc = Runtime.getRuntime().exec("tasklist /FI \"IMAGENAME eq "
                    + processName
                    + "\"");
            bufferedReader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = bufferedReader.readLine()) != null)
            {
                if (line.contains(processName)) //≈–∂œ «∑Ò¥Ê‘⁄
                {
                    return true;
                }
            }
            return false;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
        finally
        {
            if (bufferedReader != null)
            {
                try
                {
                    bufferedReader.close();
                }
                catch (Exception ex)
                {
                }
            }
        } 
    }
}
