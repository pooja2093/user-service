package com.datetest.userprofile.services;

import com.datetest.userprofile.models.Account;

import java.util.Map;

public interface AccountService {

  Account add(String phoneNumber, String email);

  void delete(String userId);
}
