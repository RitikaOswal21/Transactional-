package com.dailycodebuffer.transaction.entity;

	



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long employeeId;
	    private String empName;
	    private String email;
	    private Long departmentId;
	    
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
		public Long getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}
		public String getEmployeeId() {
			// TODO Auto-generated method stub
			return null;
		}
	}

