package com.codekul.Spring6DecBatch.jpa.relaships.repository;

import com.codekul.Spring6DecBatch.jpa.relaships.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
