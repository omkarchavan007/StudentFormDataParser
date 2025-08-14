package com.HTMLForm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity

@Getter
@Setter
@ToString

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String FirstName;
    private  String LastName;
    private String Email;
    private String Gender;
    private String City;
    private String Course;

    private int PassoutYear;
    private String Branch;


}
