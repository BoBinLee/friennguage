package kr.friennguage.repository;

import kr.friennguage.domain.Attach;
import kr.friennguage.domain.Language;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
