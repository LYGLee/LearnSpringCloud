package com.liyuan.microservice.common.beans;


import lombok.Data;


/**
 * 分页请求参数
 *
 */
@Data
public class PageReq {

	private int page = 1;

	private int pagesize = 10;

	private String sortfield = "";

	private String sort = "";

	private String keyword = "";

	public PageReq() {
		super();
	}

	public PageReq(int page, int pagesize, String sortfield, String sort,
			String keyword) {
		super();
		this.page = page;
		this.pagesize = pagesize;
		this.sortfield = sortfield;
		this.sort = sort;
		this.keyword = keyword;
	}

	public PageReq getPageable() {
		return new PageReq(page, pagesize, sortfield, sort, keyword);
	}

}
