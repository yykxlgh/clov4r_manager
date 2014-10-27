package models;

import javax.persistence.*;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name="daily")
public class Daily  extends Model {

    @Required
	@Column(name = "title")
	public String title;

	@MaxSize(2000)
    @Required
	@Column(name = "content")
	public String content;
	
	public String toString(){return title;}
	
	
}
