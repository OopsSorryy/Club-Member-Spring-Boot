package com.yunusemre.clubMember.business.concretes;


import com.yunusemre.clubMember.business.abstracts.UserService;
import com.yunusemre.clubMember.core.dataAccess.UserDao;
import com.yunusemre.clubMember.core.entities.User;
import com.yunusemre.clubMember.core.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        if(userDao.findByEmail(user.getEmail())!=null) {
            return new ErrorResult("Aynı email var");
        }

            this.userDao.save(user);
            return new SuccessResult("Kullanici eklendi");




    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email)
                ,"Kullanıcı bulundu");
    }

    @Override
    public DataResult<User> getByUserId(int userId) {
        return new SuccessDataResult<User>
                (this.userDao.getByUserId(userId)
                ,"Kullanıcı bulundu");
    }

}