package kr.friennguage.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserNotification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "noti_id")
	public long notiId;
	@Column(name = "user_id")
	public long userId;
	@Column(name = "token_id")
	public String tokenId;
	@Column(name = "push_yn")
	public String pushYn;
	public Timestamp created;
	public Timestamp updated;
}
