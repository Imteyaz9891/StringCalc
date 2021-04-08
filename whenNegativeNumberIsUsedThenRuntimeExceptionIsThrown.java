 //Negative numbers will throw an exception


//[JAVA TEST]

@Test(expected = RuntimeException.class)
public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
    StringCalculator.add("3,-6,15,18,46,33");
}
@Test
public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
    RuntimeException exception = null;
    try {
        StringCalculator.add("3,-6,15,-18,46,33");
    } catch (RuntimeException e) {
        exception = e;
    }
    Assert.assertNotNull(exception);
    Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
}

//[JAVA IMPLEMENTATION]

private static int add(final String numbers, final String delimiter) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(delimiter);
    List negativeNumbers = new ArrayList();
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            int numberInt = Integer.parseInt(number.trim());
            if (numberInt < 0) {
                negativeNumbers.add(numberInt);
            }
            returnValue += numberInt;
        }
    }
    if (negativeNumbers.size() > 0) {
        throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
    }
    return returnValue;     
}
