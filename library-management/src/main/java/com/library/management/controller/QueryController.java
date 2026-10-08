package com.library.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.entity.Query;
import com.library.management.service.QueryService;

@RestController
public class QueryController {

    @Autowired
    private QueryService queryService;

    @PostMapping("/queries")
    public Query saveQuery(@RequestBody Query query) {
        return queryService.saveQuery(query);
    }
}