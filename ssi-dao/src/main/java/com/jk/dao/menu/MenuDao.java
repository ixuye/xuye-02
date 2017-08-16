package com.jk.dao.menu;

import java.util.List;

import com.jk.pojo.menu.MenuRequest;
import com.jk.pojo.menu.MenuResponse;

public interface MenuDao {

	List<MenuResponse> selectMenuListJson(MenuRequest menuRequest);

	List<MenuResponse> queryFirstMenuList(MenuRequest menuRequest);

	void insertMenu(MenuRequest menuRequest);

	void deleteMenuById(MenuRequest menuRequest);

	void updateMenuById(MenuRequest menuRequest);

	MenuResponse queryMenuById(MenuRequest menuRequest);

}
