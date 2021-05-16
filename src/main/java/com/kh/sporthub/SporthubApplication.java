package com.kh.sporthub;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.kh.sporthub.models.Admins;
import com.kh.sporthub.models.Discipline;
import com.kh.sporthub.models.Players;
import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Staff;
import com.kh.sporthub.models.Supporters;
import com.kh.sporthub.models.Team;
import com.kh.sporthub.models.Ticket;
import com.kh.sporthub.repositories.AdminsRepository;
import com.kh.sporthub.repositories.DisciplineRepository;
import com.kh.sporthub.repositories.PlayersRepository;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.StaffRepository;
import com.kh.sporthub.repositories.SupportersRepository;
import com.kh.sporthub.repositories.TeamRepository;
import com.kh.sporthub.repositories.TicketRepository;





@SpringBootApplication
public class SporthubApplication  implements CommandLineRunner{

	
	// Users
	 	private final AdminsRepository adminsRepository;
	 	private final SupportersRepository supportersRepository;
	
	// Team Staff Players
	    private final TeamRepository teamRepository;
	    private final PlayersRepository playerRepository;
	    private final StaffRepository staffRepository;
	    
	// Stadium 
	    private final StadiumRepository stadiumRepository;
	    
	 // Ticket
	    private final TicketRepository ticketRepository;
	    
	    // Discipline
	    private final DisciplineRepository disciplineRepository;
	    
	
	@Autowired
	public SporthubApplication(AdminsRepository adminsRepository,SupportersRepository supportersRepository,
			TeamRepository teamRepository,PlayersRepository playerRepository,StaffRepository staffRepository,
			StadiumRepository stadiumRepository,TicketRepository ticketRepository,
			DisciplineRepository disciplineRepository) {
		
			// Users
			this.adminsRepository=adminsRepository;
			this.supportersRepository=supportersRepository;
		
			// Team Staff Players
		    this.teamRepository=teamRepository;
	        this.playerRepository=playerRepository;
	        this.staffRepository=staffRepository;
	        
	     // Stadium 
	        this.stadiumRepository=stadiumRepository;
		// Ticket 
	       this.ticketRepository=ticketRepository;
	       
	       // Discipline
	       this.disciplineRepository=disciplineRepository;
	
	}
	
	
	

	
	
	@Override
	public void run(String... args) throws Exception {
		
		// clear database
		
		System.out.println("==========Delete all Admins entities==========");
		//adminsRepository.deleteAll();
		System.out.println("==========Delete all Supporters entities==========");
		//supportersRepository.deleteAll();
		
		System.out.println("==========Delete all Team entities==========");
		teamRepository.deleteAll();
		//playerRepository.deleteAll();
		//staffRepository.deleteAll();
		stadiumRepository.deleteAll();
		ticketRepository.deleteAll();
		
		disciplineRepository.deleteAll();
		
		
		
		
		// save 
	
		
		System.out.println("==========Save list of Supporters entities==========");
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Stupido"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		
		
		System.out.println("==========Save list of team entities==========");
		teamRepository.save(new Team ("Manchester United","Red Devils", "1878, Newton Heath, Manchester, Royaume-Uni", "Glazers", "Premier League", "app-assets/img/photos/ManUnited.png"));
		teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png"));
		
		
		playerRepository.save(new Players ("Paul Pogba",26, "24/09/1998", "French", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg"));
		playerRepository.save(new Players ("Edi Cavani",34, "24/09/1998", "Uruguayan", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg"));
		playerRepository.save(new Players ("David De Gea",28, "24/09/1998", "Spanish", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg"));
		playerRepository.save(new Players ("Bilel Ifa",0, "24/09/1998", "Tunisia", "Male",6,"CMD", "CA","app-assets/img/photos/pog.jpg"));
		playerRepository.save(new Players ("Welid Eb3ath",99, "24/09/1998", "Tunisia", "Male",6,"CMD", "Manchester City","app-assets/img/photos/pog.jpg"));
		
		staffRepository.save(new Staff ("Ole Gunnar Solskjaer",48,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg"));
		staffRepository.save(new Staff ("Mustpha",48,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg"));
		staffRepository.save(new Staff ("Semir",48,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg"));
		staffRepository.save(new Staff ("X",48,  "February 26, 1973", "Norwegian","Male", "Manchester", "Manager","app-assets/img/photos/ole.jpeg"));
		
		
		
		stadiumRepository.save(new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg"));
		
		System.out.println("==========Save list of Admins entities==========");
		adminsRepository.save(new Admins  ("Med Kh","Kh11", "eb3ath_ye_welid@tsawar.ycom", "passwordxEnc", "app-assets/img/portrait/small/avatar-s-19.png", "Editor"));
		adminsRepository.save(new Admins  ("Imtinen","asq", "k@mail.com", "passwordxEnc", "app-assets/img/portrait/small/avatar-s-18.png", "Admin"));
		adminsRepository.save(new Admins  ("Welid","dd", "xx@mail.com", "passwordxEnc", "app-assets/img/portrait/small/avatar-s-17.png", "Controller"));
		System.out.println("==========Save Ticket of team entities==========");
		
		
	
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		ticketRepository.save(new Ticket ("#44809824", "United Vs City","Old Trafford","Virage",80.99));
		
		
		disciplineRepository.save(new Discipline ("Football"));
		disciplineRepository.save(new Discipline ("Handball"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SporthubApplication.class, args);
	}


}





