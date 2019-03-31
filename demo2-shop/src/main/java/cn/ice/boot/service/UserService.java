package cn.ice.boot.service;

import cn.ice.boot.dto.UserDto;
import cn.ice.boot.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> findAllUsers(Pageable pageable);

    User load(Long id);

    User save(UserDto userDto);

    void delete(Long id);
}
