package com.demo.Lulu_02_MS1_Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Lulu_02_MS1_Product.Entity.SportsProduct;
import com.demo.Lulu_02_MS1_Product.Repo.ProductRepository;

@RestController    // we use it create REST API end Point along with http Methods 
//Like GET ,POST,DELETE,PUT ,PATCH
//POSTMAN

public class MyController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getProduct")
	public List<SportsProduct> getJPQL() {

		return productRepository.findAll(); // select * from <TableName>;

	}
	
	@PostMapping("/addProduct")
	public SportsProduct createuser(@RequestBody SportsProduct prod) {
		return productRepository.save(prod);
	}
	/*@Autowired
	MyService ms;
 @GetMapping("/getserviceconcept")
 public String getdata() {
	
	 MyService ms=new  MyService();
	 ms.process();
	 return ms.process();}*/
	
	 

	
//	@RequestMapping(method = RequestMethod.GET)
	
//	Annotation for mapping HTTP GET requests onto specific handler methods.

 

//	Specifically, @GetMapping is a composed annotation that acts as a shortcut for
//	@RequestMapping(method = RequestMethod.GET).

 

	
////jpql///
 @GetMapping("/getJPQL")
	public List<SportsProduct> getProductsbyJPQL() {

		return productRepository.findAllMyQuery();


 }
 @GetMapping("/getNative")
	public List<SportsProduct> getProductsbyNative() {

		return productRepository.findAllNativeQuery();
 }
 @DeleteMapping("/delProduct/{id}")
	public void delProduct(@PathVariable("id")Integer id) {

		productRepository.deleteById(id);
 }

}
