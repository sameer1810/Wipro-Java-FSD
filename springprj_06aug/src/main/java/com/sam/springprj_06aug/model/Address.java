package com.sam.springprj_06aug.model;

public class Address {
	 private String area;
	    private String city;
	    private String country;
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "Address [area=" + area + ", city=" + city + ", country=" + country + "]";
		}
	    
	   
	}
