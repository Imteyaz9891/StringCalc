//2: For an empty string the method will return 0
//[JAVA TEST]
@Test
public final void whenEmptyStringIsUsedThenReturnValueIs0() {
    Assert.assertEquals(0, StringCalculator.add(""));
}
//[JAVA IMPLEMENTATION]

public static final int add(final String numbers) { // Changed void to int
    String[] numbersArray = numbers.split(",");
    if (numbersArray.length > 2) {
        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
    } else {
        for (String number : numbersArray) {
            if (!number.isEmpty()) {
                Integer.parseInt(number);
            }
        }
    }
    return 0; // Added return
}