import io.qameta.allure.Step;
import org.testng.Assert;

public class TestsSteps extends CalculatorFunctional {
    @Step
    public static void checkSumStep(int num1, int num2, int expectedSum)
    {
        Assert.assertTrue( sum(num1, num2) == expectedSum, "Сумма слагаемых не соответствует ожидаемому значению");
    }
    @Step
    public static void checkSubStep(int num1, int num2, int expectedSub)
    {
        Assert.assertTrue(sub(num1, num2) == expectedSub, "Разница слагаемых не соответствует ожидаемому значению");
    }
    @Step
    public static void checkMulStep(int num1, int num2, int expectedMul)
    {
        Assert.assertTrue(mul(num1, num2) == expectedMul, "Произведение слагаемых не соответствует ожидаемому значению");
    }
    @Step
    public static void checkDivStep(int num1, int num2, int expectedDiv)
    {
        Assert.assertTrue(div(num1, num2) == expectedDiv, "Частное слагаемых не соответствует ожидаемому значению");
    }
}
