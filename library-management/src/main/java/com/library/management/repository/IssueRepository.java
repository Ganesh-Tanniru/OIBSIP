package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.management.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}