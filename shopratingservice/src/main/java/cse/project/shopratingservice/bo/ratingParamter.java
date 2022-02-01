package cse.project.shopratingservice.bo;

import java.time.OffsetDateTime;

public class ratingParamter {
	
	private long id;
	private long ratingId;
	private OffsetDateTime ratingTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRatingId() {
		return ratingId;
	}
	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}
	public OffsetDateTime getRatingTime() {
		return ratingTime;
	}
	public void setRatingTime(OffsetDateTime ratingTime) {
		this.ratingTime = ratingTime;
	}
}
