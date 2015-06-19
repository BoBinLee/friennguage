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
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "group_id")
	public long groupId;
	@Column(name = "user_id")
	public long userId;
	@Column(name = "location_id")
	public int locationId;
	@Column(name = "language_id")
	public int languageId;
	public String title;
	public String content;
	public Timestamp created;
	public Timestamp updated;
}
