package AmusementPark.Vistor;

import java.util.ArrayList;

public class Visitor {
        private String name;
        private byte age;
        private ArrayList<String> ticket =new ArrayList<>();
        private Boolean access;
        public Visitor(String name) {
            this.name = name;
        }
        public Boolean getAccess() {
            return access;
        }
        public void setAccess(Boolean access) {
            this.access = access;
        }
        public String getName() {
            return name;
        }
        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            this.age = age;
        }
        public void addTicket(String ride){
            ticket.add(ride);
        }
        public ArrayList<String> getTickets(){
            return ticket;
        }
    }
