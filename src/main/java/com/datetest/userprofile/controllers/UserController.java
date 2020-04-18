package com.datetest.userprofile.controllers;

import com.datetest.userprofile.models.Account;
import com.datetest.userprofile.models.User;
import com.datetest.userprofile.requests.LoginRequest;
import com.datetest.userprofile.requests.Users.UserCreateRequest;
import com.datetest.userprofile.requests.Users.UserUpdateRequest;
import com.datetest.userprofile.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
@ApiResponses(value = {
        @ApiResponse(code = 201, message = "Record created successfully"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "METHOD_NOT_ALLOWED"),
        @ApiResponse(code = 500, message = "Internal server error"),
        @ApiResponse(code = 401, message = "Unauthorized")
})
public class UserController {

  @Autowired
  UserService userService;

  @ApiOperation(value = "add users")
  @RequestMapping(value="", method= RequestMethod.POST)
  ResponseEntity<User> add(@Valid @RequestBody UserCreateRequest request) throws Exception{
    return new ResponseEntity<User>(userService.add(request.getUserId(), request.getName(), request.getGender(),
            request.getInterest(), request.getLocation(), request.getStatus(), request.getDob(),
            request.getMinRange(), request.getMaxRange()
            ), HttpStatus.CREATED);
  }

  @ApiOperation(value = "update a users")
  @RequestMapping(value="/{id}", method= RequestMethod.PUT)
  ResponseEntity<User> update(@RequestBody UserUpdateRequest request, @PathVariable("id") String id) {
    return new ResponseEntity<User>(userService.update(id, request.getName(), request.getGender(),
            request.getInterest(), request.getLocation(), request.getStatus(), request.getDob(),
            request.getMinRange(), request.getMaxRange()
    ), HttpStatus.CREATED);
  }

  @ApiOperation(value = "get a user")
  @RequestMapping(value="/{id}", method= RequestMethod.GET)
  ResponseEntity<User> get(@PathVariable("id") String id) throws Exception {
    return new ResponseEntity<User>(userService.get(id), HttpStatus.OK);
  }
}
