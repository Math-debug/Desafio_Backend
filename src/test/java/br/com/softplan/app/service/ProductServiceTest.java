package br.com.softplan.app.service;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.com.softplan.app.AppApplicationConfigTest;
import br.com.softplan.app.entity.dto.ProductDTO;
import br.com.softplan.app.repository.ProductRepository;
import br.com.softplan.app.util.UtilTest;

@DisplayName("ProductServiceTest")
public class ProductServiceTest extends AppApplicationConfigTest{
	
	@MockBean
	ProductRepository productRepository;
	
	@Autowired
	ProductService productService;

	@Test
	@DisplayName("ShouldReturnAllProducts")
	public void ShouldReturnAllProducts() {
		Mockito.when(productRepository.findAll()).thenReturn(UtilTest.returnList());
		List<ProductDTO> products = productService.findAll();
		Assertions.assertEquals(products, UtilTest.returnListConverted());
	}
	
	@Test
	@DisplayName("ShouldReturnCreationProduct")
	public void ShouldReturnCreationProduct() {
		ProductDTO dto = new ProductDTO(1l,"Product1","This is the product 1", BigDecimal.valueOf(2.5));
		Mockito.when(productRepository.save(Mockito.any())).thenReturn(UtilTest.returnList().get(0));
		ProductDTO product = productService.save(dto);
		Assertions.assertEquals(product, dto);
	}
}
