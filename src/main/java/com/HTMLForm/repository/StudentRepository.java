package com.HTMLForm.repository;

import com.HTMLForm.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Students, Long> {

}
