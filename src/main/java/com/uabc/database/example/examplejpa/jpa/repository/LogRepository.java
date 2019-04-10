package com.uabc.database.example.examplejpa.jpa.repository;

import com.uabc.database.example.examplejpa.jpa.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("logRepository")
public interface LogRepository extends JpaRepository<Log, Serializable> {
    public abstract Log findById(int id);
}
