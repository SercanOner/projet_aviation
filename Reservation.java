package JPAClass;

import java.util.Date;

public class Reservation {
	
		private Long id_Reservation;
		private Date date;
		private int numero;
		
		public Reservation(){
			
		}

		public Long getId_Reservation() {
			return id_Reservation;
		}

		public void setId_Reservation(Long id_Reservation) {
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
