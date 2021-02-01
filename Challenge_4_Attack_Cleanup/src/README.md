## Solution Notes:

main.java scored 80% but with the addition of line 6 this bumps it to 100%

## Challenge Details:

We've had a database breach, and some of our data has been altered - perhaps for mischievous reasons, perhaps for more practical reasons...



We have some data from back-ups matched with their altered values - can you use this to write a function that will restore any data that was added since the last back-up to it's correct state? We've populated some unit tests with the data for you.



Just something to be aware of - the original data is GCAT sequences - only containing letters: no numbers or other characters.



`cgtctcctgaccccagagcaggtcgtggcaatcgcgagcaataacggcggaaaacaggctttggaaacggtgcagaggctccttccagtgctgtgccaagcgcacggactcaccccagagcaggtcgtggcgatcgcaagccacgacggaggaaagcaagccttggaaacagtacagaggctgttgcctgtgctgtgccaagcgcacggcctcaccccagagcaggtcgtggcaatcgcctccaacattggcgggaaacaggcactcgagactgtccagcgcctgcttcccgtgctgtgccaagcgcacggattaaccccagagcaggtcgtggccattgcctcgaatggagggggcaaacaggcgttggaaaccgtacaacgattgctgccggtgctgtgccaagcgcacggcttaagagacg`

## Test Cases

Public | Successfully decodes genetic data 1

Public | Successfully decodes genetic data 2

6 Pts | Successfully decodes genetic data 3

5 Pts | Successfully decodes genetic data with no repeats

1 Pts | An empty input results in an empty output

3 Pts | Check that non alpha-numeric characters are stripped
