package pet.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pet.store.entity.Employee;

public interface CustomerDao extends JpaRepository<Employee, Long>{
}