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
@Table(name = "language_category")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "language_id")
	public int languageId;
	public String name;
	public Timestamp created;
}
