package com.nationwide;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBFController {
	
	@Autowired
	private SchoolsRepo repo;
		
	@GetMapping("/showAll")
	public ArrayList<Schools> Showall() {
		return repo.findAll();
	}
	@GetMapping("/showReg/{r}")
	public Schools ShowRegno(@PathVariable int r) {
		return repo.findByregno(r);
	}
	@GetMapping("/findByName/{n}")
	public ArrayList<Schools> findByName(@PathVariable String n) {
		return repo.findByName(n);
	}
	@GetMapping("/findByDept/{d}")
	public ArrayList<Schools> findByDept(@PathVariable String d) {
		return repo.findByDept(d);
	}
	@GetMapping("/findByDeptandSubject/{de}/{s}")
	public ArrayList<Schools> findByDeptAndSubject(@PathVariable String de, @PathVariable String s) {
		return repo.findByDeptAndSubject(de, s);
	}
	@GetMapping("/findByRegnoOrMarks/{r}/{m}")
	public ArrayList<Schools> findByRegnoOrMarks(@PathVariable int r, @PathVariable int m) {
		return repo.findByregnoOrMarks(r, m);
	}
	@GetMapping("/findByMarksGreaterThan/{m}")
	public ArrayList<Schools> findByMarksGreaterThan(@PathVariable int m) {
		return repo.findByMarksGreaterThan(m);
	}
	@GetMapping("/findByMarksBetween/{m1}/{m2}")
	public ArrayList<Schools> findByMarksBetween(@PathVariable int m1, @PathVariable int m2) {
		return repo.findByMarksBetween(m1, m2);
	}
	@GetMapping("/findByMarksGreaterThanEqual/{e}")
	public ArrayList<Schools> findByMarksGreaterThanEqual(@PathVariable int e) {
		return repo.findByMarksGreaterThanEqual(e);
	}
	
	@GetMapping("/findByMaxMarks")
	public int findByMaxMarks (@PathVariable int m) {
		return repo.findMaxMarks(m);
	}
	@GetMapping("/findByMaxMarks/Dept1")
	public int findByDept1Marks (@PathVariable int m1) {
		return repo.findMarksfromDept(m1);
	}
	
	@PostMapping("/Save3/{RegNo}/{Name}/{Marks}/{Subject}/{Dept}")
	public void Savedata (@PathVariable int RegNo, @PathVariable String Name, @PathVariable int Marks, @PathVariable String Subject, @PathVariable String Dept) {
		Schools Ref = new Schools();
		Ref.setRegno(RegNo);
		Ref.setName(Name);
		Ref.setMarks(Marks);
		Ref.setSubject(Subject);
		Ref.setDept(Dept);
		repo.save(Ref);
	}
		
	@RequestMapping("/save3")
	public String Savedata (@RequestBody Schools ref) {
		if(ref.getRegno()==15) {
			return "Sorry Mr Shafeeq";
			} else {
				repo.save(ref);
				return "Record saved";
			}
		}
	}

