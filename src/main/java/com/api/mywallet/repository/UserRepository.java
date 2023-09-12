package com.api.mywallet.repository;

import com.api.mywallet.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpf(Long cpf);
}
