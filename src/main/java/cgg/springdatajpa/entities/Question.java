package cgg.springdatajpa.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_question")
public class Question {

	@Id
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Answer> answers;
	
}
