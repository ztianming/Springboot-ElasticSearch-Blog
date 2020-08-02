package com.zzp.demo.springboot.es.repository.es;

import com.zzp.demo.springboot.es.enity.es.EsBlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, Integer> {
}
