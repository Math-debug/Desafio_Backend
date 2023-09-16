package br.com.softplan.app.controller;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import br.com.softplan.app.AppApplicationConfigTest;
import br.com.softplan.app.entity.dto.ProductDTO;
import br.com.softplan.app.repository.ProductRepository;
import br.com.softplan.app.util.UtilTest;

@DisplayName("ProductControllerTest")
public class ProductControllerTest extends AppApplicationConfigTest{

	@MockBean
	ProductRepository productRepository;
	
	@Autowired
	ProductController productController;
	
	@Test
	@DisplayName("ShouldReturnOKAndAllProducts")
	public void ShouldReturnOKAndAllProducts() {
		Mockito.when(productRepository.findAll()).thenReturn(UtilTest.returnList());
		ResponseEntity<List<ProductDTO>> products = productController.findAll();
		Assertions.assertEquals(products.getStatusCode(), HttpStatus.OK);
		Assertions.assertEquals(products.getBody(), UtilTest.returnListConverted());
	}
	
	@Test
	@DisplayName("ShouldReturnCreatedToProduct")
	public void ShouldReturnCreatedToProduct() {
		Mockito.when(productRepository.save(Mockito.any())).thenReturn(UtilTest.returnList().get(0));
		ResponseEntity<ProductDTO> products = productController.save(UtilTest.returnListConverted().get(0));
		Assertions.assertEquals(products.getStatusCode(), HttpStatus.CREATED);
	}
}
