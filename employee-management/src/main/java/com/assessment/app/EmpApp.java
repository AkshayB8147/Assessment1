package com.assessment.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.assessment.exceptions.EmpNotFoundException;

public class EmpApp {
	public void insert(Emp e) {
		if(EmpDb.db.containsKey(e))
			Emp.Db.
	}
	
	
	public String findEmpById(int empId) {
		
			if(EmpDb.db.containsKey(empId)); 
			return EmpDb.db.get(empId).getDetails();
			else throw new EmpNotFoundException();
	}
	
	
	public String update(Emp e) {
		if(EmpDb.db.containsKey(e))
			return "Person already exists";
		return null;
	
	}
	
	
	public void delete(int id) {
		if(EmpDb.db.containsKey(id))
			EmpDb.db.remove(id);
	}
	
	
	public List<String> listAll(){
		
		List<String> emps=new ArrayList<String>();
		Set<Integer> keys=EmpDb.db.keySet();
		
		for(Integer key:keys) {
			Emp e=EmpDb.db.get(key);
			if(e.getCity().equals(getClass()))
				emps.add(e.getDetails());
		}
		return emps;
	}
}
