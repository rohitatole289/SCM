package com.scm.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Data
@ToString
public class Contact {
@Id
	private String id;
	private String name;
	private String email;
	private String PhoneNumber;
	private String address;
	private String description;
	private boolean favorite=false;
	@ManyToOne
	private User user;
}
