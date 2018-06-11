package JCLVL2;

public class Team {
        private String name;
        Participant[] team = new Participant[4];

        public Participant[] getTeam() {
            return team;
        }

        public Team(String name, Participant participant1, Participant participant2, Participant participant3, Participant participant4) {
            this.name = name;
            this.team[0] = participant1;
            this.team[1] = participant2;
            this.team[2] = participant3;
            this.team[3] = participant4;
        }

        public void showResults() {
            for (Participant c : team) {
                if (c.isOnDistance()) {
                    System.out.println(c.getName() + " WIN");
                } else {
                    System.out.println(c.getName() + " LOSE");
                }
            }
        }
}
