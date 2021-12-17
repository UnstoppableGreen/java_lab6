package ru.rsatu.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Entity
public class Specification {
	
    private Long itemID;
    private Integer qty;

    @ManyToOne(fetch = FetchType.LAZY)
    private Orders order;

	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
}
