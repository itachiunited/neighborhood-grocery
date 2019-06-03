package com.ngapp.repository;

import com.ngapp.domain.Images;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Images entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ImagesRepository extends MongoRepository<Images, String> {

}
