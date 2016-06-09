package com.appintegrators.training.corejava.vo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Artist implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sourceClient;
	private String clientID;
	private String artistID;
	private String title;
	private String firstName;
	private String lastNamePrefix;
	private String artistName;
	private String searchInfo;
	private String actionCode;
	private Calendar receivedDate;

	public Artist() {
		super();
	}

	public String getSourceClient() {
		return sourceClient;
	}

	public void setSourceClient(String sourceClient) {
		this.sourceClient = sourceClient;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getArtistID() {
		return artistID;
	}

	public void setArtistID(String artistID) {
		this.artistID = artistID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getSearchInfo() {
		return searchInfo;
	}

	public void setSearchInfo(String searchInfo) {
		this.searchInfo = searchInfo;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Date getReceivedDate() {
		return receivedDate.getTime();
	}

	public void setReceivedDate(Calendar receivedDate) {
		this.receivedDate = receivedDate;

	}

	public String getLastNamePrefix() {
		return lastNamePrefix;
	}

	public void setLastNamePrefix(String lastNamePrefix) {
		this.lastNamePrefix = lastNamePrefix;
	}

	@Override
	public String toString() {
		return "sourceClient=" + getSourceClient() + ", clientID="
				+ getClientID() + ", artistID=" + getArtistID() + ", title="
				+ getTitle() + ", firstName=" + getFirstName()
				+ ", lastNamePrefix=" + getLastNamePrefix() + ", artistName="
				+ getArtistName() + ", searchInfo=" + getSearchInfo()
				+ ", actionCode=" + getActionCode() + ", receivedDate="
				+ getReceivedDate();
	}

}
