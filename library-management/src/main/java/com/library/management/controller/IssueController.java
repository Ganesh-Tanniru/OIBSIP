package com.library.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.entity.Issue;
import com.library.management.service.IssueService;

@RestController
public class IssueController {

    @Autowired
    private IssueService issueService;

    @PostMapping("/issues")
    public Issue issueBook(@RequestBody Issue issue) {
        return issueService.issueBook(issue);
    }
    @PutMapping("/issues/return/{issueId}")
    public Issue returnBook(@PathVariable Long issueId) {
        return issueService.returnBook(issueId);
    }
}