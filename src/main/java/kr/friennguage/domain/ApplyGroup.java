package kr.friennguage.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "apply_group")
public class ApplyGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "apply_id")
	public long applyId;
	@Column(name = "user_id")
	public long userId;
	@Column(name = "group_id")
	public long groupId;
	public String status;
	public Timestamp created;
}
