## Challenge Details:

In 410 A.D. The city of Rome was sacked and burned. A monk named Pelagius famously escaped the city and wrote an account of the event: In his writings he described the looting of the Roman capital by King Alaric.

It was written that Alaric took the treasures of ancient Rome and was buried with them following a sudden illness. No one has ever found Alaric's treasure… until now.

You have recently been contacted by someone claiming that they have a way to discover it's location. They have spent their life researching ancient texts and believe they have a 64,000 number sequence that will allow them to plot a map to the hidden fortune!

The only problem is that those 64,000 numbers are all written as roman numerals. They need someone with your skills to create a function that will convert numerals into modern integers:

`*Each set of numerals is expressed as a string.`

`*Each string will represent one number.`

`*The numerals are expressed with the most significant numeral first, and the value of each numeral is simply added together.`

`*For example: "LXXIII" is 50 + 10 + 10 + 1 + 1 + 1 = 73.`

`*Where a lower valued numeral appears before a higher valued numeral it is subtracted from that higher value.
For example: "IX" is 10 - 1 = 9.`


Roman numerals are:

`*M = 1000`

`*D = 500`

`*C = 100`

`*L = 50`

`*X = 10`

`*V = 5`

`*I = 1`


For example:

`*MMXV = 2015`

`*MCMLXI = 1961`


If you create this function, your new contact promises to split the treasure with you "L/L"!

Are you ready to start the hunt for Alaric's treasure?

## Test Cases:

Public | Check that prefixing M with C will decrement M by 100 so that MCMLXI results in 1961.

1 Pts | Check that V successfully maps to 5.

1 Pts | Check that the M, X and V characters map to 1000, 10 and 5 in the input string MMXV (2015).

2 Pts | Check that multiple M characters and the D character are handled.

2 Pts | Check that a multi character number (89) can be combined with CD (400).

3 Pts | Check that a large number with several prefix characters is handled.