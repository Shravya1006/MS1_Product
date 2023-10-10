package com.demo.Lulu_02_MS1_Product.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.Lulu_02_MS1_Product.Entity.SportsProduct;


public interface ProductRepository extends JpaRepository<SportsProduct, Integer> {
	@Query("SELECT s FROM SportsProduct s ")//JPQL 
	List<SportsProduct> findAllMyQuery();
	@Query(value ="SELECT * FROM Shravya",nativeQuery = true)  ///Native Query 
	List<SportsProduct> findAllNativeQuery();
}
