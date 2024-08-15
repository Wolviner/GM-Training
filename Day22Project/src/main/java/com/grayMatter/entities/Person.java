package com.grayMatter.entities;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.domain.Persistable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="project22Person")
public class Person implements Persistable<Long> {
	//Server side validation takes place in entities
	@Id@Column(name="aadharnum")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private long aadharNum;
	@Column(name="personName")
	@Size(min=3,message="Person name must be of more than 3 characters")
	private String name;
	@NotBlank
	@Pattern(regexp="[6789][0-9]{9}",message="Mobile number must be of 10 length,starting "
			+ "with either 6,7,8 or 9 and of total 10 digits")
	private String mobileNum;
	@Range(min=18,message="Age must be of atleast 18 to vote")
	private int age;
	@Email
	private String email;
	
	@Transient
	@Builder.Default
	private boolean isNewId=true;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return isNewId;
	}
	
	
	
	
	

}
