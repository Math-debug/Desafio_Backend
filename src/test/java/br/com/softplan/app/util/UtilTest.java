package br.com.softplan.app.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.softplan.app.converter.ProductConverter;
import br.com.softplan.app.entity.Product;
import br.com.softplan.app.entity.dto.ProductDTO;

public class UtilTest {
	public static List<Product> returnList(){
		List<Product> list = new ArrayList<>();
		list.add(new Product(1l,"Product1","This is the product 1", BigDecimal.valueOf(2.5)));
		list.add(new Product(2l,"Product2","This is the product 2", BigDecimal.valueOf(2.5)));
		list.add(new Product(3l,"Product3","This is the product 3", BigDecimal.valueOf(2.5)));
		return list;
	}
	
	public static List<ProductDTO> returnListConverted(){
		return ProductConverter.convertTO(returnList());
	}
}
