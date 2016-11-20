package com.dealer.management.combain;

import com.dealer.management.model.Dealer;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
import com.dealer.management.model.DealerCompany;
import com.dealer.management.model.SalesExecutive;
import com.dealer.management.model.SeDetails;

public class Dealerfull {
	Dealer dealer=null;

	DealerAddress address=null;
	DealerBank bank=null;
	DealerCompany company=null;
	public DealerAddress getAddress() {
		return address;
	}
	public void setAddress(DealerAddress address) {
		this.address = address;
	}
	public DealerBank getBank() {
		return bank;
	}
	public void setBank(DealerBank bank) {
		this.bank = bank;
	}
	public DealerCompany getCompany() {
		return company;
	}
	public void setCompany(DealerCompany company) {
		this.company = company;
	}
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
}
