package ku.cs.HWcafe.repository;

import ku.cs.HWcafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    //SELECT * FROM Member WHERE username = 'username'
    Member findByUsername(String username);
}
