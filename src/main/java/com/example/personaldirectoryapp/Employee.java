package com.example.personaldirectoryapp;

import jakarta.persistence.*;

import java.time.LocalTime;


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
    @Column(name="department")
    private String department;

    @Column(name="start_date")
    private LocalTime startDate;

    @Column(name="end_date")
    private LocalTime endDate;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String address, String skill,
                    Integer skillRate, LocalTime startDate, LocalTime endDate, String department) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.skill = skill;
        this.skillRate = skillRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.department = department;
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

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalTime endDate) {
        this.endDate = endDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}