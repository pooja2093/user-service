package com.datetest.userprofile.mappers;

import com.datetest.userprofile.models.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {

  void addAccount(@Param("uuid") String uuid, @Param("username") String username, @Param("loginType") String loginType);

  Account getAccount(@Param("uuid") String uuid);

  void deleteAccount(@Param("uuid") String uuid);

}
