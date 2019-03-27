package com.bdtask.recyclerviewinsiderecyclerview;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class IteminfoItem{

	@SerializedName("ProductsID")
	private String productsID;

	@SerializedName("Varientid")
	private String varientid;

	@SerializedName("addonsinfo")
	private List<AddonsinfoItem> addonsinfo;

	@SerializedName("ProductName")
	private String productName;

	@SerializedName("food_status")
	private String foodStatus;

	@SerializedName("addons")
	private int addons;

	@SerializedName("price")
	private String price;

	@SerializedName("Itemqty")
	private String itemqty;

	@SerializedName("Varientname")
	private String varientname;

	@SerializedName("Itemtotal")
	private int itemtotal;

	public void setProductsID(String productsID){
		this.productsID = productsID;
	}

	public String getProductsID(){
		return productsID;
	}

	public void setVarientid(String varientid){
		this.varientid = varientid;
	}

	public String getVarientid(){
		return varientid;
	}

	public void setAddonsinfo(List<AddonsinfoItem> addonsinfo){
		this.addonsinfo = addonsinfo;
	}

	public List<AddonsinfoItem> getAddonsinfo(){
		return addonsinfo;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setFoodStatus(String foodStatus){
		this.foodStatus = foodStatus;
	}

	public String getFoodStatus(){
		return foodStatus;
	}

	public void setAddons(int addons){
		this.addons = addons;
	}

	public int getAddons(){
		return addons;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setItemqty(String itemqty){
		this.itemqty = itemqty;
	}

	public String getItemqty(){
		return itemqty;
	}

	public void setVarientname(String varientname){
		this.varientname = varientname;
	}

	public String getVarientname(){
		return varientname;
	}

	public void setItemtotal(int itemtotal){
		this.itemtotal = itemtotal;
	}

	public int getItemtotal(){
		return itemtotal;
	}

	@Override
 	public String toString(){
		return 
			"IteminfoItem{" + 
			"productsID = '" + productsID + '\'' + 
			",varientid = '" + varientid + '\'' + 
			",addonsinfo = '" + addonsinfo + '\'' + 
			",productName = '" + productName + '\'' + 
			",food_status = '" + foodStatus + '\'' + 
			",addons = '" + addons + '\'' + 
			",price = '" + price + '\'' + 
			",itemqty = '" + itemqty + '\'' + 
			",varientname = '" + varientname + '\'' + 
			",itemtotal = '" + itemtotal + '\'' + 
			"}";
		}
}