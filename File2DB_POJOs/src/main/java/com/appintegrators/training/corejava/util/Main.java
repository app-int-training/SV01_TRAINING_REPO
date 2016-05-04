package com.appintegrators.training.corejava.util;

import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.appintegrators.training.corejava.vo.Transaction;

public class Main implements Callable {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object onCall(MuleEventContext pEventCxt) throws Exception {
		MuleMessage message = pEventCxt.getMessage();
		Object obj = message.getPayload();
		List<Map> resultList = (List<Map>) obj;
		Transaction transactionObj = new Transaction();
		float sum = 0;
		for (Map rowMap : resultList) {
			String txnValue = (String) rowMap.get("TXN_VALUE");
			float num = Float.parseFloat(txnValue);
			sum = sum + num;
			transactionObj.setTxn_Value(sum);
		}
		return transactionObj.getTxn_Value();
	}

}
