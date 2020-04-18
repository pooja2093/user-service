package com.datetest.userprofile.requests;

import lombok.Data;

@Data
public class LoginRequest {
  String phoneNumber;
  String email;
}
