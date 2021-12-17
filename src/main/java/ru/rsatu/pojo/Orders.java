package ru.rsatu.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    @SequenceGenerator(name = "orderSeq", sequenceName = "order_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "orderSeq")
    private Long orderID;
    private Long clientID;
    private Long statusID;
    private String creationDate;
    private String lastUpdateOn;
    @OneToOne(mappedBy = "topic", cascade = CascadeType.ALL, orphanRemoval = true)
  //  Map<Specification> Specification = new HashMap<>();
  //  HashMap<Long,Integer> Specification = new HashMap<>();
    private List<Specification> specs=new ArrayList<>();
    public void addSpecification(Specification spec) {
    	specs.put(spec);
    }

    public void removeSpecification(Specification spec) {
        specs.remove(spec);
    }
    
	public Long getClientID() {
		return clientID;
	}
	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}
	public Long getStatusID() {
		return statusID;
	}
	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastUpdateOn() {
		return lastUpdateOn;
	}
	public void setLastUpdateOn(String lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}
}
