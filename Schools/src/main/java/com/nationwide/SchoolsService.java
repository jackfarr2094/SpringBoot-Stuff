package com.nationwide;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolsService {
	int m, m1;

	@Autowired
	private SchoolsRepo repo;
		public int findMaxMarks1() {
		return repo.findMaxMarks(m);
		}
		
		public int findByDept1Marks() {
		return repo.findMarksfromDept(m1);
		}
}

