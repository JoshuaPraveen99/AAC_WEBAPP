package com.aac.webapp.entity;

import com.aac.webapp.dto.Consumer;
import jakarta.persistence.*;

@Entity
@Table(name="consumerdetails")
public class ConsumerDetails {
    @Column(name = "id")
    private int id;
    @OneToOne
    @JoinColumn(name = "consumerid")
    private ConsumerEntity consumerEntity;
    @Column(name = "project")
    private String project;
    @Column(name = "salary")
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConsumerEntity getConsumerEntity() {
        return consumerEntity;
    }

    public void setConsumerEntity(ConsumerEntity consumerEntity) {
        this.consumerEntity = consumerEntity;
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
