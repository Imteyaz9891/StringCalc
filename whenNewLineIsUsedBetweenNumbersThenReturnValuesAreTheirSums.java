 //Allow the Add method to handle new lines between numbers (instead of commas).
//[JAVA TEST]

@Test
public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
    Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
}
//[JAVA IMPLEMENTATION]

public static int add(final String numbers) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(",|n"); // Added |n to the split regex
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
    return returnValue;
}