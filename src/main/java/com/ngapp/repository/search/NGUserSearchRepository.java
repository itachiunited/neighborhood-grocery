package com.ngapp.repository.search;

import com.ngapp.domain.NGUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link NGUser} entity.
 */
public interface NGUserSearchRepository extends ElasticsearchRepository<NGUser, String> {
}
