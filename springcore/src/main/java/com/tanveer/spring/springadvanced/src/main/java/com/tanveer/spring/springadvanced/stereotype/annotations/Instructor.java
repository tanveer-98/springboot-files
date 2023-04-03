package com.tanveer.spring.springadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Scope("prototype")
public class Instructor {
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

	@Value("1")
	private int id; 
	
	@Value("Tanveer Ahmed")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;
	
	
	public List<String> getTopics() {
		return topics;
	}
	
	@Autowired
	private Profile profile;
	

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
