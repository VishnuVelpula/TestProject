package com.SpringBoot.Springfirstapp.respository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Springfirstapp.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, BigInteger>{

}
