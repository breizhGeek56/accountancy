package com.mycompany.myapp.repository.search;
import com.mycompany.myapp.domain.Shipment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Shipment} entity.
 */
public interface ShipmentSearchRepository extends ElasticsearchRepository<Shipment, String> {
}
