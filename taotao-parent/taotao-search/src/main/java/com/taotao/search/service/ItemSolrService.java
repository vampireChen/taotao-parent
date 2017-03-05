package com.taotao.search.service;

import com.taotao.result.TaotaoResult;

/**
 * 用于将数据库商品数据存在solr域中
 * <p>Title: ItemSolrService</p>
 * <p>@Description:TODO</p>
 * <p>Company: www.chenhaitao.com</p>	
 * @author chenhaitao
 * @date:2017年3月4日下午2:18:34
 * @version:1.0
 */
public interface ItemSolrService {
	/**
	 * 导入所有产品信息到solr服务器对应的域中
	 * <p>Title: importAllItems</p>
	 * <p>Description: </p>
	 * @return: TaotaoResult
	 */
	TaotaoResult importAllItems();
}
