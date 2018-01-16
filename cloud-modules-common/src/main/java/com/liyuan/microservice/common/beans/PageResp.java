package com.liyuan.microservice.common.beans;

import java.util.List;



import lombok.Data;

/**
 * 分页响应对象
 */
@Data
public class PageResp<T> {
	private List<T> rows;

	private int page;

	private int pagesize;

	private long total;



}
