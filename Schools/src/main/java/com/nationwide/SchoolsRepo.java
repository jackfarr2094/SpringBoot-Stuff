package com.nationwide;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchoolsRepo extends JpaRepository<Schools, Integer> {
	public ArrayList<Schools> findAll();
	public Schools findByregno(int x);
	public ArrayList<Schools> findByName(String x);
	public ArrayList<Schools> findByDept(String dname);
	public ArrayList<Schools> findByDeptAndSubject(String dname, String Subject);
	public ArrayList<Schools> findByregnoOrMarks(int r, int m);
	public ArrayList<Schools> findByMarksGreaterThan(int m);
	public ArrayList<Schools> findByMarksBetween(int m1, int m2);
	public ArrayList<Schools> findByMarksGreaterThanEqual(int e);
	public int findMaxMarks(int m);
	public int findMarksfromDept(int m1);
	
	
}

