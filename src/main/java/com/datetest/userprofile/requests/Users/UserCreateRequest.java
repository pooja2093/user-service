package com.datetest.userprofile.requests.Users;

import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserCreateRequest {

  @NotEmpty(message = "userId should not be empty")
  @NotNull(message = "userId should not be null")
  String userId;

  @NotEmpty(message = "name should not be empty")
  @NotNull(message = "name should not be null")
  String name;

  @NotEmpty(message = "gender should not be empty")
  @NotNull(message = "gender should not be null")
  String gender;

  @NotEmpty(message = "interest should not be empty")
  @NotNull(message = "interest should not be null")
  String interest;
  String location;
  String status;
  String dob;
  Integer minRange;
  Integer maxRange;

  public Gender getGender() {
    return gender != null ? Gender.valueOf(gender) : null;
  }

  public Interest getInterest() {
    return interest != null ? Interest.valueOf(interest) : null;
  }
}
