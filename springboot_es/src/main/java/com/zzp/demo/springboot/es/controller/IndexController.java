package com.zzp.demo.springboot.es.controller;

import com.zzp.demo.springboot.es.enity.mysql.MysqlBlog;
import com.zzp.demo.springboot.es.repository.mysql.MysqlBlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    MysqlBlogRepository mysqlBlogRepository;

    @GetMapping("/")
    public String index()
    {
        List<MysqlBlog> all = mysqlBlogRepository.findAll();
        System.out.println("【查询所有的博客数据】all={}"+ all.size());
        return "index.html";
    }
}
