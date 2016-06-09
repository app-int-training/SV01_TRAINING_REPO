package com.appintegrators.training.corejava.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.appintegrators.training.corejava.vo.Artist;

public class Main implements Callable {
	public static final String COLUMN_DELIMITER = "\\|";

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		InputStream inputStreamReader = (InputStream) message.getPayload();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				inputStreamReader));
		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
		Date dateObj;
		List<Artist> artistList = new ArrayList<Artist>();
		String aLineData = reader.readLine();
		String[] lineDataAsArray;
		Artist anArtist = null;
		while ((aLineData = reader.readLine()) != null) {
			lineDataAsArray = aLineData.split(COLUMN_DELIMITER);
			anArtist = new Artist();
			anArtist.setSourceClient(lineDataAsArray[0]);
			anArtist.setClientID(lineDataAsArray[1]);
			anArtist.setArtistID(lineDataAsArray[2]);
			anArtist.setTitle(lineDataAsArray[3]);
			anArtist.setFirstName(lineDataAsArray[4]);
			anArtist.setLastNamePrefix(lineDataAsArray[5]);
			anArtist.setArtistName(lineDataAsArray[6]);
			anArtist.setSearchInfo(lineDataAsArray[7]);
			anArtist.setActionCode(lineDataAsArray[8]);
			dateObj = formatter.parse(lineDataAsArray[9]);
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateObj);
			anArtist.setReceivedDate(cal);
			artistList.add(anArtist);
		}
		reader.close();
		return artistList.toString();
	}
}
