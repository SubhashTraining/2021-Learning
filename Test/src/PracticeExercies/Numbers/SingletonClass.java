package PracticeExercies.Numbers;

import java.util.Date;

public class SingletonClass {

  private String Name;
  private String Description;
  private Date date;
  private seasons season;
  
  public static enum seasons{
	 
	  SUMMER(1),
	  WINTER(2),
	  SPRING(3),
	  AUTUMN(4);
	  
	  public int order;
	  private seasons(int order)
	  {
		  this.order=order;
	  }  
	  
	  public int getOrder(){
		  return this.order;
	  }
  }
  
  
  private static SingletonClass sClass = new SingletonClass();
  
  private SingletonClass()
  {
	this.date=new Date();  
  }
  
  public static SingletonClass getInstance()
  {
	  return sClass;
  }

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public seasons getSeason() {
	return season;
}

public void setSeason(seasons season) {
	this.season = season;
}
  
  
  
  

}
