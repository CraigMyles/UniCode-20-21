## Challenge Details:

Given a string representation of a bowling score card, calculate the numeric score of the score card.

The scoring information for a bowling score card is provided below:

`*Bowler is allowed a maximum of 10 frames.`

`*Each frame has 10 pins.`

`*Frames 1 - 9 consist of two balls (two attempts).`

`*Frame 10 can consist of three balls.`

`*If all pins are down using one ball, this is a strike (denoted by an X) and counts as 10 points.`

`*If all pins are down using two balls, this is a spare (denoted by a /) and counts as 10 points.`

`*In the event of a strike the next two balls' points are added to the strike score of 10.`

`*EG: bowling a strike, five and one results in scoring of (10+5+1), 5, 1).`

`*In the event of a spare the next one ball's points are added to the spare score of 10.`

`*EG: bowling a spare, five and one results in scoring of (10+5), 5, 1).`

`*In the event of a strike, additional attempts in that frame are not used.`

`*The maximum attainable score from any frame is 30 (three strikes in a row).`


The score card will be passed as an array of strings constituting 10 frames. The method should return an integer score.

For example, consider the following score card:

["9", "/", "7", "1", "X", "5", "1", "0", "7", "9", "0", "3", "6", "X", "3", "1", "9", "0"]

The total score in the above example is 99.

## Test Cases

Public | Solution returns the correct score for a scorecard that includes strikes, spares and normal scores.

1 Pts | Solution returns 0 for a zero score game.

2 Pts | Solution returns 300 for a perfect game (all strikes).

2 Pts | Solution correctly calculates the score for a scorecard which contains a spare immediately followed by a strike.

3 Pts | Solution correctly calculates the score for a scorecard which contains a spare immediately followed by another spare.

2 Pts | Solution correctly calculates the score for a scorecard which contains a strike immediately followed by another strike.

2 Pts | Solution correctly calculates the score for a scorecard which contains a strike immediately followed by two gutter balls (0 score).

2 Pts | Solution correctly calculates the score for a scorecard which contains a strike immediately followed by a gutter ball (0 score) and a normal score.

3 Pts | Solution correctly calculates the score for a scorecard which contains a spare immediately followed by a gutter ball (0 score).