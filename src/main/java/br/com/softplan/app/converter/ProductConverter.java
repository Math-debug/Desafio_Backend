package br.com.softplan.app.converter;

import java.util.ArrayList;
import java.util.List;

import br.com.softplan.app.entity.Product;
import br.com.softplan.app.entity.dto.ProductDTO;

public class ProductConverter {
	
	public static Product convertTO (ProductDTO dto) {
		Product entity = new Product();
		entity.setId(dto.getId());
		entity.setAmount(dto.getAmount());
		entity.setDescription(dto.getDescription());
		entity.setName(dto.getName());
		return entity;
	}
	public static ProductDTO convertTO (Product entity) {
		ProductDTO dto = new ProductDTO();
		dto.setId(entity.getId());
		dto.setAmount(entity.getAmount());
		dto.setDescription(entity.getDescription());
		dto.setName(entity.getName());
		return dto;
	}
	public static List<ProductDTO> convertTO (List<Product> list){
		List<ProductDTO> listDTO = new ArrayList<>();
		for(Product product : list) {
			listDTO.add(convertTO(product));
		}
		return listDTO;
	}
}
