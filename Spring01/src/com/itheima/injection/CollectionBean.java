package com.itheima.injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private Object[] books;
	private List hobbies;
	private Map cards;
	private Set games;
	private Properties properties;
	private String wife;

	public Object[] getBooks() {
		return books;
	}

	public void setBooks(Object[] books) {
		this.books = books;
	}

	public List getHobbies() {
		return hobbies;
	}

	public void setHobbies(List hobbies) {
		this.hobbies = hobbies;
	}

	public Map getCards() {
		return cards;
	}

	public void setCards(Map cards) {
		this.cards = cards;
	}

	public Set getGames() {
		return games;
	}

	public void setGames(Set games) {
		this.games = games;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getWife() {
		return wife;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "CollectionBean [数组注入books=" + Arrays.toString(books) + ",list注入hobbies=" + hobbies + ", map注入cards="
				+ cards + ",set注入games=" + games + ", properties注入properties=" + properties + ", nullt注入wife=" + wife
				+ "]";
	}

}
