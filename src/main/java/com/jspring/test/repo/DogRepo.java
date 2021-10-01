package com.jspring.test.repo;
import org.springframework.data.jpa.repository.Query;

import com.jspring.test.entity.DogEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DogRepo extends CrudRepository<DogEntity, Long> {
	 	@Query("select d.id, d.breed from Dog d where d.id=:id")
	    String findBreedById(Long id);

	    @Query("select d.id, d.breed from Dog d")
	    List<String> findAllBreed();

	    @Query("select d.id, d.subreed from Dog d")
	    List<String> findAllSubreed();
	}
