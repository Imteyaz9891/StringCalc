//3.Method will return their sum of numbers
[JAVA TEST]

@Test
public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
    Assert.assertEquals(3, StringCalculator.add("3"));
}
 
@Test
public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
    Assert.assertEquals(3+6, StringCalculator.add("3,6"));
}
[JAVA IMPLEMENTATION]

public static int add(final String numbers) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(",");
    if (numbersArray.length > 2) {
        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
    }
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) { // After refactoring
            returnValue += Integer.parseInt(number);
        }
    }
    return returnValue;
}