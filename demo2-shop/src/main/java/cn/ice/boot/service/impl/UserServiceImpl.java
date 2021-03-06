package cn.ice.boot.service.impl;

import cn.ice.boot.dto.UserDto;
import cn.ice.boot.entity.User;
import cn.ice.boot.repo.UserRepository;
import cn.ice.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
        User user = userRepository.getOne(userDto.getId());
        if(user == null){
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        User user = userRepository.getOne(id);
        if (user == null){
            // todo
        }
        userRepository.delete(user);
    }
}
