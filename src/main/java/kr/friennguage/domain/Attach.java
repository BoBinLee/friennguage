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
public class Attach {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "file_id")
	public long fileId;
	public String name;
	public long size;
	public String type;
	@Column(name = "public_id")
	public String publicId;
	public String url;
	public Timestamp created;
}
