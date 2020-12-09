package br.com.vieirarodrigo.acceleration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vieirarodrigo.acceleration.repository.vo.AccelerationVO;

public interface AccelerationRepository extends JpaRepository<AccelerationVO, Integer>{
	AccelerationVO findByName(String name);
}