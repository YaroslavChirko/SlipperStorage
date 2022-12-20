package com.slippers.micro.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slippers.micro.data.model.Slipper;

@Repository
public interface SlipperJpaRepository extends JpaRepository<Slipper, String>{}
