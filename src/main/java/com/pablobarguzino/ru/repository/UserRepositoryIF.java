package com.pablobarguzino.ru.repository;

import com.pablobarguzino.ru.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryIF extends CrudRepository<User, Long> {

}
