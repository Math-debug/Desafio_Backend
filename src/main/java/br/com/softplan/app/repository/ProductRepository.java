package br.com.softplan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.softplan.app.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
