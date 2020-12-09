package br.com.vieirarodrigo.acceleration.business.object;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.acceleration.DTO.AccelerationDTO;
import br.com.vieirarodrigo.acceleration.repository.AccelerationRepository;
import br.com.vieirarodrigo.acceleration.repository.vo.AccelerationVO;

@Component
public class AccelerationBO {
	@Autowired
	private AccelerationRepository repository;
	public AccelerationVO save(AccelerationDTO acceleration) {
		return repository.save(AccelerationVO.builder()
					.name(acceleration.getName())
					.slug(acceleration.getSlug())
					.challengeId(acceleration.getChallengeId())
					.created(acceleration.getCreated())
					.build());
	}
	public Optional<AccelerationVO> findById(int id) {
		return repository.findById(id);
	}
	public Optional<AccelerationVO> findByName(String name) {
		return Optional.ofNullable(repository.findByName(name));
	}
	
}