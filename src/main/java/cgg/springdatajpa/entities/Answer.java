package cgg.springdatajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_answer")
public class Answer {
	
	@Id
	private int answerId;
	private String answer;
	

	@ManyToOne
	@JoinColumn(name="q_id")
	private Question question;
	

}
