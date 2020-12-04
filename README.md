# Assignment 22

In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.

The reverse complement of a DNA string *s* is the string s<sup>c</sup> formed by reversing the symbols of *s*, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC" because As and Ts swap and Gs and Cs swap).

Write a program that takes a String as input, and puts the reverse compliment in a new `String`. Then print the reverse compliment strand.

## Specifications

One class is fine, but create a separate method besides `main`.

## Hints

One way to approach this is to start at the end of the given strand and work your way to the front. As you do that, take each symbol and add the complement of it to the new string. When your loop finishes (reaches the front) your new string should be the reverse complement of the original strand.

### Sample Outputs

```
Enter the DNA strand: AAAACCCGGT

The reverse compliment is ACCGGGTTTT
```

```
Enter the DNA strand: GCTTCGAGTATTGCAGGC

The reverse compliment is GCCTGCAATACTCGAAGC
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

