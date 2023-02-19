package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entity.Services;

public interface ServiceRepository extends JpaRepository<Services, Integer> {

	// @Query("from Services where serviceCost =:s%")
	// int getServiceByCost(@Param("s") int serviceCost);

}
