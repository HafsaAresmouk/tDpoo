package TD2;


class Temps {
        int heure;
        int minute;
        int seconde;
        public Temps(){
            this.heure=0;
            this.minute=0;
            this.seconde=0;

        }
        public Temps(int heure){
            this.heure=heure;
            this.minute=0;
            this.seconde=0;

        }
        public Temps(int heure,int seconde){
            this.heure=heure;
            this.minute=0;
            this.seconde=seconde;

        }
        public Temps(int heure,int minute,int seconde){
            this.heure=heure;
            this.minute=minute;
            this.seconde=seconde;

        }

        public int getHeure() {
            return heure;
        }

        public void setHeure(int heure) {
            if((heure>=0)||(heure<=23)) this.heure = heure;
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            if((minute>=0)||(minute<=59)) this.minute = minute;
        }

        public int getSeconde() {
            return seconde;
        }

        public void setSeconde(int seconde) {
            if((seconde>=0)||(seconde<=59)) this.seconde = seconde;
        }

    }


