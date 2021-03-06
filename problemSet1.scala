/* Problem Definition: - Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000. */


/* Solution : - */
val r = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
