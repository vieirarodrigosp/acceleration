package br.com.vieirarodrigo.acceleration.repository.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "ACCELERATION")
public class AccelerationVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String slug;
	@Column(name = "CHALLENGE_ID")
	private int challengeId;
	@Column(name = "CREATED_AT")
	private Date created;
}
