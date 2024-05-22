package com.test.aop.dao;

import com.test.aop.dto.AOPDTO;

public interface AOPDAO {

	void list();

	void add();

	void view();

	void add(AOPDTO dto);

}