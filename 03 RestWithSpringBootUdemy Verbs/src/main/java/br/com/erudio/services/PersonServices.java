package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}	
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("André");
		person.setLastName("Silva");
		person.setAddress("Cafeara - Paraná - Brasil");
		person.setGender("Macho");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 1; i <= 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);			
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		if(i == 1) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("André");
			person.setLastName("Silva");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Masculino");
		}else if(i == 2) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Fabiana");
			person.setLastName("Silva");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Feminino");
		}else if(i == 3) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Antonio");
			person.setLastName("Neto");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Masculino");
		}else if(i == 4) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Antonio");
			person.setLastName("Garcia");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Masculino");
		}else if(i == 5) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Maria");
			person.setLastName("Garcia");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Feminino");
		}else if(i == 6) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Rembo");
			person.setLastName("Silva");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Masculino");
		}else if(i == 7) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Bradock");
			person.setLastName("Silva");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Masculino");
		}else if(i == 8) {
			person.setId(counter.incrementAndGet());
			person.setFirstName("Tina");
			person.setLastName("Thunner");
			person.setAddress("Some address in Brasil" + i);
			person.setGender("Feminino");
		}

		return person;
	}
}
