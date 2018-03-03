package com.danieldevop.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danieldevop.patrimonio.model.Item;
import com.danieldevop.patrimonio.repository.ItemRepository;

@RestController//passivel de atender requisições http
@CrossOrigin("${origem-permitida}")//da permissao a requisições externas
public class ItemResource {
	
	@Autowired//injeção da instância da classe
	private ItemRepository itemRepository;
	
	@GetMapping("/itens")//atenderá nesta url
	public List<Item> listar() {//devolvendo uma lista de
		return itemRepository.findAll();// todos os itens
	}
	
	@PostMapping("/itens") // receberá informações de um item
	public Item  adicionar ( @RequestBody @Valid Item item ) { // aplica um json validado de entrada ao modelo 
		return itemRepository.save(item);
	}
	
}
