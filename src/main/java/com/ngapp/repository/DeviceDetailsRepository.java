package com.ngapp.repository;

import com.ngapp.domain.DeviceDetails;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the DeviceDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DeviceDetailsRepository extends MongoRepository<DeviceDetails, String> {

}
