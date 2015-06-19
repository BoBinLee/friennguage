package kr.friennguage.repository;

import kr.friennguage.domain.Attach;
import kr.friennguage.domain.UserNotification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNotificationRepository extends JpaRepository<UserNotification, Long> {

}
