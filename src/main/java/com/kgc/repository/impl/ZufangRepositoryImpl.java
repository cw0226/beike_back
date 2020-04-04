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
        if(params==null || params == "" && area==null && street==null||street=="" && rental==null  ){
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
            //开启高亮
            solrQuery.setHighlight(true);
            solrQuery.addHighlightField("street");
            solrQuery.addHighlightField("area");
            solrQuery.addHighlightField("village");
            solrQuery.setHighlightSimplePre("<font color='orange'>");
            solrQuery.setHighlightSimplePost("</font>");
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

        QueryResponse queryResponse = solrClient.query("zufang",solrQuery);
        //获取普通结果集
        List<Zufang> zufangList = queryResponse.getBeans(Zufang.class);
        //获取高亮结果集
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        if (highlighting != null){
            for (Zufang zufang:zufangList){
                List<String> street1 = highlighting.get(zufang.getId()).get("street");
                List<String> area1 = highlighting.get(zufang.getId()).get("area");
                List<String> village1 = highlighting.get(zufang.getId()).get("village");
                if (street1 != null && street1.size()>0){
                    zufang.setStreet(street1.get(0));
                }
                if (area1 != null && area1.size() >0){
                    zufang.setArea(area1.get(0));
                }
                if(village1 != null && village1.size() >0){
                    zufang.setVillage(village1.get(0));
                }

            }
        }

        //获取列表总条数
        long numFound = queryResponse.getResults().getNumFound();

        Map<String,Object> map = new HashMap<>();
        map.put("numFound",numFound);
        map.put("list",zufangList);
        return map;
    }
}
