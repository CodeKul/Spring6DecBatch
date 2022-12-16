package com.codekul.Spring6DecBatch.jpa.relaships.repository;

import com.codekul.Spring6DecBatch.jpa.relaships.entity.Capital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapitalRepository extends JpaRepository<Capital,Long> {
}
