package kr.friennguage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "auth_id")
	public int authId;
	public String name;
}
