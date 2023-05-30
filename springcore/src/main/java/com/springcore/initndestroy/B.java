package com.springcore.initndestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean, DisposableBean {
	
	private int machineId;
	private String machinename;
	
	
	public int getMachineId() {
		return machineId;
	}


	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}


	public String getMachinename() {
		return machinename;
	}


	public void setMachinename(String machinename) {
		this.machinename = machinename;
	}


	@Override
	public String toString() {
		return "B [machineId=" + machineId + ", machinename=" + machinename + "]";
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Insidde Destroy using impliments destroy interface");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Insidde init using impliments init interface");
		
	}

}
