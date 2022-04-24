package com.devsuperior.movie.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score  {
	

	@Embedded
	@Id
	private ScorePk id = new ScorePk();
	
	private Double value;

	public Score() {
		
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);	
	}
	
	public void setUser(User user) {
		id.setUser(user);	
	}

	public ScorePk getId() {
		return id;
	}

	public void setId(ScorePk id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
