package com.yunusemre.clubMember.business.abstracts;


import com.yunusemre.clubMember.core.entities.User;
import com.yunusemre.clubMember.core.utilities.results.DataResult;
import com.yunusemre.clubMember.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);

    DataResult<User> getByUserId(int userId);
}
