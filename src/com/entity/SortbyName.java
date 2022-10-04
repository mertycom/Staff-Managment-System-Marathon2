package com.entity;

import java.util.Comparator;

public class SortbyName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (getEmpName(o1).equals(getEmpName(o2))) {
			int x = getEmpId(o1).compareTo(getEmpId(o2));
			return x;
		} else {
			int x = (getEmpName(o1) + getEmpSurName(o1)).compareTo((getEmpName(o2) + getEmpSurName(o2)));
			return x;
		}
	}

	private String getEmpSurName(Employee o1) {
		return o1.getName().getSurName();
	}

	private String getEmpId(Employee o1) {
		return o1.getRegistrationNumber();
	}

	private String getEmpName(Employee o1) {
		return o1.getName().getName();
	}
}
