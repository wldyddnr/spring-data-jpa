package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

//@Repository 생략가능
public interface MemberRepository extends JpaRepository<Member, Long> {
}
