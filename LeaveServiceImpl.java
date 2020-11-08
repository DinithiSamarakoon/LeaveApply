package com.ifs.leave.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifs.leave.dao.LeaveDao;
import com.ifs.leave.model.Leave;


	@Service
	@Transactional
	public class LeaveServiceImpl implements LeaveService {
	 
		LeaveDao leaveDao;
	 
	 @Autowired
	 public void setLeaveDao(LeaveDao leaveDao) {
	  this.leaveDao = leaveDao;
	 }

	 public List<Leave> listAllLeaves() {
	  return leaveDao.listAllLeaves();
	 }

	 public void saveOrUpdate(Leave leave) {
		 leaveDao.saveOrUpdate(leave);
	 }

	 public Leave findLeaveById(int id) {
	  return leaveDao.findLeaveById(id);
	 }

	 public void deleteLeave(int id) {
		 leaveDao.deleteLeave(id);
	 }
}





