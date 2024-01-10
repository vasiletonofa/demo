package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepositoryPaginated extends PagingAndSortingRepository<User, Integer> {

    Page<User> findAllByName(Pageable pageable, String name);

    Page<User> findAllByRole(Pageable pageable, String role);

    Page<User> findAllByNameAndRole(Pageable pageable, String name, String role);

}
