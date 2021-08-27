package me.delete.controllers;

import me.delete.converters.UserMapper;
import me.delete.domain.UserCommand;
import me.delete.entities.User;

public class UserController {
    User saveUser(UserCommand command) {
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
