package com.madbarsoft.user;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * @author MD IMRAN HOSSAIN
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "roles")
public class Role {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    
    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List <User> users;

}