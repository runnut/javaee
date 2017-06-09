package com.crccmall.util.page;

import java.util.List;
import java.util.Map;

public class PageBox {

	// 当前页
	private Integer current_page;

	// 每页行数
	private Integer rows;

	// 数据集
	private List<Object> data;
	
	// 数据集(map)
	private List<Map<String, Object>> dataForMap;

	// 总行数
	private Integer total_rows;

	// 总页数
	private Integer total_page;

	// 上一页
	private Integer pre_page;

	// 下一页
	private Integer next_page;

	// 是否有上一页
	private Boolean pre_sign;

	// 是否有下一页
	private Boolean next_sign;

	// 索引数组
	private List<Integer> indexs;

	// 索引数组长度
	private Integer index_length;

	public Integer getCurrent_page() {
		return current_page;
	}

	public void setCurrent_page(Integer current_page) {
		this.current_page = current_page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getTotal_rows() {
		return total_rows;
	}

	public void setTotal_rows(Integer total_rows) {
		this.total_rows = total_rows;
	}

	public Integer getTotal_page() {
		return total_page;
	}

	public void setTotal_page(Integer total_page) {
		this.total_page = total_page;
	}

	public Integer getPre_page() {
		return pre_page;
	}

	public void setPre_page(Integer pre_page) {
		this.pre_page = pre_page;
	}

	public Integer getNext_page() {
		return next_page;
	}

	public void setNext_page(Integer next_page) {
		this.next_page = next_page;
	}

	public Boolean getPre_sign() {
		return pre_sign;
	}

	public void setPre_sign(Boolean pre_sign) {
		this.pre_sign = pre_sign;
	}

	public Boolean getNext_sign() {
		return next_sign;
	}

	public void setNext_sign(Boolean next_sign) {
		this.next_sign = next_sign;
	}

	public List<Integer> getIndexs() {
		return indexs;
	}

	public void setIndexs(List<Integer> indexs) {
		this.indexs = indexs;
	}

	public Integer getIndex_length() {
		return index_length;
	}

	public void setIndex_length(Integer index_length) {
		this.index_length = index_length;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public List<Map<String, Object>> getDataForMap() {
		return dataForMap;
	}

	public void setDataForMap(List<Map<String, Object>> dataForMap) {
		this.dataForMap = dataForMap;
	}

}
