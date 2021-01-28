package model;

import java.sql.Date;

public class Booking {
	
		  private String name;
		  private String mobile;
		  private Date date;
		  private String seatno;

		  public Booking(){
		    // TODO Auto-generated constructor stub
		  }

		  

		  public Booking(String name, String mobile, Date date, String seatno) {
			super();
			this.name = name;
			this.mobile = mobile;
			this.date = date;
			this.seatno = seatno;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getMobile() {
			return mobile;
		}



		public void setMobile(String mobile) {
			this.mobile = mobile;
		}



		public Date getDate() {
			return date;
		}



		public void setDate(Date date) {
			this.date = date;
		}



		public String getSeatno() {
			return seatno;
		}



		public void setSeatno(String seatno) {
			this.seatno = seatno;
		}



		@Override
		public String toString() {
			return "Booking [name=" + name + ", mobile=" + mobile + ", date=" + date + ", seatno=" + seatno + "]";
		}



		
}
