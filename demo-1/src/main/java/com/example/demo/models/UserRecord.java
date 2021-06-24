package com.example.demo.models;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;  
@Entity  
@Table(name="userone")
public class UserRecord   
{   
@Id
@GeneratedValue 
@Column
private int id;   
@Column
private String name;  
@Column
private String email;  
//default conatructor    
public UserRecord()  
{  
}    
public int getId()   
{    
return id;    
}    
public void setId(int id)   
{    
this.id = id;    
}    
public String getName()   
{    
return name;    
}    
public void setName(String name)   
{    
this.name = name;    
}    
public String getEmail()   
{    
return email;    
}    
public void setEmail(String email)   
{  
this.email = email;    
}    
}    