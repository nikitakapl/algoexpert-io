import java.util.*;

// There's an algorithms tournament taking place in which teams of programmers
// compete against each other to solve algorithmic problems as fast as possible.
// Teams compete in a round robin, where each team faces off against all other
// teams. Only two teams compete against each other at a time, and for each
// competition, one team is designated the home team, while the other team is the
// away team. In each competition there's always one winner and one loser; there
// are no ties. A team receives 3 points if it wins and 0 points if it loses. The
// winner of the tournament is the team that receives the most amount of points.

class Program {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions,
                                   ArrayList<Integer> results) {

        HashMap<String, Integer> scores = new HashMap<>();
        for (int idx = 0; idx < competitions.size(); idx++) {
            int roundResult = results.get(idx);

            String homeTeam = competitions.get(idx).get(1);
            String awayTeam = competitions.get(idx).get(0);

            if (roundResult == 0) {
                updateWinnerScore(homeTeam, scores);
            } else {
                updateWinnerScore(awayTeam, scores);
            }
        }

        return Collections.max(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public void updateWinnerScore(String team, HashMap<String, Integer> scores) {
        scores.merge(new String (team), 3, (v1, v2) -> v1 + v2);
    }
}
