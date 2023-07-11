package GestioneEventi;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import GestioneEventiutils.JPAUtil;

public class GestioneEventi {
	private static EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		Evento evento1 = new Evento("Una festa tanto attesa", LocalDate.now(), "Compleanno Bilbo Baggins",
				TipoEvento.PUBBLICO, 1000);
		Evento evento2 = new Evento("Incoronazione", LocalDate.of(23, 5, 15), "Incoronazione Re Carlo III",
				TipoEvento.PUBBLICO, 10000);

		Evento evento3 = new Evento("Matrimonio", LocalDate.of(25, 9, 19), "Matrimonio di Sara e Matteo",
				TipoEvento.PRIVATO, 154);
		Evento evento4 = new Evento("Battesimo", LocalDate.of(23, 01, 15), "Battesimo di Sofia, figlia di Luca",
				TipoEvento.PRIVATO, 80);
		Evento evento5 = new Evento("Festa a sorpresa", LocalDate.of(23, 3, 21),
				"Festa a sorpresa per il compleanno di Ambrogio", TipoEvento.PRIVATO, 15);
		Evento evento6 = new Evento("Laurea", LocalDate.of(23, 9, 25), "Festa di Lurea di Erika", TipoEvento.PRIVATO,
				30);

		EventoDAO eD = new EventoDAO(em);

		// ********** SALVATAGGIO EVENTI **********
//		eD.save(evento1);
//		eD.save(evento2);
//		eD.save(evento3);
//		eD.save(evento4);
//		eD.save(evento5);
//		eD.save(evento6);

		// ********** TROVARE EVENTO DA ID **********

		// Evento eventoTrovato =
		// eD.getById(UUID.fromString("187cdc6c-7159-4ba4-853c-c9b4e005ddeb"));
		// System.out.println(eventoTrovato);

		// ********** ELIMINAZIONE EVENTO **********

		// eD.delete(UUID.fromString("c9cf980f-9244-4a9d-a8db-85552511e12d"));

		// ********** REFRESH EVENTO **********
		eD.refresh(UUID.fromString("b1413dd9-22ed-4f15-a11c-407c48836d80"));
		em.close();
		emf.close();

	}

}
