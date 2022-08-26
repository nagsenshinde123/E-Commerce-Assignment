package com.gsore.type;

import org.springframework.data.domain.Sort;

public class ProductSortFilter {
	
	private String sortType;
	
	public ProductSortFilter(String type) {
		this.sortType = type;
	}
	
	public Sort getSortType() {
		if (this.sortType == null) {
			return Sort.by("id").descending();
		}		
		switch(this.sortType) {
			case "priceasc":
				return Sort.by("price").ascending();
			case "pricedesc":
				return Sort.by("price").descending();
			case "alphasc":
				return Sort.by("title").ascending();
			case "alphdesc":
				return Sort.by("title").descending();
			default: 
				return Sort.by("id").descending();
				
		}
	}
	
	
}
