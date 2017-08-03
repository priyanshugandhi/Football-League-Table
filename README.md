# Football-League-Table
A Software which forms the Points Table on the basis of matches played.

Football League Table

Statement :

All major football leagues have big league tables. Whenever a new match is played, the league table is updated to show the current rankings (based on Scores, Goals For (GF), Goals Against (GA)). Given the results of a few matches among teams, write a program to print all the names of the teams in ascending order (Leader at the top and Laggard at the bottom) based on their rankings.

Rules: :

1. A win results in 2 points, a draw results in 1 point and a loss is worth 0 points.
2. The team with most goals in a match wins the match.
3. Goal Difference (GD) is calculated as Goals For (GF) - Goals Against (GA).
4. Teams can play maximum of two matches against each other - Home and Away matches respectively

Ranking is decided as follows:

1. Team with maximum points is ranked 1 and minimum points is placed last
2. Ties are broken as follows
3. Teams with same points are ranked according to Goal Difference(GD).
4. If Goal Difference(GD) is same, then team with higher Goals For is ranked ahead
5. If GF are same, the teams should be at the same rank but they should be printed in case-insensitive alphabetic according of the team      names.
6. More than 2 matches of same teams, should be considered as Invalid Input
7. A team can't play matches against itself, hence if team names are same for a given match, it should be considered Invalid Input





Example:

Consider 5 teams Spain, England, France, Italy and Germany with the following fixtures:

Match 1: Spain vs. England (3-0)
(Spain gets 2 points, England gets 0)

Match 2: England vs. France (1-1)
(England gets 1 point, France gets 1)

Match 3: Spain vs. France (0-2)
(Spain gets 0 points, France gets 2)


Since, Italy and Germany are tied for points, goals difference is checked. Both have same, so, Goals For is checked. Since both are same. Germany and Italy share the 4th rank. Since Germany appears alphabetically before Italy, Germany should be printed before Italy.
