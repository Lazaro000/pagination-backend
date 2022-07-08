package io.lazaro.pagination.service;

import io.lazaro.pagination.domain.User;
import io.lazaro.pagination.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Lázaro
 * @version 1.0
 * @since 08/07/2022
 */
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {}", page, size);
        return userRepository.findByNameContaining(name, PageRequest.of(page, size));
    }
}
