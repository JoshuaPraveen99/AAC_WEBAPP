package com.aac.webapp.repository;

import com.aac.webapp.dto.Consumer;
import com.aac.webapp.entity.ConsumerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<ConsumerEntity,Integer> {

    public ConsumerEntity findById(int id);
}
