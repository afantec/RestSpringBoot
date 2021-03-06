package br.com.erudio.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.erudio.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Modifying
	@Query("UPDATE Person p SET p.enabled = false WHERE p.id =:id")
	void disablePersons(@Param("id") Long id);
	
	@Modifying
	@Query("UPDATE Person p SET p.enabled =:bool WHERE p.id =:id")
	void enablePersons(@Param("id") Long id, @Param("bool") boolean bool);
	
	@Query("SELECT p FROM Person p WHERE p.firstName LIKE LOWER(CONCAT ('%', :firstName, '%'))")
	Page<Person> findPersonByName(@Param("firstName") String firstName, Pageable pageable);
}