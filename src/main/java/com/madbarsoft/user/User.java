package com.madbarsoft.user;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author MD IMRAN HOSSAIN
 *
 */
@Entity
@Getter
@Setter
@ToString
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	
	@Column(nullable = false)
	@Size(min = 4)
	private String password;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", 
	        joinColumns = {
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") },
	        inverseJoinColumns = {
		    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID") })
	private List<Role> roles;
	

}
