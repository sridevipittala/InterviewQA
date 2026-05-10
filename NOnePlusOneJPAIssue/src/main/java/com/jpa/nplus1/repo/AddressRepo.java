package com.jpa.nplus1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.nplus1.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

}
