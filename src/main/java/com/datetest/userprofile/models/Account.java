package com.datetest.userprofile.models;

import lombok.Data;

@Data
public class Account {

  private String username;
  private String uuid;
  private String loginType;
  private Boolean isActive;
  private Boolean isEnabled;
}
