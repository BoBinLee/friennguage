package kr.friennguage.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;


@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	public long userId;
	@Column(name = "auth_id")
	public int authId;
	@Column(name = "u_id")
	public String uid;
	public String name;
	public String sex;
	public String age;
	public String job;
	@Column(name = "profile_img")
	public long profileImg;
	@Column(name = "location_id")
	public int locationId;
	@Column(name = "language_id")
	public int languageId;
	@Column(name = "favor_language_id")
	public int favorLanguageId;
	public String content;
	public Timestamp created;
	
	@Transient
	public String email;
	@Transient
	public String password;
}
