package com.datetest.userprofile.services.Impls;

import com.datetest.userprofile.daos.UserDao;
import com.datetest.userprofile.models.User;
import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;
import com.datetest.userprofile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserDao userDao;

  @Override
  public User add(String userId, String name, Gender gender, Interest interest, String location,
                  String status, String dob, Integer minRange, Integer maxRange) {
    User user= userDao.add(userId, name, gender, interest, location, status, dob, minRange, maxRange);
    return user;
  }

  @Override
  public User get(String userId) {
    return userDao.get(userId);
  }

  @Override
  public User update(String uuid, String name, Gender gender, Interest interest, String location,
                  String status, String dob, Integer minRange, Integer maxRange) {
    User user= userDao.update(uuid, name, gender, interest, location, status, dob, minRange, maxRange);
    return user;
  }
}
