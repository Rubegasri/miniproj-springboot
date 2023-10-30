package com.travel1.travel1.Model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "coffee")
    public class User {
         @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private long id;
        private String Name;
        private String emailid;
        private String phoneno;
        private String coffe; 
        private String delivery; 
        private String date; 
        private String toppings;
    }
    


