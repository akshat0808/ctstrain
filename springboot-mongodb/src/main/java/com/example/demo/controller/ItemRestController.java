package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.error.ErrorMessage;
import com.example.demo.error.ItemNotFoundException;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemRestController {

	/*
	 * private ItemRepository itemRepository;
	 * 
	 * @Autowired public ItemRestController(ItemRepository itemRepository) {
	 * super(); this.itemRepository = itemRepository; }
	 */
	
	private ItemService itemService;
	
	@Autowired
	public ItemRestController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1 (ItemNotFoundException infe){
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(infe.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2 (Exception e){
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/items")
	public Item create(@RequestBody Item item)
	{
		return itemService.create(item);
		
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemByItemId(@PathVariable String itemId)
	{
		Optional<Item> item=itemService.getItemByItemId(itemId);
		
		  if(!item.isPresent()) { 
			  throw new
		  ItemNotFoundException("Aisa koi item nahi hai..!!: "+itemId); }
		  
		  return item;
		 
	}
	
	@PutMapping("/items")
	public Item update(@RequestBody Item item)
	{
		return itemService.create(item);
	}
	@DeleteMapping("/items/{itemId}")
	public void delete(@PathVariable String itemId)
	{
		itemService.deleteByItemId(itemId);
	}
	@DeleteMapping("/items/deleteByItemName/{itemName}")
	public void deleteByItemName(@PathVariable String itemName)
	{
		itemService.deleteByItemName(itemName);
	}
	@DeleteMapping("/items/deleteByItemNameAndItemPrice/{itemName}/{itemPrice}")
	public void deleteByItemNameAndItemPrice(@PathVariable String itemName, @PathVariable double itemPrice)
	{
		itemService.deleteByItemNameAndItemPrice(itemName, itemPrice);
	}
}
