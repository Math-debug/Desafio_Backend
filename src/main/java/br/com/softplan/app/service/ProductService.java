package br.com.softplan.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softplan.app.converter.ProductConverter;
import br.com.softplan.app.entity.Product;
import br.com.softplan.app.entity.dto.ProductDTO;
import br.com.softplan.app.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public List<ProductDTO> findAll(){
		List<Product> productList = productRepository.findAll();
		List<ProductDTO> listDTO = new ArrayList<>();
		listDTO = ProductConverter.convertTO(productList);
		return listDTO;
	}
	
	public ProductDTO findById (Long id) {
		Product product = productRepository.findById(id).get();
		return ProductConverter.convertTO(product);
	}
	
	public ProductDTO save (ProductDTO dto) {
		Product product = productRepository.save(ProductConverter.convertTO(dto));
		return ProductConverter.convertTO(product);
	}

	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
