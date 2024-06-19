package com.example.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="questions")
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qId;
	private String questionName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="questions_id",referencedColumnName = "qId")
	private List<Options> options; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "type_id", referencedColumnName = "tId")
	private QuestionType questionType;
	

}
