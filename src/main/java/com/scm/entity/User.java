package com.scm.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString
public class User {
	@Id
	private String userId;
	@Column(name = "userName", nullable = false)
	private String name;
	@Column(unique = true , nullable = false)
	private String email;
	private String password;
	@Column(length = 10000)
	private String about;
	
	private String poneNumber;
	@Column(length = 10000)
	private String profilePic;
	
	//information
	private boolean enabled=false;
	private boolean emailVerified=false;
	private boolean phoneVerified=false;
	
	//google
	private Providers provider= Providers.SELF;
	private String providerUserId;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Contact> contacts= new  ArrayList<Contact>();
}
	

