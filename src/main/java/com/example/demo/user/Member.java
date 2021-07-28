package com.example.demo.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
@SequenceGenerator(
		name = "mem_seq_gen",					// sequence generator 이름 
		sequenceName = "mem_seq",				// sequence 이름 
		allocationSize = 1						// 메모리를 통해 할당할 범위 사이즈 	
)
public class Member {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,		// 사용할 전략을 sequence로 선택 
			generator = "mem_seq_gen"				// sequence generator 선택 
	)	
	private Long id;
	private String pwd;
	private String name;
	private LocalDate dob;	// date of birth
	
	public Member() {
		
	}

	public Member(String pwd, String name, LocalDate dob) {
		this.pwd = pwd;
		this.name = name;
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", dob=" + dob + "]";
	}
	
}
