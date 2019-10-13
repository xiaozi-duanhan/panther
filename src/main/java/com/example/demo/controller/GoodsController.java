package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Goods;
import com.example.demo.service.GoodsService;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private RedisTemplate<String, Object> redisTemplate; 
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1")long cpage) {
		
		//执行查询语句
		List<Goods> goodsList = goodsService.getGoodsList();
		
		model.addAttribute("goodsList", goodsList);
		
		
		return "list";
	}

}
