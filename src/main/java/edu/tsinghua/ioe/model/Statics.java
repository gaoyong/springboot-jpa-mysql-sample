package edu.tsinghua.ioe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="statics")
public class Statics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	 @Column(name = "refid", nullable = true, length = 255)
	  private String refid;
	 
	 @Column(name = "pv")
	  private Long pv;
	 
	 @Column(name = "fav")
	  private Long fav;
	 
	 @Column(name = "praise")
	  private Long praise;
	 
	 @Column(name = "type",nullable = true)
	  private int type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRefid() {
		return refid;
	}

	public void setRefid(String refid) {
		this.refid = refid;
	}

	public Long getPv() {
		return pv;
	}

	public void setPv(Long pv) {
		this.pv = pv;
	}

	public Long getFav() {
		return fav;
	}

	public void setFav(Long fav) {
		this.fav = fav;
	}

	public Long getPraise() {
		return praise;
	}

	public void setPraise(Long praise) {
		this.praise = praise;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Statics [id=" + id + ", refid=" + refid + ", pv=" + pv + ", fav=" + fav + ", praise=" + praise
				+ ", type=" + type + "]";
	}
	 
	 

}
