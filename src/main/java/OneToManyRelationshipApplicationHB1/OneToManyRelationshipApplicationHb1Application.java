package OneToManyRelationshipApplicationHB1;


import OneToManyRelationshipApplicationHB1.domain.Appoinment;
import OneToManyRelationshipApplicationHB1.domain.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class OneToManyRelationshipApplicationHb1Application {

	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Transaction transaction=null;
		Session session=null;
		boolean flag=false;
		Patient patient=null;
		Appoinment appoinment=null;
		List<Appoinment>appoinments=null;

		try{
			sessionFactory = OneToManyRelationshipApplicationHB1.domain.SessionFactoryRegistary.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction= session.beginTransaction();

			Patient p1 =new Patient();
			p1.setPatient_name("vijay");
			p1.setPatient_age(23);

			Appoinment ap =new Appoinment();
			ap.setDoctor_Name("Raj");
			ap.setAppoinment_Time("12:00");
			ap.setAppoinment_Date("26");
			session.save(ap);
			appoinments = new ArrayList<>();
			appoinments.add(ap);

			Appoinment ap1 =new Appoinment();
			ap1.setDoctor_Name("vijay");
			ap1.setAppoinment_Time("1:00");
			ap1.setAppoinment_Date("26");
			session.save(ap1);
			appoinments.add(ap1);

			p1.setAppoinments(appoinments);
			session.save(p1);

			flag=true;
		}finally {
			if(transaction!=null){
				if (flag){
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			OneToManyRelationshipApplicationHB1.domain.SessionFactoryRegistary.closeSessionFactory();
		}
	}

}
