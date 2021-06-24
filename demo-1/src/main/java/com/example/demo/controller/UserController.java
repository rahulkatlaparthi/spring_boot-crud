package com.example.demo.controller;    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UserRecord;
import com.example.demo.service.UserService;

import java.util.List;    
@RestController    
public class UserController   
{    
@Autowired    
private UserService userService;     
@RequestMapping("/")    
public List<UserRecord> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping(value="/add-user", method=RequestMethod.POST)    
public void addUser(@RequestBody UserRecord userRecord)  
{    
userService.addUser(userRecord);    
}   

@RequestMapping(value="/update-user", method=RequestMethod.PUT) 
public UserRecord updateUser(@RequestBody UserRecord user) {
	return userService.updateUser(user);
}

@DeleteMapping("/{id}")
public HttpStatus deleteUser(@PathVariable int id) {
	userService.deleteUser(id);
	return HttpStatus.FORBIDDEN;
}


}    