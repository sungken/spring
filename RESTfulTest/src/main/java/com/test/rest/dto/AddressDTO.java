package com.test.rest.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(value="AddressDTO(주소정보)", description = "주소 데이터를 전달")
public class AddressDTO {
	
	//변수 만드는 방법
	
	@ApiModelProperty(value = "데이터 식별자", required = true, example = "1")
	private String seq;
	
	@ApiModelProperty(value = "회원 이름", required = true, example = "홍길동")
	private String name;
	
	@ApiModelProperty(value = "회원 나이", required = true, example = "20")
	private String age;
	
	@ApiModelProperty(value = "회원 주소", required = true, example = "경기도 화성시")
	private String address;
	
	@ApiModelProperty(value = "회원 성별", required = true, example = "m")
	private String gender;

}
