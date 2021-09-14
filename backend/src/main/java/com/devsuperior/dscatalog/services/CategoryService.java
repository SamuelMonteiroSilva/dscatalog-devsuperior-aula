package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

//Com a anotação o spring fica responsavel 
//por gerenciar as instancias do tipo Category
@Service
public class CategoryService {

	//Anotação para injetar automaticamente a dependencia 
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
}

//Service = o cara que conversa com o banco 
