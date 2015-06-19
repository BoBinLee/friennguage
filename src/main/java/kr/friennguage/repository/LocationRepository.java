package kr.friennguage.repository;

import kr.friennguage.domain.Attach;
import kr.friennguage.domain.Location;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location, Integer>{

}
