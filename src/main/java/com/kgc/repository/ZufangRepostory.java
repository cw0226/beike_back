package com.kgc.repository;

import com.kgc.document.Zufang;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface ZufangRepostory extends SolrCrudRepository<Zufang,String> {

    long countByStreetOrAreaOrVillage(String street,String area,String village);

    List<Zufang> findByStreetOrAreaOrVillage(String street, String area, String village, PageRequest pageRequest);
}
