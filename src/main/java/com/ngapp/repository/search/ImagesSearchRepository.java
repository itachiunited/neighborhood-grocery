package com.ngapp.repository.search;

import com.ngapp.domain.Images;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Images} entity.
 */
public interface ImagesSearchRepository extends ElasticsearchRepository<Images, String> {
}
