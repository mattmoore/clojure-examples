## Description
Write a console application that counts the frequencies of words that appear in a text document.

## Input
Your application should accept a single command-line argument containing the path of the text file.

Example:
```
$ lein run 7oldsamr.txt
```

## Output
Your application should produce a list of words and their frequencies _sorted in reverse numerical order_.

Example:
```
36 the
18 and
14 to
12 a
10 in
10 of
10 old
10 they
7 for
7 you
6 it
6 raiko
6 robbers
6 samurai
6 seven
...
```

In case of ties, any ordering is fine as long as it is deterministic (so that you can write proper tests!) To simplify things you may consider uppercase letters indistinguishable from lowercase letters.
