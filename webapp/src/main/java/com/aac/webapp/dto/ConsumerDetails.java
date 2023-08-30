package com.aac.webapp.dto;

import org.springframework.stereotype.Component;

@Component
public class ConsumerDetails {
    private int id;
    private int consumerid;
    private String project;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(int consumerid) {
        this.consumerid = consumerid;
    }



    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
