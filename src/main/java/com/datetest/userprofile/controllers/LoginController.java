package com.datetest.userprofile.controllers;

import com.datetest.userprofile.models.Account;
import com.datetest.userprofile.requests.LoginRequest;
import com.datetest.userprofile.services.AccountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/login")
@ApiResponses(value = {
        @ApiResponse(code = 201, message = "Record created successfully"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "METHOD_NOT_ALLOWED"),
        @ApiResponse(code = 500, message = "Internal server error"),
        @ApiResponse(code = 401, message = "Unauthorized")
})
public class LoginController {

  @Autowired
  AccountService accountService;

  @ApiOperation(value = "add an Account")
  @RequestMapping(value="", method= RequestMethod.POST)
  ResponseEntity<Account> add(@RequestBody LoginRequest request) throws Exception{
    return new ResponseEntity<Account>(accountService.add(request.getPhoneNumber(), request.getEmail()), HttpStatus.CREATED);
  }

  @ApiOperation(value = "delete an Account")
  @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
  ResponseEntity<Void> delete(@PathVariable("id") String id) {
    accountService.delete(id);
    return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
  }
}
