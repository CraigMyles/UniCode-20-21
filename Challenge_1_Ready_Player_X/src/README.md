## Challenge Details

It's 2045. Halliday is gone. Every living soul in the OASIS is looking for the Easter egg - the key to Halliday's fortune.

We've found something, a few snippets of deciphered text. Is this enough for you to break his cipher?

Message 1:

`Halliday("Crystal Key") == "Pelfgny Xrl"`


Message 2

`Halliday("Orb of Osuvox") == "Beo bs Bfhibk"`


We managed to get a few fragments of some other messages... we'll need the cipher to work on messages with the characters we can see in them, even though we can't get all of their content...

We marked the missing characters with *



Fragment 1:

`*l**day("ro** 237") == "eb** 237"`


Fragment 2:

`*day("An**ak? $ mil**ons?!") == "Nabenx? $ zvyyvbaf?!"`


Fragment 3:

`**"+- the_distracted_globe -+") == "+- gur_qvfgenpgrq_ty******"`

## Test Cases

Public | Encrypts Message 1

Public | Encrypts Message 2

2 Pts | Can encrypt messages in lower case

2 Pts | Can encrypt messages in mixed case

2 Pts | Can reverse itself.

3 Pts | Handles Fragment 1

3 Pts | Handles Fragment 2

3 Pts | Handles Fragment 3
