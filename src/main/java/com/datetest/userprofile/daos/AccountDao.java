package com.datetest.userprofile.daos;

import com.datetest.userprofile.models.Account;

public interface AccountDao {

  Account add(String username, String loginType);

  void delete(String userId);


}
