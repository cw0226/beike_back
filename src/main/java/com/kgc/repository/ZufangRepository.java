package com.kgc.repository;

import com.kgc.document.Zufang;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ZufangRepository{
    Map<String, Object> getZufangList(String params,String area,String street,Integer rental,String orderBy,
                                      String rent1,String rent2,String rent3,String rent4,String rent5,
                                      String rent6,String rent7,String room1,String room2,String room3,
                                      String room4,Integer pageNow, Integer pageSize) throws IOException, SolrServerException;

}
