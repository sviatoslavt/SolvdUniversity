package com.company.Enums;

public enum Specialty {
        ECONOMY("economy"),
        MARKETING("marketing"),
        COMPUTER_SCIENCE("computer science"),
        POLITOLOGY("politology"),
        PHILOLOGY("philology");

        private final String value;

        Specialty(String value){
                this.value = value;
        }

        public String getValue(){
                return value;
        }
}
