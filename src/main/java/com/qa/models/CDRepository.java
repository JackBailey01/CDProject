package com.qa.models;

import org.springframework.data.repository.CrudRepository;

public interface CDRepository extends CrudRepository<CD, Long> {
    CD findByTitle(String title);
}
