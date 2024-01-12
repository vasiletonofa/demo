package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepositoryPaginated extends PagingAndSortingRepository<UserTekwill, Integer> {

    Page<UserTekwill> findAllByName(Pageable pageable, String name);

    Page<UserTekwill> findAllByRole(Pageable pageable, String role);

    Page<UserTekwill> findAllByNameAndRole(Pageable pageable, String name, String role);

}
