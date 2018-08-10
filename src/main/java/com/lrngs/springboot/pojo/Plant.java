package com.lrngs.springboot.pojo;

public class Plant
{

	private String name;
	private String year;
	private String description;
	private String produce;
	private String rating;
	private String category;

	public Plant()
	{

	}

	public Plant(String name, String year, String description, String produce, String rating, String category)
	{
		super();
		this.name = name;
		this.year = year;
		this.description = description;
		this.produce = produce;
		this.rating = rating;
		this.category = category;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getProduce()
	{
		return produce;
	}

	public void setProduce(String produce)
	{
		this.produce = produce;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	@Override
	public String toString()
	{
		return "Plant [name=" + name + ", year=" + year + ", description=" + description + ", produce=" + produce + ", rating=" + rating
				+ ", category=" + category + "]";
	}

}
