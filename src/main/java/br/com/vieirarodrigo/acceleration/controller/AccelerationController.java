package br.com.vieirarodrigo.acceleration.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.acceleration.DTO.AccelerationDTO;
import br.com.vieirarodrigo.acceleration.business.object.AccelerationBO;
import br.com.vieirarodrigo.acceleration.repository.vo.AccelerationVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class AccelerationController {
	@Autowired
	private AccelerationBO accelerationBO;
	@ApiOperation(value="This service creates a new acceleration in the database.")
	@PostMapping(path = "/v1/accelerations")
	public @ResponseBody AccelerationVO save(@RequestBody AccelerationDTO acceleration) {
		return accelerationBO.save(acceleration);
	}
	@ApiOperation(value="This service seeks to acceleration by id.")
	@GetMapping(path = "/v1/accelerations/id/{id}")
	public @ResponseBody Optional<AccelerationVO> findById(@PathVariable int id) {
		return accelerationBO.findById(id);
	}
	@ApiOperation(value="This service seeks to acceleration by name.")
	@GetMapping(path = "/v1/accelerations/name/{name}")
	public @ResponseBody Optional<AccelerationVO> findByName(@PathVariable String name) {
		return accelerationBO.findByName(name);
	}
}
