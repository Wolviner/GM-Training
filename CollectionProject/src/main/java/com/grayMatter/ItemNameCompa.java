package com.grayMatter;

import java.util.Comparator;

public class ItemNameCompa implements Comparator<Activity> {
	@Override
	public int compare(Activity o1,Activity o2) {
		return o1.getItemName().compareTo(o2.getItemName());
	}

}
