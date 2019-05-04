package com.capgemini.onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Certificates> certificate;

	public Person() {

	}

	public Person(int pid, String pname, Set<Certificates> certificate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.certificate = certificate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<Certificates> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificates> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", getPid()=" + getPid() + ", getPname()=" + getPname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
