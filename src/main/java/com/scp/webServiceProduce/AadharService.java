package com.scp.webServiceProduce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AadharService {
	static HashMap<Integer, AadharDeatils> aadharId = getAadharIdMap();

	public AadharService() {
		super();
		// TODO Auto-generated constructor stub

		if (aadharId == null) {
			aadharId = new HashMap<Integer, AadharDeatils>();
			Address ad1 = new Address("Ahmednagar", "Ahmednagar", "Maharashtra", 414005);
			Address ad2 = new Address("Kondhwa", "Pune", "Maharashtra", 414005);
			Address ad3 = new Address("Ambegaon", "Pune", "Maharashtra", 414005);

			AadharDeatils aadharDeatils1 = new AadharDeatils(1, "Nikita", "646890969749", ad1);
			AadharDeatils aadharDeatils2 = new AadharDeatils(2, "Varsha", "809648731245", ad2);
			AadharDeatils aadharDeatils3 = new AadharDeatils(3, "Rajashri", "696845237891", ad3);

			aadharId.put(1, aadharDeatils1);
			aadharId.put(2, aadharDeatils2);
			aadharId.put(3, aadharDeatils3);
		}
	}

	private static HashMap<Integer, AadharDeatils> getAadharIdMap() {
		// TODO Auto-generated method stub
		return aadharId;
	}

	public List<AadharDeatils> getAllAadharDeatils() {
		List<AadharDeatils> aadhardetailss = new ArrayList<AadharDeatils>(aadharId.values());
		return aadhardetailss;
	}

}
