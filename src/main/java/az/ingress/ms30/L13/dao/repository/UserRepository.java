package az.ingress.ms30.L13.dao.repository;

import az.ingress.ms30.L13.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
