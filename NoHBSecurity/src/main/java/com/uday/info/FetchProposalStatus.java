package com.uday.info;

import java.io.Serializable;
import java.util.List;

public class FetchProposalStatus extends ResultInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String usercode;
	
	List<DispositionStatus> list;

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public List<DispositionStatus> getDispositionStatusList() {
		return list;
	}

	public void setDispositionStatusList(List<DispositionStatus> list) {
		this.list = list;
	}
	
	

}
