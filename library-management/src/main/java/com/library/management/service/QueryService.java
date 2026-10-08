package com.library.management.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.library.management.entity.Query;
import com.library.management.repository.QueryRepository;

@Service
@AllArgsConstructor
public class QueryService {

    private final QueryRepository queryRepository;

    public Query saveQuery(Query query) {
        return queryRepository.save(query);
    }
}