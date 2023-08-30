package com.aac.webapp.repository;

import com.aac.webapp.dto.Consumer;
import com.aac.webapp.dto.ConsumerReport;
import com.aac.webapp.dto.ConsumerReportInt;
import com.aac.webapp.entity.ConsumerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository extends JpaRepository<ConsumerEntity,Integer> {

    public ConsumerEntity findById(int id);

    @Query(value = "SELECT c.name,c.profession,cd.project,cd.salary FROM consumer c JOIN consumerdetails cd ON c.id=cd.consumerid",nativeQuery = true)
    public List<ConsumerReportInt> getConsumerdetails();
}
