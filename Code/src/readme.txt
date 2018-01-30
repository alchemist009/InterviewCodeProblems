For this problem I am assuming the users will enter phone numbers in one of the following formats for a local US number:

(123)456-7890
1234567890
(123)-456-7890

Any other characters apart from these are considered invalid and the program returns a null value for them.

The entered phone number is first validated through the checkValid method which allows only digits, brackets, and dashes while ignoring alphabets, spaces and special symbols.

After validation, the makeNumber method is called to build a phone number string in the E164 format. I am using a string builder along with character arrays for more efficiency as creating a new string for each digit addition is not a good practice. At this time the characters except the digits are ignored and the digits are appended to the string builder. Finally, a check is performed on the lenght of the string to bound it to 13 characters after addition of '+1 ' for the US CC.

The E164 format implemented in the program is:

+1 1234567890


