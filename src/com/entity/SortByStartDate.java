package com.entity;

import java.util.Comparator;

public class SortByStartDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int x = 0;
		
		if (getEmpYear(o1) == getEmpYear(o2)) {
			if (getEmpMonth(o1) > getEmpMonth(o2)) {
				return 1;
			} else if (getEmpMonth(o1) < getEmpMonth(o2)) {
				return -1;
			} else {
				x = getEmpName(o1).compareTo(getEmpName(o2));
				return x;
			}
		}else if (getEmpYear(o1) > getEmpYear(o2)) {
			return 1;
		}else {
			return -1;
		}
	}

	private String getEmpName(Employee o1) {
		return o1.getName().getName();
	}

	private int getEmpMonth(Employee o1) {
		return o1.getStartDate().getMonthValue();
	}

	private int getEmpYear(Employee o1) {
		return o1.getStartDate().getYear();
	}

}
