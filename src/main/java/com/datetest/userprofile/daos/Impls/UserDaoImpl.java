package com.datetest.userprofile.daos.Impls;

import com.datetest.userprofile.daos.UserDao;
import com.datetest.userprofile.mappers.UserMapper;
import com.datetest.userprofile.models.User;
import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
public class UserDaoImpl implements UserDao {

  @Autowired
  UserMapper userMapper;

  @Override
  public User add(String userId, String name, Gender gender, Interest interest, String location,
                  String status, String dob, Integer minRange, Integer maxRange) {
    String uuid = UUID.randomUUID().toString().replace("-", "");
    User user = setUser(name, gender, interest, location, status, dob, minRange, maxRange);
    user.setUuid(uuid);
    userMapper.addUser(userId, user);
    User result = userMapper.getUser(uuid);
    return result;
  }

  @Override
  public User get(String uuid) {
    User user = userMapper.getUser(uuid);
    return user;
  }

  User setUser(String name, Gender gender, Interest interest, String location,
               String status, String dob, Integer minRange, Integer maxRange) {
    User user = new User();
    user.setName(name);
    user.setDob(dob);
    user.setGender(gender.toString());
    user.setInterest(interest.toString());
    user.setLocation(location);
    user.setMaxRange(maxRange);
    user.setMinRange(minRange);
    user.setStatus(status);
    return user;
  }

  @Override
  public User update(String uuid, String name, Gender gender, Interest interest, String location,
                  String status, String dob, Integer minRange, Integer maxRange) {
    User user = setUser(name, gender, interest, location, status, dob, minRange, maxRange);
    userMapper.updateUser(uuid, user);
    User result = userMapper.getUser(uuid);
    return result;
  }

}
