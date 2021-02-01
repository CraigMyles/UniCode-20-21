## Solution Notes:

main.java scores 58%

main2.java scores 87% - read //comments for explanation

main3.java scores 100% - read //comments for explanation

## Challenge Details:

Yo ho - 'tis the season to be jolly!



My elves are having trouble keeping track of all the naughty and nice people on social media. I'm told you coder types can make their lives easier!



Can you help them identify the recipients in social media posts?

`* Recipients are identified by preceding their username with the '@' symbol`

`* Usernames can contain letters, numbers, underscores and hyphens`

`* Any character which is not a valid username character will separate the recipients from the rest of the message`


If we pass your code the message and a number, can you return the username it represents?



My elves tell me they want something like this:



`var message = "@Santa I've been good this year, can I get a PS5 like @Userxyz?";`

`GetRecipient(message,1)="Santa";`

`GetRecipient(message, 2)="Userxyz";`

`GetRecipient(message, 3)="";`


Remember there may be other @ symbols floating around in all the messages, for all sorts of reasons!



I'll make sure you go on the good list for this one.



S.C.

## Test Cases

Public | Can successfully identify the user in a single recipient message.

Public | Can successfully identify the second user in a two recipient message.

1 Pts | Can successfully identify the third user in a three recipient message.

1 Pts | When an invalid character exists within a username, just the valid part of the username should be detected.

1 Pts | Can successfully handle an out of bounds recipientNumber parameter.

1 Pts | Can successfully identify users in a message containing hashtags.

1 Pts | Can successfully identify an unconventional username.

1 Pts | Can successfully identify a username containing numbers.

1 Pts | Can successfully identify a username containing numbers and special characters.

1 Pts | Can successfully identify a username after a URL.

1 Pts | Can handle an input with no valid recipients.

1 Pts | Can handle usernames with a superfluous @ identifier.

1 Pts | Can handle an input containing a '@' character and not treat it as a username.

2 Pts | Can handle an input containing a valid email address and not treat it is a username.

2 Pts | Can handle an input containing an invalid email address and apply the standard username identification rules to the value.
