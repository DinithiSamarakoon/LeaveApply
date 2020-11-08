package com.ifs.leave.dao;
import java.util.List;

import com.ifs.leave.model.Leave;

public interface LeaveDao {

	public List<Leave> listAllLeaves();
	 
	 public void saveOrUpdate(Leave leave);
	 
	 public Leave findLeaveById(int id);
	 
	 public void deleteLeave(int id);
}





 
 
 
