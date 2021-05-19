package com.student.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class Fee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "fee_name")
	private String feeName;
	
	@Column(name = "periodicity")
	private String periodicity;
	
	@Column(name = "fine_applicable")
	private boolean fineApplicable;
	
	@Column(name = "concession_applicable")
	private boolean	concessionApplicable;
	
	@Column(name = "refundable")
	private boolean	refundable;
	
	@Column(name = "account_head")
	private String accountHead;
	
	@Column(name = "active")
	private boolean active;
	
	public Fee() {
	}

	public Fee(Long id, String feeName, String periodicity, boolean fineApplicable, boolean concessionApplicable,
			boolean refundable, String accountHead, boolean active) {
		this.id = id;
		this.feeName = feeName;
		this.periodicity = periodicity;
		this.fineApplicable = fineApplicable;
		this.concessionApplicable = concessionApplicable;
		this.refundable = refundable;
		this.accountHead = accountHead;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public boolean isFineApplicable() {
		return fineApplicable;
	}

	public void setFineApplicable(boolean fineApplicable) {
		this.fineApplicable = fineApplicable;
	}

	public boolean isConcessionApplicable() {
		return concessionApplicable;
	}

	public void setConcessionApplicable(boolean concessionApplicable) {
		this.concessionApplicable = concessionApplicable;
	}

	public boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}

	public String getAccountHead() {
		return accountHead;
	}

	public void setAccountHead(String accountHead) {
		this.accountHead = accountHead;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Fee [feeName=" + feeName + ", periodicity=" + periodicity + ", fineApplicable=" + fineApplicable
				+ ", concessionApplicable=" + concessionApplicable + ", refundable=" + refundable + ", accountHead="
				+ accountHead + ", active=" + active + "]";
	}

}
