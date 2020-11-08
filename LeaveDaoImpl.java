package com.ifs.leave.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ifs.leave.model.Leave;

@Repository
public class LeaveDaoImpl implements LeaveDao {

 @Autowired
 private SessionFactory sessionFactory;

 private Session getSession(){
  return sessionFactory.getCurrentSession();
 }
 
 @SuppressWarnings("unchecked")
 public List<Leave> listAllLeaves() {
  Criteria criteria = getSession().createCriteria(Leave.class);
  return (List<Leave>) criteria.list();
 }

 public void saveOrUpdate(Leave leave) {
  getSession().saveOrUpdate(leave);
 }

 public Leave findCustomerById(int id) {
	 Leave Leave = (Leave) getSession().get(Leave.class, id);
  return Leave;
 }

 public void saveOrUpdate(int id) {
	 Leave leave = (Leave) getSession().get(Leave.class, id);
  getSession().delete(leave);
 }

public Leave findLeaveById(int id) {
	// TODO Auto-generated method stub
	 Leave leave = (Leave) getSession().get(Leave.class, id);
	  return leave;
}

public void deleteLeave(int id) {
	// TODO Auto-generated method stub
	 Leave leave = (Leave) getSession().get(Leave.class, id);
	  getSession().delete(leave);
	
}
}