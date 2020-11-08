package com.ifs.leave.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave")
public class Leave {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "fullname")
 private String fullname;
 
 @Column(name = "leavetype")
 private String leavetype;
 
 @Column(name = "duration")
 private String duration;
 
 @Column(name = "reason")
 private String reason;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getLeavetype() {
	return leavetype;
}

public void setLeavetype(String leavetype) {
	this.leavetype = leavetype;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}


}