package com.htc.entity;

import java.io.Serializable;

import lombok.Data;
@Data
public class Menu implements Serializable{

	private static final long serialVersionUID = 7915501461799907207L;

	private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

    
}