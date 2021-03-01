## Challenge Details:

If you are reading this, then you are the Resistance.

Multiple communications have filtered into Resistance HQ from several separate cells that suggest the enemy is moving a highly classified asset. Currently we cannot confirm the truth of these claims.

After an unsuccessful resistance counter-intelligence operation the enemy are aware we broke their previous code and have updated their encryption accordingly. Now every half hour a new key is set, rendering the previous cipher obsolete.

Worse still, the Resistance itself is now under threat.

This is a blanket message being sent on all channels to every cell known to be in operation – we need you to write us a program that can crack the new cipher.

What we know:

`*The new cipher has two components, a string and a cipher key.`

`*It returns a string in which each letter is shifted by the cipher key.`

`*Punctuation and spacing are not removed but are unaffected by the cipher.`

`*Numbers are not removed but are unaffected by the cipher.`

`*The case of each letter is maintained regardless of cipher applied.`

`*If the key was set to 5, a -> f, b -> g, u -> z, v -> a, w -> b, A -> F, B -> G and so on`

`*For example: given a string "Zwddg ogjdv!" and a cipher key of 8, the result would be "Hello world!"`

You now know everything that we do. Good luck, stay safe and remember:

If you are reading this, then you are the Resistance.

## Test Cases

Public | Check that a multi character input string, containing punctuation, is correctly shifted by the positive cipher key (8).

2 Pts | Check that an empty string input always returns an empty string.

1 Pts | Check that a cipher key of 0 always returns the input string.

1 Pts | Check that a cipher key of 1 is correctly applied.

1 Pts | Check that a positive cipher key, greater than 1 (5) is correctly applied.

1 Pts | Check that a negative cipher key (-5) is correctly applied.

2 Pts | Check that an input containing just punctuation is not modified.

2 Pts | Check that an input containing just numbers is not modified.

1 Pts | Check that the alphabet correctly cycles (forward) when the input contains letters at the end of the alphabet and a positive cipher key is supplied.

2 Pts | Check that the alphabet correctly cycles (forward) when the input contains letters at the beginning of the alphabet and a negative cipher key is supplied.