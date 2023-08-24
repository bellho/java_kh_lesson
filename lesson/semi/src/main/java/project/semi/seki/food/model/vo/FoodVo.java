package project.semi.seki.food.model.vo;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
@Repository
public class FoodVo {
	private String foodCode;
	private String foodName;
	private String manufacturer;
	private Integer foodDate;
	private Integer servingSize;
	private String unit;
	private Integer gram;
	private Integer milliter;
	private Integer calories;
	private Integer totalCarbohydrate;
	private Integer protein;
	private Integer totalFat;
	private Integer sugars;
	private Integer soduim;
	private Integer cholesterol;
	private Integer saturatedFat;
	private Integer transFat;
	private String informationSource;
	private String issuer;
	private String foodDbCategory;
	private String foodCategory;
}
