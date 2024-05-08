package examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    /*
    1. Quickly add a test.
    2. Run all tests and see the new one fail.
     */
    /*
    Multiply Amount function:
    there is not Dollar class and methods and variables
    we only wrote test
     */
    /*
     we’ll work on multiplication first.
     So, what object do we need first? Trick question.
     We don’t start with objects, we start with tests.

     */
    /*
    We have a failing test, and we want the bar to go to green as quickly as possible.
     */
    /*
    We have four compile errors:
    • No class Dollar
    • No constructor
    • No method times(int)
    • No field amount
     */
    /*
    TDD nin sonraki adimlari:

    3. Make a little change.
    4. Run all tests and see them all succeed.
     */
    /*
    We can get rid of one error by defining the class Dollar:
     One error down, three errors to go.
     Now we need the constructor, but it doesn’t have to do anything just to get the test to compile:
     Dollar Dollar(int amount) { } Two errors to go.
     We need a stub implementation of times(). Again we’ll do the least work possible j
     ust to get the test to compile:
     Dollar void times(int multiplier) { } Down to one error.
     Finally, we need an amount field:
      Dollar int amount;
      Bingo! Now we can run the test and watch it fail,
     */
    /*
    You are seeing the dreaded red bar.
     */

    @Test
    public void multiply(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
    /*
    although we expected “10” as a result, instead we saw “0”.
    Sadness. No, no. Failure is progress.
    Now we have a concrete measure of failure.
    That’s better than just vaguely knowing we are failing.
    Our programming problem has been transformed
                from “give me multi-currency”
                to “make this test work,
                and then make the rest of the tests work.”
    Much simpler.
     */
    /*
    but the goal right now is not to get the perfect answer
    but to pass the test. We’ll make our sacrifice at the altar of truth and beauty later.

     */
    /*
    Here’s the smallest change I could imagine that would cause our test to pass:
    Dollar int amount= 10;
    Figure 1.2 shows the result when the test is run again.
    Now we get the green bar, fabled in song and story

     */


}
