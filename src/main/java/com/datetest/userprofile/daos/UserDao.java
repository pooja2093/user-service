package com.datetest.userprofile.daos;

import com.datetest.userprofile.models.User;
import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;

public interface UserDao {

  User add(String userId, String name, Gender gender, Interest interest, String location,
           String status, String dob, Integer minRange, Integer maxRange);
  User get(String uuid);

  User update(String uuid, String name, Gender gender, Interest interest, String location,
           String status, String dob, Integer minRange, Integer maxRange);
}
