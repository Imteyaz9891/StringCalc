 //Allow the Add method to handle an unknown amount of numbers
//[JAVA TEST]
//  @Test(expected = RuntimeException.class)
//  public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//      StringCalculator.add("1,2,3");
//  }
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }
//[JAVA IMPLEMENTATION]

public static int add(final String numbers) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(",");
    // Removed after exception
    // if (numbersArray.length > 2) {
    // throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
    // }
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) { // After refactoring
            returnValue += Integer.parseInt(number);
        }
    } 
    return returnValue;
}