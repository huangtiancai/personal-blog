package com.htc.entity;

import java.io.Serializable;

import lombok.Data;
@Data
public class Menu implements Serializable{
	

	private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

    
}