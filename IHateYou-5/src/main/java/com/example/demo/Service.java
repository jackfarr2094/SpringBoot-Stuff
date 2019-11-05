package com.example.demo;

public class Service {
	Record recs[] = new Record [3];
	public Service() {
		
		recs[0] = new Record(24, "Shafeeq", 75);
		recs[1] = new Record(86, "Peter", 89);
		recs[2] = new Record(87, "Jim", 72);
	}
		
		public Record ShowRecord (int a) {
			return recs[a];
			}
public Record findRecord(int b) {
	int i = 0;
	for (; i < recs.length; i ++)
		
		if(recs[i].getRegNo()==b) {
			return recs[i];
			
public AllRecord allRecords[] {
		allrecs[0] = new
		return allRecs;
			}
		}
	return null;
		}
	}
