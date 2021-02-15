package com.server.springbootauth0postgres.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listingsandreviews")
public class ListingsAndReviews {
    private long id;
    private String listing_url;
    private String name;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maxiumum_nights;
    private String cancellation_policy;
    private String last_scraped;
    private String calendar_last_scraped;
    private String first_review;
    private String last_review;
    private Integer accomodates;
    private Integer bedrooms;
    private Integer beds;
    private Integer number_of_reviews;
    private String bathrooms;
    private String price;
    private String amenities;
    private String security_deposit;
    private String cleaning_fee;
    private String extra_people;
    private Integer guests_included;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getListing_url() {
		return listing_url;
	}
	public void setListing_url(String listing_url) {
		this.listing_url = listing_url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNeighborhood_overview() {
		return neighborhood_overview;
	}
	public void setNeighborhood_overview(String neighborhood_overview) {
		this.neighborhood_overview = neighborhood_overview;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getTransit() {
		return transit;
	}
	public void setTransit(String transit) {
		this.transit = transit;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getInteraction() {
		return interaction;
	}
	public void setInteraction(String interaction) {
		this.interaction = interaction;
	}
	public String getHouse_rules() {
		return house_rules;
	}
	public void setHouse_rules(String house_rules) {
		this.house_rules = house_rules;
	}
	public String getProperty_type() {
		return property_type;
	}
	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getBed_type() {
		return bed_type;
	}
	public void setBed_type(String bed_type) {
		this.bed_type = bed_type;
	}
	public String getMinimum_nights() {
		return minimum_nights;
	}
	public void setMinimum_nights(String minimum_nights) {
		this.minimum_nights = minimum_nights;
	}
	public String getMaxiumum_nights() {
		return maxiumum_nights;
	}
	public void setMaxiumum_nights(String maxiumum_nights) {
		this.maxiumum_nights = maxiumum_nights;
	}
	public String getCancellation_policy() {
		return cancellation_policy;
	}
	public void setCancellation_policy(String cancellation_policy) {
		this.cancellation_policy = cancellation_policy;
	}
	public String getLast_scraped() {
		return last_scraped;
	}
	public void setLast_scraped(String last_scraped) {
		this.last_scraped = last_scraped;
	}
	public String getCalendar_last_scraped() {
		return calendar_last_scraped;
	}
	public void setCalendar_last_scraped(String calendar_last_scraped) {
		this.calendar_last_scraped = calendar_last_scraped;
	}
	public String getFirst_review() {
		return first_review;
	}
	public void setFirst_review(String first_review) {
		this.first_review = first_review;
	}
	public String getLast_review() {
		return last_review;
	}
	public void setLast_review(String last_review) {
		this.last_review = last_review;
	}
	public Integer getAccomodates() {
		return accomodates;
	}
	public void setAccomodates(Integer accomodates) {
		this.accomodates = accomodates;
	}
	public Integer getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}
	public Integer getBeds() {
		return beds;
	}
	public void setBeds(Integer beds) {
		this.beds = beds;
	}
	public Integer getNumber_of_reviews() {
		return number_of_reviews;
	}
	public void setNumber_of_reviews(Integer number_of_reviews) {
		this.number_of_reviews = number_of_reviews;
	}
	public String getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getSecurity_deposit() {
		return security_deposit;
	}
	public void setSecurity_deposit(String security_deposit) {
		this.security_deposit = security_deposit;
	}
	public String getCleaning_fee() {
		return cleaning_fee;
	}
	public void setCleaning_fee(String cleaning_fee) {
		this.cleaning_fee = cleaning_fee;
	}
	public String getExtra_people() {
		return extra_people;
	}
	public void setExtra_people(String extra_people) {
		this.extra_people = extra_people;
	}
	public Integer getGuests_included() {
		return guests_included;
	}
	public void setGuests_included(Integer guests_included) {
		this.guests_included = guests_included;
	}
}