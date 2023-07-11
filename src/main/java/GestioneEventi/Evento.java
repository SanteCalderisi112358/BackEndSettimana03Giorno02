package GestioneEventi;


import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "titolo")
	private String titolo;
	@Column(name = "data_evento")
	private LocalDate dataEvento;
	@Column(name = "descrizione_evento")
	private String descrizione;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_evento")
	private TipoEvento tipoEvento;
	@Column(name = "numero_max_persone")
	private int numeroMassimoPartecipanti;

	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti) {

		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Evento() {

	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return " [Titolo=" + titolo + ", Data Evento=" + dataEvento + ", Descrizione=" + "'" + descrizione + "'"
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}


}
