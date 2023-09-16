package br.com.softplan.app.entity.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductDTO {

	private Long id;
	private String name;
	private String description;
	private BigDecimal amount;
	
	public ProductDTO(){
	}
	
	public ProductDTO(Long id, String name, String description, BigDecimal amount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, description, name, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(description, other.description)
				&& Objects.equals(name, other.name) && Objects.equals(id, other.id);
	}
}
