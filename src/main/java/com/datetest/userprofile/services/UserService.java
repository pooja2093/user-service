package com.datetest.userprofile.services;

import com.datetest.userprofile.models.Account;
import com.datetest.userprofile.models.User;
import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {

  User add(String userId, String name, Gender gender, Interest interest, String location,
                          String status, String dob, Integer minRange, Integer maxRange);
  User get(String userId);

  User update(String uuid, String name, Gender gender, Interest interest, String location,
           String status, String dob, Integer minRange, Integer maxRange);
}
