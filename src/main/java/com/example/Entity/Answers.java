package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="answers")
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private String answerName;

}
