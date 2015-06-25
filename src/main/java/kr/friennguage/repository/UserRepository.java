package kr.friennguage.repository;

import kr.friennguage.domain.Attach;
import kr.friennguage.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUid(String uid);

}
