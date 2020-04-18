package com.datetest.userprofile.daos.Impls;

import com.datetest.userprofile.daos.AccountDao;
import com.datetest.userprofile.mappers.AccountMapper;
import com.datetest.userprofile.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AccountDaoImpl implements AccountDao {

  @Autowired
  AccountMapper accountMapper;

  @Override
  public Account add(String username, String loginType) {
    String uuid = UUID.randomUUID().toString().replace("-", "");
    accountMapper.addAccount(uuid, username, loginType);
    Account account = accountMapper.getAccount(uuid);
    return account;
  }

  @Override
  public void delete(String userId) {
    accountMapper.deleteAccount(userId);
  }
}
