package com.taotao.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.result.TaotaoResult;
import com.taotao.search.service.ItemSolrService;

/**
 * 将商品信息写入到solr服务器索引库中
 * <p>Title: ItemSolrController</p>
 * <p>@Description:TODO</p>
 * <p>Company: www.chenhaitao.com</p>	
 * @author chenhaitao
 * @date:2017年3月4日下午2:49:16
 * @version:1.0
 */
@Controller
@RequestMapping("/manager")
public class ItemSolrController {
	@Autowired
	private ItemSolrService itemSolrService;
	@RequestMapping("/importall")
	@ResponseBody
	public TaotaoResult importAllItems(){
		TaotaoResult result = itemSolrService.importAllItems();
		return result;
	}
}
