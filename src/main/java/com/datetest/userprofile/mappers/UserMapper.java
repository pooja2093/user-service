package com.datetest.userprofile.mappers;

import com.datetest.userprofile.models.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserMapper {

  void addUser(@Param("userId") String userId, @Param("user") User user);

  User getUser(@Param("uuid") String uuid);

  void updateUser(@Param("uuid") String uuid, @Param("user") User user);

}
