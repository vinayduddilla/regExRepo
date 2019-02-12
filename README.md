# Regular Expressions rules
## Regular expressions seem hard enough to write but once, the knowledge is acquired no one can stop you.
## Below rules are used to create regular expressions

### General
- "."	    : Any Character Except New Line
- "\d"	  : Digit (0-9)
- "\D"	  : Not a Digit (0-9)
- "\w"	  : Word Character (a-z, A-Z, 0-9, _)
- "\W"	  : Not a word character
- "\s"	  : Whitespace (space, tab, newline)
- "\S"	  : Not a whitespace

### Anchors
- "\b"	  : Word boundary
- "\B"	  : not a Word boundary
- "^"	    : Beginning of a String
- "$"	    : End of a String

- "[]"	  : Matches Characters in Brackets
- "[^ ]"  : Matches Characters not in brackets
- "|"	    : Either Or
- "()"	  : Group  

### Quantifiers :
- "*"	    : 0 or more
- "+"	    : 1 or more
- "?"	    : 0 or one
- "{3}"	  : Exact number
- "{3,4}" : Range of numbers(Minimum, Maximum)
