package cn.ice.boot.repo;

import cn.ice.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> , UserRepositoryEx{
}
