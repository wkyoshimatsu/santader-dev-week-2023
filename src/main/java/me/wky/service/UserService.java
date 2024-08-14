package me.wky.service;

import me.wky.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
