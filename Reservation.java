package JPAClass;

import java.util.Date;

public class Reservation {
	
		@Id @GeneratedValue
		private long id_Reservation;
		private Date date;
		private int numero;
		
		public Reservation(){
			
		}

		public long getId_Reservation() {
			return id_Reservation;
		}

		public void setId_Reservation(long id_Reservation) {
			this.id_Reservation = id_Reservation;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
}
