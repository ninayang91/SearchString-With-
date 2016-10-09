# SearchString-With-

Given a sorted String[] a with several "", find the index of a given string

Givenasortedarrayofstringswhichisinterspersedwithemptystrings,writea method to find the location of a given string.

EXAMPLE

Input: find "ball" in {"at", "", "", "", "ball", "", "", "car"}

Output: 4

Binary Search, if mid is "", find the non"" string from left or right
