package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {
	@Value("${Item.itemID}")
	private int itemID;
	@Value("${Item.itemName}")
	private String itemName;
	@Value("${Item.cpu}")
	private int cpu;
}
