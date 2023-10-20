package com.aac.webapp.dto;

import org.springframework.stereotype.Component;


public class ConsumerReport {
    private String name;
    private String profession;
    private String project;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
    public ConsumerReport(String name, String profession, String project, int salary) {
        this.name = name;
        this.profession = profession;
        this.project = project;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
