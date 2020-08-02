package com.zzp.demo.springboot.es;

import com.zzp.demo.springboot.es.enity.es.EsBlog;
import com.zzp.demo.springboot.es.repository.es.EsBlogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootEsApplicationTests {

	@Autowired
	private EsBlogRepository esBlogRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testEs(){
		Iterable<EsBlog> all = esBlogRepository.findAll();
		Iterator<EsBlog> iterator = all.iterator();
		EsBlog next = iterator.next();
//		log.info(">>> {} <<<",next.getTitle());
		System.out.println("-----------------"+ next.getTitle());
	}
}
