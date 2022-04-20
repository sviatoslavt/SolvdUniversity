package com.solvd.Enums;

public enum Speciality {
        
        ECONOMY("economy"),
        MARKETING("marketing"),
        COMPUTER_SCIENCE("computer science"),
        POLITOLOGY("politology"),
        PHILOLOGY("philology");

        private final String value;

        Speciality(String value){
                this.value = value;
        }

        public String getValue(){
                return value;
        }
}
