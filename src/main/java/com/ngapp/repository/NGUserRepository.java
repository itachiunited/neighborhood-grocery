package com.ngapp.repository;

import com.ngapp.domain.NGUser;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the NGUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NGUserRepository extends MongoRepository<NGUser, String> {

}
