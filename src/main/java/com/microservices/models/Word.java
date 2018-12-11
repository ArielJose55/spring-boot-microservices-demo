package com.microservices.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.jboss.logging.Field;

import lombok.Data;

@Entity
@Data
@Table(name="WORD")
public class Word {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="word", nullable=false)
	private String word;
	
	private Collection<String> traductions;
}
