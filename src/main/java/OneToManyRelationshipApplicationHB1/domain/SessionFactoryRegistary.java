
package OneToManyRelationshipApplicationHB1.domain;

        import org.hibernate.SessionFactory;
        import org.hibernate.boot.registry.StandardServiceRegistry;
        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
        import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistary {
    private  static SessionFactory sessionFactory;
    static {
        try{
            Configuration configuration = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml");
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory =configuration.buildSessionFactory(registry);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static SessionFactory getSessionFactory(){

        return sessionFactory;
    }
    public static void closeSessionFactory(){
        if (sessionFactory!=null){
            sessionFactory.close();
        }
    }

}
