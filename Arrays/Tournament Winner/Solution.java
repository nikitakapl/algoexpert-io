import java.util.*;

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
        if (!scores.containsKey(team)) {
            scores.put(team, 3);
        } else {
            scores.put(team, scores.get(team) + 3);
        }
    }
}