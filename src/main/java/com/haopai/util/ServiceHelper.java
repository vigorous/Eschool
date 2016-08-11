package com.haopai.util;

import com.haopai.service.system.menu.MenuService;
import com.haopai.service.system.role.RoleService;
import com.haopai.service.system.user.UserService;

/**
 * @author Administrator
 * 获取Spring容器中的service bean
 */
public final class ServiceHelper {
	
	public static Object getService(String serviceName){
		if(Const.WEB_APP_CONTEXT != null){
			return Const.WEB_APP_CONTEXT.getBean(serviceName);
		} else {
			return null;
		}
	}
	
	public static UserService getUserService(){
		return (UserService) getService("userService");
	}
	
	public static RoleService getRoleService(){
		return (RoleService) getService("roleService");
	}
	
	public static MenuService getMenuService(){
		return (MenuService) getService("menuService");
	}
}