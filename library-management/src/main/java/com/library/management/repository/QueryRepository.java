package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.management.entity.Query;

public interface QueryRepository extends JpaRepository<Query, Long> {

}