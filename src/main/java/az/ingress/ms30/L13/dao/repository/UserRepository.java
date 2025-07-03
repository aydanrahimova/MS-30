package az.ingress.ms30.L13.dao.repository;

import az.ingress.ms30.L13.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
