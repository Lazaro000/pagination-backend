package io.lazaro.pagination.service;

import io.lazaro.pagination.domain.User;
import org.springframework.data.domain.Page;

/**
 * @author Lázaro
 * @version 1.0
 * @since 08/07/2022
 */
public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
