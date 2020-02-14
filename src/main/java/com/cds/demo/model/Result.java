package com.cds.demo.model;

import java.util.List;

public class Result {

    private List<User> results;

    public Result(List<User> results) {
        this.results = results;
    }

    public List<User> getResults() {
        return results;
    }
}
