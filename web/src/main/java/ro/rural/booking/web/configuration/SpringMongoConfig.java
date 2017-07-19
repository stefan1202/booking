//package ro.rural.booking.web.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//
//import com.mongodb.Mongo;
//import com.mongodb.MongoClient;
///**
// * Created by stefan.durla on 28/06/2017.
// */
//
//
//@Configuration
//public class SpringMongoConfig extends AbstractMongoConfiguration {
//
//    @Override
//    public String getDatabaseName() {
//        return "booking";
//    }
//
//    @Override
//    @Bean
//    public Mongo mongo() throws Exception {
//        return new MongoClient("mongodb://booking:bookingPassword@mongodb.test-project-stefand.svc:27017");
//    }
//}
