package com.ngapp.repository.search;

import com.ngapp.domain.DeviceDetails;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link DeviceDetails} entity.
 */
public interface DeviceDetailsSearchRepository extends ElasticsearchRepository<DeviceDetails, String> {
}
