package com.example.demo.service;    
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;

import com.example.demo.models.UserRecord;
import com.example.demo.repository.UserRepository;  
  
@Service    
public class UserService   
{    
@Autowired    
private UserRepository userRepository;    
Logger logger = LoggerFactory.getLogger(UserService.class);
public List<UserRecord> getAllUsers()  
{    
List<UserRecord>userRecords = new ArrayList<>();    
 
//  userRepository.findAll().forEach(userRecords::add); 
  userRepository.findAll().forEach(userRecords::add);
  logger.info("getrequest");
  logger.debug("debug");
  logger.error("erroe");
return userRecords;    
}    
public void addUser(UserRecord userRecord)  
{    
  userRepository.save(userRecord); 
}
public UserRecord updateUser(UserRecord user) {
	// TODO Auto-generated method stub
	 Optional<UserRecord>  userer= userRepository.findById(user.getId());
	 
	 if(userer.isPresent()) {
		 UserRecord userre=userer.get();
		 userre.setEmail(user.getEmail());
		 userre.setName(user.getName());
		 userre=userRepository.save(userre);
		 return userre;
	 }
	 return user=userRepository.save(user);
}
public void deleteUser(int id) {
	Optional<UserRecord> user=userRepository.findById(id);
	if(user.isPresent()) {
		userRepository.deleteById(id);
	}
	
}    
}   