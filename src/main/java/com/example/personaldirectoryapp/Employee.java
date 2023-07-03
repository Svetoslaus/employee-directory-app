package com.example.personaldirectoryapp;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name ="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;
    @Column(name = "skill")
    private String skill;
    @Column(name = "skill_rate")
    private Integer skillRate;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String address, String skill, Integer skillRate) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.skill = skill;
        this.skillRate = skillRate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSkillRate() {
        return skillRate;
    }

    public void setSkillRate(Integer skillRate) {
        this.skillRate = skillRate;
    }


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
