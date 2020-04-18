package com.datetest.userprofile.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.AutomapConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;

@Getter
@Setter
public class User {
  private String uuid;
  private String name;
  private String gender;
  private String interest;
  private String location;
  private String status;
  private String dob;
  private Integer minRange;
  private Integer maxRange;

/*
  private User(String name, String gender, String interest, String location,
       String status, String dob, Integer minRange, Integer maxRange) {
    this.name=name;
    this.gender=gender;
    this.interest=interest;
    this.location=location;
    this.status=status;
    this.dob=dob;
    this.minRange=minRange;
    this.maxRange=maxRange;
  }

 */
}
