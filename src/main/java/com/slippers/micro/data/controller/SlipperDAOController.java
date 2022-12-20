package com.slippers.micro.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slippers.micro.data.model.Slipper;
import com.slippers.micro.data.repo.SlipperJpaRepository;

@RestController
@RequestMapping(path = "/slippers")
public class SlipperDAOController {
	@Autowired
	private SlipperJpaRepository slipperRepository;
	
	@GetMapping
	public ResponseEntity<List<Slipper>> getSlippers(){
		List<Slipper> slippers = slipperRepository.findAll();
		return new ResponseEntity<List<Slipper>>(slippers, HttpStatusCode.valueOf(200));
	}
	
	
	@PostMapping
	public HttpStatusCode postSlipper(@RequestBody(required = false) Slipper slipper) {
		if(slipper == null) return HttpStatusCode.valueOf(400);
		System.out.println(slipper);
		slipperRepository.saveAndFlush(slipper);
		return HttpStatusCode.valueOf(200);
	}
	
	
}
