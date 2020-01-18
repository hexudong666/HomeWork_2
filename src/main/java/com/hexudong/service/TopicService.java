package com.hexudong.service;

import java.util.List;

import com.hexudong.entity.Item;

public interface TopicService {

	List<Item> getList(Integer num);

	List<Item> getList2(Integer num);

	List<Item> getList3(Integer num);

	List<Item> getList4(Integer num);

	void upd1(int id, Integer votes);

	Item gettoUpd(int id);

}
