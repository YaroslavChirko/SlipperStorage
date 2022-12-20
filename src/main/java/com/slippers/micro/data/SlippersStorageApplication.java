package com.slippers.micro.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.slippers.micro.data.controller.SlipperDAOController;
import com.slippers.micro.data.model.Slipper;
import com.slippers.micro.data.repo.SlipperJpaRepository;

@SpringBootApplication(scanBasePackageClasses = {SlipperDAOController.class, Slipper.class, SlipperJpaRepository.class})
@EnableJpaRepositories(basePackageClasses = {SlipperJpaRepository.class})
public class SlippersStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlippersStorageApplication.class, args);
	}

}
