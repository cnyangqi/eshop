package com.ibs.eshop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ibs.eshop.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
