//package com.practise;
//
//public class DummySessionFactory {
//
//	try {
//        // Create the SessionFactory from hibernate.cfg.xml
//    	Configuration configuration = new Configuration();
//    	configuration.configure("hibernate-annotation.cfg.xml");
//    	System.out.println("Hibernate Annotation Configuration loaded");
//    	
//    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//    	System.out.println("Hibernate Annotation serviceRegistry created");
//    	
//    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//    	
//        return sessionFactory;
//    }
//    catch (Throwable ex) {
//        // Make sure you log the exception, as it might be swallowed
//        System.err.println("Initial SessionFactory creation failed." + ex);
//        throw new ExceptionInInitializerError(ex);
//    }
//}
