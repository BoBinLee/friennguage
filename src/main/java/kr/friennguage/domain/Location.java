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
@Table(name = "location_category")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "location_id")
	public int locationId;
	@Column(name = "parent_location_id")
	public int parentLocationId;
	public String name;
	public int depth;
	public Timestamp created;
}
