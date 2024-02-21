package com.dailycodebuffer.transaction.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVO {

    private String empName;
    private String email;
    private String departmentName;
	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	}
