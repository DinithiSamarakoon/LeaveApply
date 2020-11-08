package com.ifs.leave.service;
import java.util.List;

import com.ifs.leave.model.Leave;

public interface LeaveService {

	public List<Leave> listAllLeaves();
	 
	 public void saveOrUpdate(Leave leave);
	 
	 public Leave findLeaveById(int id);
	 
	 public void deleteLeave(int id);
}

