package com.kh.sporthub;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kh.sporthub.models.Admins;
import com.kh.sporthub.models.Discipline;
import com.kh.sporthub.models.News;
import com.kh.sporthub.models.Players;
import com.kh.sporthub.models.Role;
import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Staff;
import com.kh.sporthub.models.Supporters;
import com.kh.sporthub.models.Team;
import com.kh.sporthub.models.Ticket;
import com.kh.sporthub.repositories.AdminsRepository;
import com.kh.sporthub.repositories.DisciplineRepository;
import com.kh.sporthub.repositories.NewsRepository;
import com.kh.sporthub.repositories.PlayersRepository;
import com.kh.sporthub.repositories.RoleRepository;
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

	    // NEWS 
	    private final NewsRepository newsRepository;
	    
	
	@Autowired
	public SporthubApplication(AdminsRepository adminsRepository,SupportersRepository supportersRepository,
			TeamRepository teamRepository,PlayersRepository playerRepository,StaffRepository staffRepository,
			StadiumRepository stadiumRepository,TicketRepository ticketRepository,
			DisciplineRepository disciplineRepository, NewsRepository newsRepository) {
		
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
	       
	    // news
	       this.newsRepository=newsRepository;
	       
	       
	
	}
	
	
	

	
	
	@Override
	public void run(String... args) throws Exception {
		
		// clear database
		
		System.out.println("==========Delete all Admins entities==========");
		//adminsRepository.deleteAll();
		System.out.println("==========Delete all Supporters entities==========");
		//supportersRepository.deleteAll();
		
		System.out.println("==========Delete all Team entities==========");
		//teamRepository.deleteAll();
		//playerRepository.deleteAll();
		//staffRepository.deleteAll();
		//stadiumRepository.deleteAll();
		//newsRepository.deleteAll();
		
		//ticketRepository.deleteAll();
		
		//disciplineRepository.deleteAll();
		
		
		
		
		// save 
	
		
		System.out.println("==========Save list of Supporters entities==========");
		//supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Super Fan"));
		//supportersRepository.save(new Supporters  ("Med Kh","tyukyukyukyuj", "kh@kh.xcom", "need to encrypt this shit", "app-assets/img/supporters/med.png", "Stupido"));
		
		
		System.out.println("==========Save list of team entities==========");
		//teamRepository.save(new Team ("Manchester United","Red Devils", "1878, Newton Heath, Manchester, Royaume-Uni", "Glazers", "Premier League", "app-assets/img/teams/ManUnited.png","football"));
		//teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png","handball"));
		//teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png","handball"));
		//teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png","football"));
		//teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png","football"));
		//teamRepository.save(new Team ("Manchester City","The Citizens", "16 April 1894", "Tamim bin Hamad Al Thani", "Premier League", "app-assets/img/photos/city.png","football"));
		
		
		//playerRepository.save(new Players ("Paul Pogba",26, "24/09/1998", "French", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg","football"));
		//playerRepository.save(new Players ("Paul Pogba",26, "24/09/1998", "French", "Male",6,"CMD", "Manchester city","app-assets/img/photos/pog.jpg","football"));
		//playerRepository.save(new Players ("Paul Pogba",26, "24/09/1998", "French", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg","football"));
		//playerRepository.save(new Players ("Paul Pogba",26, "24/09/1998", "French", "Male",6,"CMD", "Manchester United","app-assets/img/photos/pog.jpg","handball"));
		//playerRepository.save(new Players ("Paul x",26, "24/09/1998", "tt", "Male",6,"CMD", "Manchester city","app-assets/img/photos/pog.jpg","handball"));
		
		//staffRepository.save(new Staff ("Ole Gunnar Solskjaer",48,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg","football"));
		//staffRepository.save(new Staff ("Jose Mourinho",488,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg","football"));
		//staffRepository.save(new Staff ("Welid",888,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg","football"));
		//staffRepository.save(new Staff ("Mustpha",999,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg","handball"));
		//staffRepository.save(new Staff ("Mondher S8ayer",9,  "February 26, 1973", "Norwegian","Male", "Manchester United", "Manager","app-assets/img/photos/ole.jpeg","handball"));
		
		//stadiumRepository.save(new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/stades/Old Trafford.png","football"));
		//stadiumRepository.save(new Stadium ("Old Trafford","Manchester",100000, "Manchester City","app-assets/img/Old Trafford.png","football"));
		//stadiumRepository.save(new Stadium ("Old Trafford","Manchester",300000, "Manchester City","app-assets/img/Old Trafford.png","football"));
		//stadiumRepository.save(new Stadium ("Old Trafford","Manchester",200, "Manchester City","app-assets/img/Old Trafford.png","football"));
		
		
		//Stadium b = (new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/stades/Old Trafford.jpg"));
		//Stadium x = (new Stadium ("Rades","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg"));
		
		// stadiumRepository.save(b);
		// stadiumRepository.save(x);
		System.out.println("==========Save list of Admins entities==========");
		//adminsRepository.save(new Admins  ("Med Kh","Kh11", "eb3ath_ye_welid@tsawar.ycom", "passwordxEnc", "app-assets/img/portrait/small/avatar-s-19.png", "Editor"));
		
		System.out.println("==========Save Ticket of team entities==========");
		

		//Ticket a = (new Ticket ("Manchester United VS PSG", "Old Trafford","Virage",80.99)) ;
		//Ticket y = (new Ticket ("Tunisia VS Algeria", "Rades","Virage",10)) ;
		//a.setStade(Arrays.asList(b,x)) ;
		
		//ticketRepository.save(a);
		//ticketRepository.save(y);
		
	
		//ticketRepository.save(new Ticket ("#VRGG", "Old Trafford","Virage",80.99, new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg") ));
		
			//ticketRepository.save(new Ticket ("#VRGG", "Old Trafford","Virage",80.99, new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg") ));
		
		// ticketRepository.save(new Ticket ("#XX00", "United Vs PSG","Old Trafford","Pelouse",80.99));
		// ticketRepository.save(new Ticket ("#XX00", "United Vs City","Old Trafford","Pelouse",80.99));
		// ticketRepository.save(new Ticket ("#XX00", "United Vs Tunisia","Old Trafford","Pelouse",80.99));
		
		// ticketRepository.save(new Ticket ("#YYINF", "United Vs Tunisia","Old Trafford","Enceinte Inf",80.99));
		// ticketRepository.save(new Ticket ("#YYINF", "United Vs City","Old Trafford","Enceinte Inf",80.99));
		// ticketRepository.save(new Ticket ("#YYINF", "United Vs Tunisia","Old Trafford","Enceinte Inf",80.99));
		
		// ticketRepository.save(new Ticket ("#ZZSUP", "United Vs City","Old Trafford","Enceinte Sup",80.99));
		
		// ticketRepository.save(new Ticket ("#ZZSUP", "United Vs PSG","Old Trafford","Enceinte Sup",80.99));
		// ticketRepository.save(new Ticket ("#ZZSUP", "United Vs PSG","Old Trafford","Enceinte Sup",80.99));
		
		// ticketRepository.save(new Ticket ("#LLOO", "United Vs Tunisia","Old Trafford","Loge",80.99));
		// ticketRepository.save(new Ticket ("#LLOO", "United Vs City","Old Trafford","Loge",80.99));
		
		
		// disciplineRepository.save(new Discipline ("Football"));
		// disciplineRepository.save(new Discipline ("Handball"));
		
	// newsRepository.save(new News ("QUEL EST LE JOUEUR LE PLUS RAPIDE DE UNITED ?",
										//"parJeudi 10 juin 2021 18h34ShareWithTwitter ShareWithFacebook \r\n"
									//	+ "L'un des principaux attributs de l'équipe de Manchester United d'Ole Gunnar Solskjaer est sa vitesse fulgurante en attaque, définie par un groupe de jeunes attaquants rapides.",
										
					//	"22/06/2021","app-assets/img/Old Trafford.png","football"));


	
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SporthubApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {

	    return args -> {

	        Role adminRole = roleRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole("ADMIN");
	            roleRepository.save(newAdminRole);
	        }

	        Role userRole = roleRepository.findByRole("USER");
	        if (userRole == null) {
	            Role newUserRole = new Role();
	            newUserRole.setRole("USER");
	            roleRepository.save(newUserRole);
	        }
	        
	        Role editorRole = roleRepository.findByRole("EDITOR");
	        if (editorRole == null) {
	            Role newEditorRole = new Role();
	            newEditorRole.setRole("EDITOR");
	            roleRepository.save(newEditorRole);
	        }
	        
	    };

	}


}





