package xyz.niteshsahni.cityguidepro.holder;

import java.util.Vector;

import xyz.niteshsahni.cityguidepro.model.CityMenuList;


public class AllCityMenu {
	public static Vector<CityMenuList> allCityMenuList = new Vector<CityMenuList>();

	public static Vector<CityMenuList> getAllCityMenu() {
		return AllCityMenu.allCityMenuList;
	}

	public static void setAllCityMenu(Vector<CityMenuList> allCityMenuList) {
		AllCityMenu.allCityMenuList = allCityMenuList;
	}

	public static CityMenuList getCityMenuList(int pos) {
		return AllCityMenu.allCityMenuList.elementAt(pos);
	}

	public static void setCityMenuList(CityMenuList CityMenuList) {
		AllCityMenu.allCityMenuList.addElement(CityMenuList);
	}

	public static void removeAll() {
		AllCityMenu.allCityMenuList.removeAllElements();
	}

}
