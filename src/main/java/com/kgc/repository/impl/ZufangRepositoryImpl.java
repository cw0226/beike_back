package com.kgc.repository.impl;

import com.kgc.document.Zufang;
import com.kgc.repository.ZufangRepository;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ZufangRepositoryImpl implements ZufangRepository {
    @Resource
    private SolrClient solrClient;
    @Override
    public Map<String, Object> getZufangList(String params,String area,String street,Integer rental,String orderBy,
                                                String rent1,String rent2,String rent3,String rent4,String rent5,
                                                String rent6,String rent7,String room1,String room2,String room3,
                                                 String room4,Integer start, Integer pageSize)
                                                throws IOException, SolrServerException {
        SolrQuery solrQuery = new SolrQuery();

        //如果参数都为空，则查询全部
        if(params==null && area==null && street==null||street=="" && rental==null  ){
            solrQuery.setQuery("*:*");
        }else{ //有不为空的
            if(params!=null && params!=""){//搜索框参数
                solrQuery.setQuery("street:"+params+" or area:"+params+" or village:"+params);
            }
            if(area!=null && area!=""){//区域
                solrQuery.setQuery("area:"+area);
            }
            if(street!=null && street!=""){//街道
                solrQuery.setQuery("street:"+street);
            }
            if (rental!=null){//租赁方式（1:整租，2：合租）
                solrQuery.setQuery("rental:"+rental);
            }
        }
        //租金查询参数
        String queryOfRent;
        //租金
        if (rent1!=null){
            solrQuery.addFilterQuery("rent:"+rent1);
        }
        if (rent2!=null){
            solrQuery.addFilterQuery("rent:"+rent2);
        }
        if (rent3!=null){
            solrQuery.addFilterQuery("rent:"+rent3);
        }
        if (rent4!=null){
            solrQuery.addFilterQuery("rent:"+rent4);
        }
        if (rent5!=null){
            solrQuery.addFilterQuery("rent:"+rent5);
        }
        if (rent6!=null){
            solrQuery.addFilterQuery("rent:"+rent6);
        }
        if (rent7!=null){
            solrQuery.addFilterQuery("rent:"+rent7);
        }
        //户型
        if(room1!=null){
            solrQuery.addFilterQuery("room:"+room1);
        }
        if(room2!=null){
            solrQuery.addFilterQuery("room:"+room2);
        }
        if(room3!=null){
            solrQuery.addFilterQuery("room:"+room3);
        }
        if(room4!=null){
            solrQuery.addFilterQuery("room:"+room4);
        }

        //排序
        if(orderBy!=null && orderBy!=""){
            solrQuery.addSort(orderBy, SolrQuery.ORDER.desc);
        }

        solrQuery.setStart(start);
        solrQuery.setRows(pageSize);
        //获取查询数据
        QueryResponse zufang = solrClient.query("zufang",solrQuery);
        //获取租房列表
        List<Zufang> zufangBeans = zufang.getBeans(Zufang.class);
        //获取列表总条数
        long numFound = zufang.getResults().getNumFound();

        Map<String,Object> map = new HashMap<>();
        map.put("numFound",numFound);
        map.put("list",zufangBeans);
        return map;
    }
}
