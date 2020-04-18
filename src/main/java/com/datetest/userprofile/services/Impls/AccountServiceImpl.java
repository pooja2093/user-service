package com.datetest.userprofile.services.Impls;

import com.datetest.userprofile.daos.AccountDao;
import com.datetest.userprofile.models.Account;
import com.datetest.userprofile.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  AccountDao accountDao;

  @Override
  public Account add(String phoneNumber, String email) {
    if(phoneNumber != null) {
      Account account = accountDao.add(phoneNumber, "phone_number");
      return account;
    }else{
      //add facebook login
      return null;
    }
  }

  @Override
  public void delete(String userId) {
    accountDao.delete(userId);
  }
}
