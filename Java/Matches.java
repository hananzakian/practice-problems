// https://leetcode.com/problems/count-of-matches-in-tournament
public class Matches {
    public static void main(String[] args) {

        System.out.println(numberOfMatches(7));

    }
    public static int numberOfMatches(int team) {

        int match;
        int winner;
        int tot_match = 0;

        while (team > 1) {
            match = team/2;
            tot_match += match;
            winner = match + (team % 2);
            team = winner;
        }

        return tot_match;
    }
}
