package com.torryharris.collections.driver;

import java.util.Iterator;
import java.util.TreeSet;

import com.torryharris.collections.model.Person;
import com.torryharris.collections.model.PersonSortByFirstNameComparator;

public class TreeSetDemo {
	
	public static void main(String []args) {
		
		TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
		
		intTreeSet.add(19);
		intTreeSet.add(11);
		intTreeSet.add(17);
		intTreeSet.add(9);
		intTreeSet.add(15);
		intTreeSet.add(21);
		
		System.out.println(intTreeSet);
		
		intTreeSet.add(4);
		intTreeSet.add(10);
		
		Iterator<Integer> itr = intTreeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<Person> personTreeSet = new TreeSet<Person>();
		
		Person p1 = new Person("Luffy","Monkey D.",123412341234L,"East Blue");
		Person p2 = new Person("Itachi","Uchiha",100823409439L,"Konoha");
		Person p3 = new Person("Naruto","Uzumaki",1234123413424L,"Konoha");
		Person p4 = new Person("Goku","Son",5447123413424L,"Japan");
		Person p5 = new Person("Pirate","King",123412341234L,"East Blue");
		
		personTreeSet.add(p1);
		personTreeSet.add(p2);
		personTreeSet.add(p3);
		personTreeSet.add(p4);
		personTreeSet.add(p5);
		
		for(Person p:personTreeSet) {
			System.out.println(p);
		}
		
		
		TreeSet<Person> nameTreeSet = new TreeSet<Person>(new PersonSortByFirstNameComparator()); 
		
			nameTreeSet.add(p1);
			nameTreeSet.add(p2);
			nameTreeSet.add(p3);
			nameTreeSet.add(p4);
			nameTreeSet.add(p5);
		
			System.out.println("--- Tree Set by First Name ---");
			for(Person p:nameTreeSet) {
				System.out.println(p);
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
