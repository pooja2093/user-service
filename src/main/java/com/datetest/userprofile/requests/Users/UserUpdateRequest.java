package com.datetest.userprofile.requests.Users;

import com.datetest.userprofile.models.metadata.Gender;
import com.datetest.userprofile.models.metadata.Interest;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserUpdateRequest {

  String name;
  String gender;
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
